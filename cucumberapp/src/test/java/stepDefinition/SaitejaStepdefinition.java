package stepDefinition;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pageObject.Aboutuspage;
import pageObject.Homepage;
import pageObject.ProfileSettings;
import pageObject.UserModule;
import pageObject.Carlistingpage;
public class SaitejaStepdefinition {
	public WebDriver driver = null;
	public Aboutuspage aboutuspage;
	public Carlistingpage carlisting;
	public Homepage homepage; 
	public UserModule usermodule;
	public ProfileSettings profile;
	
	@Before
	public void browser_setup() {
		//driver = new ChromeDriver();
	}
	
	@After
	public void browser_tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	
	@Given("user launches chrome browser")
	public void user_launches_chrome_browser() throws MalformedURLException {
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-dev-shm-usage");
		driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
        driver.get("https://carrental.neohire.io/");
		driver.manage().window().maximize();
		aboutuspage = new Aboutuspage(driver);
		carlisting = new Carlistingpage(driver);
		homepage = new Homepage(driver);
		usermodule = new UserModule(driver);
		profile = new ProfileSettings(driver);
	}

	@When("user navigates to url")
	public void user_navigates_to_url() {
		driver.navigate().to("https://carrental.neohire.io/");
	}
	
	@Then("user shoud be able to view carrental portal")
	public void user_shoud_be_able_to_view_carrental_portal() {
	    aboutuspage.checkCarRentalPortal();
	}

	@And("click on About us button")
	public void click_on_About_us_button()  {
	    aboutuspage.AboutusButton();
	    
	}

	@Then("user should be able to view About us Page")
	public void user_should_be_able_to_view_About_us_Page()  {
	    aboutuspage.checkAboutuspage();
	    
	}
	
	@When("user clicks on CarListing button")
	public void click_on_CarListing_button()  {
	    carlisting.Carlistingbtn();	    
	}
	
	@Then("user should be able to view Car Listing Page")
	public void user_should_be_able_to_view_Car_Listing_Page()  {
	    carlisting.checkcarlistingpage();
	    
	}

	@And("list out the available car details")
	public void list_out_the_available_car_details()  {
	   carlisting.listoutcars();
	   
	}

	@And("list out all the recently listed cars")
	public void list_out_all_the_recently_listed_cars()  {
	   carlisting.checkrecentlylistedcars();
	   
	}
	@When("click on one of the recently listed cars")
	public void click_on_one_of_the_recently_listed_cars()  {
	    carlisting.RecentlyListedCar();
	}

	@Then("user should be able to view the details of car")
	public void user_should_be_able_to_view_the_details_of_car()  {
	    carlisting.checkrecentlylstcar();
	    
	}
	
	@And("Select Brand Type")
	public void select_Brand_Type() {
	    carlisting.selectbrand();
	}

	@And("Select Fuel Type")
	public void select_Fuel_Type()  {
		carlisting.selectfuel();	
	}

	@And("click on Find Your Car")
	public void click_on_Find_Your_Car()  {
	   carlisting.Searchbtn();
	   
	}

	@Then("user should be able to view Car Listings")
	public void user_should_be_able_to_view_Car_Listings()  {
	    carlisting.checkcarlistings();
	}

	@And("list out all the cars")
	public void list_out_all_the_cars()  {
	    carlisting.listoutcars();
	}
	
	@When("click on view details")
	public void click_on_view_details()  {
	    carlisting.Viewdetailsbtn();
	}

	@Then("the user should be able to view car details")
	public void the_user_should_be_able_to_view_car_details()  {
	   carlisting.checkcardetails();
	}
	
	@When("click on Accessories button")
	public void click_on_Accessories_button()  {
	    carlisting.Accessoriesbtn();
	}

