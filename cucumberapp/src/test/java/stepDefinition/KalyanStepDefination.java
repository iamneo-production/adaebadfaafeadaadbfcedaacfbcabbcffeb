package stepDefinition;
import java.net.MalformedURLException;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.JavascriptExecutor;
import io.cucumber.java.en.*;
import pageObject.Booking;
import pageObject.BookCarlisting;
import pageObject.RegUsers;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
import io.cucumber.java.After;

public class KalyanStepDefination {
	public WebDriver driver = null;
	public Booking booking;
	public BookCarlisting carlisting;
	public RegUsers regusers;
	
	@After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() throws MalformedURLException {
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-dev-shm-usage");
		driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
		driver.manage().window().maximize();
		booking = new Booking(driver);
		carlisting = new BookCarlisting(driver);
		regusers = new RegUsers(driver);
		System.out.println("User Succesfully launched Chrome Browser");
	}
	
	
	@When("User Opens url {string}")
	public void user_opens_url(String url) {
		//Here driver opens the Car Rental Website
		driver.get(url);
		
	    //Here We are checking Website Interface is launched or not
		WebElement Interface=  driver.findElement(By.xpath("//img[@alt='image']"));
		if(Interface.isDisplayed())
		 {
			System.out.println("Car Rental Website Succesfully Launched");
			
		}
		else {
			System.out.println("Website is not opened");
		}
        
	}
	
	@Then("User Navigates to Admin Login Page")
	public void user_navigates_to_admin_login_page() {
		//Navigating to Admin Login Page
	    booking.adminbuttonclick();
	}
	
	@Then("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String userid, String passwordid)  {
		//Here admin gives userid and password in LoginPage 
		booking.setUserid(userid);
		booking.setPasswordid(passwordid);
	}
	
	@Then("User clicks on Login Option")
	public void user_clicks_on_login_option() {
	    booking.ClickLoginButton();
	}
	
	@Then("User able to see admin page successfully")
	public void user_able_to_see_admin_page_successfully()  {
		
		//Here we are Verifying Admin INterface
		String title = "Car Rental Portal | Admin Panel";
		String actualtitle = booking.AdminInterface();
		
        if (title.equals(actualtitle)) {
        	System.out.println("Successfully Login Page Opened");
        } else {
        	System.out.println("Successfully Login Page Not Opened");
        }
	}
	
	@Then("User clicks on Bookings Option and verify its Categorieslist")
	public void user_clicks_on_bookings_option_and_verify_its_categorieslist() {
		//Here we are clicking on Admin Booking Option
        booking.ClickBookingButton();
	    
	    //Here we are Verifying the Categories list of Bookings
	    booking.VerifyCategoriesList();
	}

	@When("User Clicks on New Option and Verify Interface")
	public void user_clicks_on_new_option_and_verify_interface() {
		//Here we are clicking on New in Bookings option
		
		 booking.NewClick();
		 
		//Here we are Verifying New Bookings Interface
		
		 booking.NewBookingInterface();
		
	 WebElement sno1 = driver.findElement(By.xpath("//td[text()='1']"));
		if(sno1.isDisplayed()) {
			System.out.println("New Bookings details are present");
		}
		else {
			System.out.println("New Bookings Details are empty");
		}
	}

    
    @Then("User Clicks on Show drop down list and verify it")
    public void User_Clicks_on_Show_drop_down_list_and_verify_it() {
    	//Here we  are verifying show Dropdown list  	
    	booking.ShowDisplay();
    	
       //Verify within Selected No Entries displayed or not
    	booking.SelectShowEntry();
    	booking.ShoworSearchOutput();
    	}
    
    @Then("User Verify PREVIOUS and NEXT buttons of Bookings")
    public void user_verify_previous_and_next_buttons_of_bookings() {
    	//Here we are checking Next and previous buttons are active or not
    	 WebElement button1 = driver.findElement(By.id("zctb_paginate"));
         String button2 = button1.getText();
         if(button2.contains("2")){
     		 booking.ClickNextButton();
             booking.ClickPreviousButton();            
             System.out.println("Next and Previous buttons are active");            
           }
     	
         else {
       		System.out.println("Next and Previous are disabled due to less/equal no of details present of show selected entries ");
       	}      
    }
    