	@Then("all the accessories are displayed")
	public void all_the_accessories_are_displayed()  {
	    carlisting.checkAccessories();
	}
	@And("list out all the accessories")
	public void list_out_all_the_accessories()  {
	    carlisting.listoutaccessories();	    
	}
	@Then("user should list out all the similar cars")
	public void user_should_list_out_all_the_similar_cars()  {
	    carlisting.listoutcars();
	}
	@When("click on one of the similar car")
	public void click_on_one_of_the_similar_car() {
	    carlisting.similarcarbtn();
	}

	@Then("user should be able to view details of the car")
	public void user_should_be_able_to_view_details_of_the_car()  {
		carlisting.checksimilarcardetails();
		
	}
	@And("click on prev button")
	public void click_on_prev_button()  {
		carlisting.PrevBtn();
		
	}
	@Then("user should be able to view prev image")
	public void user_should_be_able_to_view_prev_image() {
		carlisting.checkimageslider();
	}
	@When("click on next button")
	public void click_on_next_button()  {
		carlisting.NextBtn();
		
	}
	@Then("user should be able to view next image")
	public void user_should_be_able_to_view_next_image() {
		carlisting.checknextslider();
	}
	@And("click on Vehicle Overview button")
	public void click_on_Vehicle_OSverview_button()  {
		carlisting.vehicleoverviewbtn();
		
	}
	@Then("user should be able to view overview of the vehicle")
	public void user_should_be_able_to_view_overview()  {
		carlisting.checkvehicleoverview();
		
	}	
	@And("display the details of the car")
	public void print_the_details_of_the_car()  {
	    carlisting.overviewofcar();
	    
	}
	
	@When("click on FAQs button")
	public void click_on_FAQs_button()  {
		homepage.FAQsbtn();
		
	}

	@Then("user should be able to view FAQs Page")
	public void user_should_be_able_to_view_FAQs_Page()  {
		homepage.checkfaqspage();	
	}
	@And("click on Contact us button")
	public void click_on_Contact_us_button()  {
		homepage.ContactUsBtn();
		
	}

	@Then("user should be able to view Contact us Page")
	public void user_should_be_able_to_view_Contact_us_Page()  {
		homepage.checkcontacuspage();
		
	}

	@When("type your full name")
	public void type_your_full_name() {
		homepage.FullName();
	}

	@And("type your email")
	public void type_your_email() {
		homepage.Emailadd();
	}

	@And("your phone number")
	public void your_phone_number() {
		homepage.PhoneNumber();
	}

	@And("type a message")
	public void type_a_message() {
		homepage.Message();
		
	}

	@And("click on send message")
	public void click_on_send_message()  {
		homepage.SendBtn();
	}

	@Then("user should view SUCCESS")
	public void user_should_view_SUCCESS()  {
		homepage.checkmessageinfo();
		
	}
	
	@When("clear full name")
	public void clear_full_name()  {
	   homepage.clearfullname();
	   
	}

	@Then("a validation message is displayed")
	public void a_validation_message_is_displayed()  {
	    homepage.checkvalidation();
	    
	}

	@When("clear email")
	public void clear_email()  {
	    homepage.clearemail();
	    
	}

	@When("clear phone number")
	public void clear_phone_number()  {
	   homepage.clearphonenumber();
	   
	}

	@And("click on Admin button")
	public void click_on_Admin_button() {
		homepage.AdminBtn();
		
	}
	@Then("user should be able to view Admin signin Page")
	public void user_should_view_Admin_signin_Page()  {
		homepage.checkAdminPage();
		
	}
	@And("click on Login\\/Register button")
	public void click_on_Login_Register_button() {
		homepage.LoginBtn();
		
	}
	@Then("user should be able to view Login Page")
	public void user_should_be_able_to_view_Login_Page()  {
		homepage.checkloginpage();
		
	}
	@And("click on privacy button")
	public void click_on_privacy_button()  {
		homepage.PrivacyBtn();
		
	}
	@Then("user should be able to view privacy Page")
	public void user_should_view_Privacy_page()  {
		homepage.checkprivacypage();
		
	}
	@And("click on terms of use button")
	public void click_on_termsofuse_button()  {
		homepage.TermsOfUsebtn();
	}
	@Then("user should be able to Terms and Conditions Page")
	public void user_should_be_able_to_Terms_and_Conditions_Page()  {
		homepage.checktermspage();
		
	}
	@When("enter email address")
	public void enter_email_address()  {
	    homepage.SubscribeField();
	    
	}

	@And("click on subscribe button")
	public void click_on_subscribe_button()  {
	    homepage.SubscribeBtn();
	    
	}

	@Then("user should be able to see popup message")
	public void user_should_be_able_to_see_popup_message()  {
	   homepage.checkpopupmessage();
	   
	}
	
	@When("click on Service Helpline option")
	public void click_on_Service_Helpline_option()  {
	    homepage.HelpLineBtn();
	    
	}
	@Then("user should be able to see a popup message")
	public void user_should_be_able_to_see_a_popup_message()  {
		homepage.checkhelplinepopup();
		
	}

	@When("user clicks on Login\\/Register module")
	public void user_clicks_on_login_register_module() {
		usermodule.clickUserLogin();
	}
	@When("fill the form")
	public void fill_the_form()  {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	usermodule.userLogin("rent@gmail.com", "rent");
	
	}
	@When("click on Login button")
	public void click_on_login_button() {
	  usermodule.clickLogin();
	}
	@Then("welcome message will be displayed")
	public void welcome_message_will_be_displayed()  {
	  usermodule.welcomeMsg();
	  
	}
	@When("user click on dropdown menu")
	public void user_click_on_dropdown_menu()  {
	  usermodule.clickDropdown();
	  
	}

	@When("click on Post a testimonial")
	public void click_on_post_a_testimonial()  {
	 usermodule.clickpost();
	 
	}

	@Then("user navigates to post a testimonial page")
	public void user_navigates_to_post_a_testimonial_page()  {
	    usermodule.postATestMsg();
	    
	}
	@When("user enters a testimonial")
	public void user_enters_a_testimonial()  {
	 usermodule.enterPostATestimonial("satisfied");	 
	}

	@When("user click on save button")
	public void user_click_on_save_button()  {
	   usermodule.clickSave();
	}

	@Then("testimonial submitted message will be displayed")
	public void testimonial_submitted_message_will_be_displayed()  {
	String message = usermodule.getSuccessMsg();
	System.out.println(message);	
	}

	@When("admin clicks on the Admin module")
	public void admin_clicks_on_the_admin_module()  {
	//loginPage=new AdminLoginPage(driver);
	usermodule.clickAdminButton();
	}
	@Then("admin should able to see the admin signin page")
	public void admin_should_able_to_see_the_admin_signin_page()  {
	String adminpage = usermodule.adminSignInPage();
	System.out.println(adminpage+" page is displayed");	
	}
	@When("admin enters the username as {string}  and password as {string}")
	public void admin_enters_the_username_as_and_passwrod_ad(String string, String string2)  {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	usermodule.enterUsername("admin");
	usermodule.enterPassword("Test@12345");
	
	}
	@When("click on the login button")
	public void click_on_the_login_button1() {
	usermodule.clickLoginButton();
	}

	@Then("admin should be able to view the car rental portal | admin panel")
	public void admin_should_be_able_to_view_the_car_rental_portal_admin_panel()  {
	String title = "Car Rental Portal | Admin Panel";
	String actualtitle = usermodule.AdminInterface();

	        if (title.equals(actualtitle)) {
	        System.out.println("Successfully Admin Login Page is Opened");
	        } else {
	        System.out.println("Admin Login Page is Not Opened");
	        }
	        
	}
	@When("admin click on manage testimonials")
	public void admin_click_on_manage_testimonials()  {
	   usermodule.clickManageTestimonial();
	   
	}

	@Then("admin navigates to manage testimonial page")
	public void admin_navigates_to_manage_testimonial_page()  {
	  usermodule.manageTestPageTitle();
	  
	}