    @Then("User Enter Car Name in Search Bar {string} and Verify it")
    public void user_enter_car_name_in_search_bar_and_verify_it(String searchTerm){
    	JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 0)");
    	//Here we are checking Search Bar Actions  	
    	booking.SearchClick(searchTerm);
    	
          WebElement CarName = driver.findElement(By.xpath("//a[text()='Lamborghini  , Aventador']"));
    	   if(CarName.isDisplayed())
    	   {
    	      System.out.println("Searching Booking Details are displayed");
    		
              }
           else
           {
              System.out.println("Searched Bookings are not present");
           }

    	//Here we are Verifying  Entered Car Booking  Details are displayed or not
    	booking.SearchCompare(searchTerm);
     }
     String BOOKINGNO;
     @Then("User Clicks on view option and Display Status of Noted Booking Id")
     public void user_clicks_on_view_option_and_display_status_of_noted_booking_id() {
    	// here user note downs the booking No,From Date and To date 	 
    	 BOOKINGNO = booking.NoteBookingId();
       	
         // Users clicks on view option
        booking.ClickViewButton();
      	 
      	//verify noted booking id details displayed or not
      	booking.BookingDetailInterface();
      	
      	//User should Know Status of Noted Booking ID
      	booking.BookingIdStatus();
     }
     
    @Then("User Clicks on Confirm Booking verify pop message and cancel it and Confirm it")
     public void user_clicks_on_confirm_booking_verify_pop_message_and_cancel_it_and_confirm_it() {
    	 //Here we are Scrolling down the page
    	 JavascriptExecutor jse = (JavascriptExecutor) driver;
    	 jse.executeScript("window.scrollBy(0,200)");
    	 
         //Here we are printing Noted Booking Id
    	 System.out.println("This Booking No is Compared with User Interface="+BOOKINGNO);
         
        //Here we are clicking on confirm booking and cancel it
         booking.ClickNewConfirmButton();
        
       //Here we are switching alert into text
        	 Alert alert = driver.switchTo().alert();
        	 String textmsg = alert.getText();
        	 System.out.println(textmsg+" such that pop message displayed");
        	 alert.dismiss();
        
       //Here we are clicking on confirm booking and confirm it
         booking.ClickNewConfirmButton();
             
       //Here we are switching alert into text
        	 driver.switchTo().alert();
        	 alert.accept();
        	 Alert alert1 = driver.switchTo().alert();
        	 String textmsg1 = alert1.getText();
        	 System.out.println(textmsg1);
        	 alert1.accept();
     }
    
     @Then("User Clicks on Cancel Booking verify pop message and cancel it and Confirm it")
     public void user_clicks_on_cancel_booking_verify_pop_message_and_cancel_it_and_confirm_it() {
    	 
    	//Here we are Scrolling down the page
    	 JavascriptExecutor jse = (JavascriptExecutor) driver;
    	 jse.executeScript("window.scrollBy(0,200)");
    	 
    	//Here we are printing Noted Booking Id
    	 System.out.println("This Booking No is Compared with User Interface="+BOOKINGNO);
    	 
    	//Here we are clicking on cancel booking and cancel it
    	 booking.ClickNewCancelButton();
          
    	 //Here we are switching alert into text
    	     Alert alert = driver.switchTo().alert();
        	 String textmsg = alert.getText();
        	 System.out.println(textmsg+" such that pop message displayed");
        	 alert.dismiss();
        	 
        //Here we are clicking on cancel booking and cancel it
         booking.ClickNewCancelButton();
        	 
       //Here we are switching alert into text
        	 driver.switchTo().alert();
        	 alert.accept();
        	 Alert alert1 = driver.switchTo().alert();
        	 String textmsg1 = alert1.getText();
        	 System.out.println(textmsg1);
        	 alert1.accept();     
     }

   //END TO END SCENARIO CODE
     @Then ("User Clicks on logout button and back to home button")
     public void user_clicks_on_logout_button_and_back_to_home_button() {
    	 //Here we are Logging out from Admin Page and back to Home Page
    	 booking.AdminLogoutClick();
     }
     
    @Then ("User Clicks on LoginRegister button and Enters Valid Email Address as {string} and Password as {string}")
     public void user_clicks_on_loginregisterbutton_and_enters_valid_email_address_as_and_password_as(String emailid,String passid) throws InterruptedException{
     Thread.sleep(2000);
		//Here we are clicking User Login button
   	     booking.UserLoginRegisterClick();
   	 //Here we are entering Details to User Login
	 Thread.sleep(2000);
    	 booking.setemailid(emailid);
		 Thread.sleep(2000);
    	 booking.setpassid(passid);	
     }
	 @Then("User Clicks on Login button and Drop Down list and Select My Booking Option verify its interface")
	 public void user_clicks_on_login_button_and_drop_down_list_and_select_my_booking_option_verify_its_interface() {
		 //Here we are clicking on login user button
    	 booking.UserLoginClick();
    	 
    	 //Here we are clicking on User dropdown and going to My Booking of User
    	 booking.UserDropdownClick();
    	 booking.UserMyBookingClick();
	 }
     
     @Then ("Verify the Status of Noted Booking Number and Clicks on Logout button")
     public void verify_the_status_of_noted_booking_number_and_clicks_on_logout_button() {
    	  
         // This list to include all the elements in My Booking of User
         List <WebElement> Bookingnos = driver.findElements(By.xpath("/html/body/section[2]/div/div[2]/div[2]/div/div/ul/li"));
         
         for(WebElement Bookingno : Bookingnos) {
        	    String BookingDetails = Bookingno.getText();
        	   	  if(BookingDetails.contains(BOOKINGNO) ) 
        	     {
        		   // Here below line is print vehicle Information
        		   System.out.println("Car Booking Details are:"+BookingDetails);   
        	     }
			     
            }
         booking.UserDropdownClick();
         //Logging out from user interface 
         booking.UserLogoutClick();
     }
     
     @When("User Clicks on Confirmed Option and Verify Interface")
     public void user_clicks_on_confirmed_option_and_verify_interface() {
    	 
    	 //Here we are clicking on Confirmed Option
    	 booking.ClickConfirmedBooking();
    	 
    	 //Here we are Verifying Confirmed Bookings Interface
    	 booking.ConfirmedBookingInterface();
    	 
  		WebElement sno1 = driver.findElement(By.xpath("//td[text()='1']"));
  		if(sno1.isDisplayed()) {
  			System.out.println("Confirm Bookings details are present");
  		}
  		else {
  			System.out.println("Confirm Bookings Details are empty");
  		}
     }
     
     
    @When("User Clicks on Canceled Option and Verify Interface")
     public void user_clicks_on_canceled_option_and_verify_interface() {
    	//Here we are clicking on Canceled Option
    	 booking.ClickCanceledButton();
    	 
    	//Here we are Verifying Confirmed Bookings Interface
    	 booking.CanceledBookingInterface();
   		WebElement sno1 = driver.findElement(By.xpath("//td[text()='1']"));
   		if(sno1.isDisplayed()) {
   			System.out.println("Cancelled Bookings details are present");
   		}
   		else {
   			System.out.println("Cancelled Bookings Details are empty");
   		}
     }
     
     @Then ("User clicks on Req Users option and Verify Interface")
     public void user_clicks_on_req_users_and_verify_interface() {
    	 //Here we are clicking on Admin Req Users button
    	 regusers.ReguserClickButton();
    	 
    	//Here we are Verifying Req Users Interface
    	 regusers.InterfaceReguser();
    	 
    	 WebElement sno1 = driver.findElement(By.xpath("//td[text()='1']"));
 		if(sno1.isDisplayed()) {
 			System.out.println("Registered users details are present");
 		}
 		else {
 			System.out.println("Registered users Details are empty");
 		}
     }
     
     @Then("User Enter Name in Search Bar {string} and verify it")
     public void User_Enter_Name_in_Search_Bar_and_verify_it(String searchTerm) {
    	 //Here we are scrolling Page  to top 
     	 JavascriptExecutor Uppage = (JavascriptExecutor) driver;
     	 Uppage.executeScript("window.scrollTo(0,0)");
     	 
     	 //Here we are Entering Name in Search Bar
     	      WebElement sno1 = driver.findElement(By.xpath("//td[text()='1']"));
     	      if(sno1.isDisplayed()){
				System.out.println("Reqistered User Details are displayed");
			    regusers.SearchClick(searchTerm);
     	      }
             else{
             System.out.println("Registered Users are empty");
             }
     	
     	//Here we are Verifying  Entered Name Registered User Details are displayed or not
     	
     	regusers.SearchCompare(searchTerm);   
  }
     
  @Then("User Clicks on User Login button")
  public void user_clicks_on_user_login_button() {
	  
	  //Here user Clicking on Login Button of User Interface
	  booking.UserLoginClick();
  }
  @Then("User Clicks on Car Listing and clicks on Car View Details and verify interfaces")
  public void  user_clicks_on_car_listing_and_clicks_on_car_view_details_and_verify_interfaces() {
	  
	  //Here we are clicking on Car listing button and verifying its Interface
	    carlisting.CarListingbuttonClick();
	    carlisting.VerifyInterfaceCarListing();

	  //Here we are clicking on car view details button and verifying its Interface
	   JavascriptExecutor downpage = (JavascriptExecutor) driver;
	   downpage.executeScript("window.scrollBy(0,100)");
	   carlisting.CarViewDetailbuttonClick();
	   carlisting.VerifyCarViewDetailInterface(); 
  }
 
  @Then ("User Selects from date and To date of Car Booking")
  public void user_selects_from_date_and_to_date_of_car_booking() {
	  //Here we are randomly selecting date and month
	  carlisting.SetDate();    	 
	  //Here we are entering from date of Car Booking 
	  carlisting.SetFromDate();
	 //Here we are entering to date of Car Booking 
	  carlisting.SetToDate();	  
}
  @And("enter the message and click on Book button")
  public void enter_the_message_and_click_on_book_button() {
	
	//Here we are entering message in text Box
	  carlisting.EnterText();
	  //Here we are clicking on book button
	  carlisting.Bookbutton();
  }
  String FromdateSearch;
  @Then("Verify Booking Successful or not and Click on Logout button")
     public void verify_booking_successful_or_not_and_click_on_logout_button() throws InterruptedException {
    	try{
		 Thread.sleep(1500);
         Alert alert = driver.switchTo().alert();
		 String popupmsg = alert.getText();
    	 System.out.println(popupmsg);
    	 if(popupmsg.contains("successfull.")) {
			alert.accept();
			Assert.assertTrue(true);
			FromdateSearch = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[2]/div/div/ul/table[1]/tbody/tr[2]/td[2]")).getText();
			//Click on DropDown 
			booking.UserDropdownClick();
		   //Logging out from user interface 
		    booking.UserLogoutClick();
    		 
    	 }
		 else{
			alert.accept();
			Assert.assertTrue(true);
			//Booking is Unsuccessful because of selected from date then it selects another date for Successful Booking
			user_clicks_on_car_listing_and_clicks_on_car_view_details_and_verify_interfaces();
			user_selects_from_date_and_to_date_of_car_booking();
			enter_the_message_and_click_on_book_button();
			verify_booking_successful_or_not_and_click_on_logout_button();
		
		 }
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	 }
		
@Then ("Verify Noted FromDate in New Bookings and Note Booking No")
  public void verify_noted_fromdate_in_new_bookings_and_note_booking_no() {
	  
	  //Here we are Noting down the Booking No
	  BOOKINGNO=carlisting.verifyfromdate(FromdateSearch);
	  System.out.println("CompareBookingNo="+BOOKINGNO);	   
  }
}