	@Then("verify the posted testimonial")
	public void verify_the_posted_testimonial()  {
	usermodule.checkPostedTest();
	
	}
	@When("click on signout option")
	public void click_on_signout_option()  {
	usermodule.clickSignOut();
	}
	@When("user clicks on save button")
	public void user_clicks_on_save_button()  {
	   usermodule.clickSave();
	   
	}

	@Then("warning message will be displayed")
	public void warning_message_will_be_displayed()  {
	String message = usermodule.getValidationMsg();
	System.out.println(message);
	}
	@Then("it should be redirected to the home page")
	public void it_should_be_redirected_to_the_home_page()  {
	String homePage = usermodule.getHomePageTitle();
	System.out.println(homePage+ " page is displayed");
	
	}
		@Then("Click on the login\\/Register button")
		public void click_on_the_login_register_button()  {
		profile.clicklogin_registerbutton();
	}

	@Then("Enter the Email address as {string} and password as {string}")
	public void enter_the_email_address_as_and_password_as(String string, String string2) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    profile.enteremail("steja7600@gmail.com");
	    profile.enterpass("9014963608");
	}

	@And("clicks login button")
	public void clicks_login_button() {
	    profile.clickonloginbutton();
	}

	@Then("user should see the welcome message")
	public void user_should_see_the_welcome_message() {
	    profile.checkwelcomemessage();	    
	}
	@When("user enters invalid {string} and {string}")
	public void user_enters_invalid_and(String email, String password)  {
	    profile.invalid_login(email, password);
	}

	@Then("user should see an error message indicating {string}")
	public void user_should_see_an_error_message_indicating(String error_message)  {
	    profile.geterror_message(error_message);
	}

	@Then("user should click on the dropdown and select the profile settings")
	public void user_should_click_on_the_dropdown_and_select_the_profile_settings() {
	   profile.clickondropdown();
	}

	@Then("user should see the Your Profile settings page")
	public void user_should_see_the_your_profile_settings_page() {
	    profile.checkprofilepage();
	}

	@When("user enter all the details")
	public void user_enter_all_the_details() {
	   profile.enterfullname("saiteja");
	   profile.enterphonenumber("9876543210");
	}

	@When("click on save changes")
	public void click_on_save_changes() {
	    profile.clickonsavechangesbutton();
	}
	@Then("user should see the success message in profile page")
	public void user_should_see_the_success_message_in_profile_page() {
	    profile.checksuccessmessage();
	}

	@When("user should clear the name field")
	public void user_should_clear_the_name_field() {
	   profile.clearnamefield();
	}

	@Then("user should see the validation message near name filed")
	public void user_should_see_the_validation_message_near_name_filed() {
	    profile.checkpopupname();
	}

	@Then("user should see the validation message near phone number field")
	public void user_should_see_the_validation_message_near_phone_number_field() {
	    profile.checkpopupphonenumber();
	}
	@When("user should clear the phone number field")
	public void user_should_clear_the_phone_number_field() {
	    profile.clearphonenumber();	    
	}

	@Then("click on admin")
	public void click_on_admin() {
	    profile.adminbutton();    
	}

	@Then("Click on Reg Users")
	public void click_on_reg_users() {
	    profile.clickonreguser();
	}

	@Then("user should see the Registered Users Page")
	public void user_should_see_the_registered_users_page() {
	   profile.checkreguserpage();	   
	}

	@Then("enter the user name in the search box")
	public void enter_the_user_name_in_the_search_box() {
	   profile.entersearchbox("saiteja");
	   
	}

	@Then("user should see the updated info in the table")
	public void user_should_see_the_updated_info_in_the_table() {
	   profile.checktheupdatedinfo();	   
	}

	@And("Click on the signout")
	public void click_on_the_signout() {
	    profile.clicksignout();
	}
	@Then("user should see the homepage")
	public void user_should_see_the_homepage() {
	    profile.checkloginbuttonhome();
	}
	}



