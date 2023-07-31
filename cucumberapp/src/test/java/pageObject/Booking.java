package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking {

	public WebDriver driver;
    public Booking(WebDriver driver)
    {        
        PageFactory.initElements(driver, this);
    }
	
    @FindBy(xpath="//a[text()='Admin']")
    WebElement Adminbutton;
    @FindBy(xpath="//input[@placeholder='Username']")
    WebElement adminusername;
    @FindBy(xpath="//input[@placeholder='Password']")
    WebElement adminpassword;
    @FindBy(xpath="//button[text()='LOGIN']")
    WebElement Loginbutton;
    @FindBy(xpath="//a[text()='Car Rental Portal | Admin Panel']")
    WebElement admininterface;
    @FindBy(xpath="/html/body/div[2]/nav/ul/li[5]/a")
    WebElement bookingbutton;
    @FindBy(xpath="//a[text()='New']")
    WebElement New;
    @FindBy(xpath="//a[text()='Confirmed']")
    WebElement Confirm;
    @FindBy(xpath="//a[text()='Canceled']")
    WebElement Cancel;
    @FindBy(xpath="//a[text()='New']")
    WebElement newbutton;
    @FindBy(xpath="//h2[text()='New Bookings']")
    WebElement newbooking;
    @FindBy(xpath="//*[@id='zctb']/tbody/tr[1]/td[1]")
    WebElement show;
    @FindBy(xpath="//select[@name='zctb_length']")
    WebElement showbutton;
    @FindBy(xpath="//option[@value='10']")
    WebElement showentry;
    @FindBy(id="zctb_info")
    WebElement  output;
    @FindBy(xpath="//input[@type='search']")
    WebElement searchbutton;
    @FindBy(xpath="//a[text()='Lamborghini  , Aventador']")
    WebElement search;
    @FindBy(xpath="//a[text()='Next']")
    WebElement nextbutton;
    @FindBy(xpath="//a[text()='Previous']")
    WebElement previousbutton;
    @FindBy(xpath="//*[@id='zctb']/tbody/tr[1]/td[3]")
    WebElement bookingid;
    @FindBy(xpath="//a[text()=' View']")
    WebElement viewbutton;
    @FindBy(xpath="//h2[text()='Booking Details']")
    WebElement bookingdetail;
    @FindBy(xpath="//*[@id=\"print\"]/table/tbody/tr[2]/td[1]") 
    WebElement bookid;
    @FindBy(xpath="//*[@id=\"print\"]/table/tbody/tr[11]/td[1]")
    WebElement bookingstatus;
    @FindBy(xpath="//a[text()=' Confirm Booking']")
    WebElement newconfirm;
    @FindBy(xpath="//a[text()=' Cancel Booking']")
    WebElement newcancel;
    @FindBy(xpath="//a[text()='Confirmed']")
    WebElement confirmedbutton;
    @FindBy(xpath="//h2[text()='Confirmed Bookings']")
    WebElement confirmedbookinginterface;
    @FindBy(xpath="//a[text()='Canceled']")
    WebElement canceledbutton;
    @FindBy(xpath="//h2[text()='Canceled Bookings']")
    WebElement canceledbookinginterface;
    @FindBy(xpath="/html/body/div[1]/ul/li/a")
    WebElement Account;
    @FindBy(xpath="/html/body/div[1]/ul/li/ul/li[2]/a")
    WebElement Logoutbutton;
    @FindBy(xpath="/html/body/div/div/div/div/div/div/div/p/a")
    WebElement Backtohomebutton;
    @FindBy(xpath="//*[@id='loginform']/div/div/div[2]/div/div/div/form/div[1]/input")
    WebElement useremailid;
    @FindBy(xpath="//*[@id='loginform']/div/div/div[2]/div/div/div/form/div[2]/input")
    WebElement userpassword;
    @FindBy(xpath="//a[text()='Login / Register']")
    WebElement loginregisterbutton;
    @FindBy(xpath="//input[@value='Login']")
    WebElement userloginbutton;
    @FindBy(xpath="//a[@data-toggle='dropdown']")
    WebElement userdropdownbutton;
    @FindBy(xpath="//a[text()='My Booking']")
    WebElement mybookingbutton;
    @FindBy(xpath="//*[@id=\"navigation_bar\"]/div/div[2]/div[1]/ul/li/ul/li[6]/a")
    WebElement logoutbutton;
    
    public void adminbuttonclick() {
    	Adminbutton.click();
    }
    public void setUserid(String userid) {
    	adminusername.sendKeys(userid);
    }
    public void setPasswordid(String passwordid) {
    	adminpassword.sendKeys(passwordid);
    }
    public void ClickLoginButton() {
    	Loginbutton.click();
    }
    public String AdminInterface() {
    
        admininterface.isDisplayed();
    	String title = admininterface.getText();
    	return title;
    }
    public void ClickBookingButton() {
    	bookingbutton.click();
    }
    public void VerifyCategoriesList() {
    	if(New.isDisplayed() && Confirm.isDisplayed() && Cancel.isDisplayed())
    	{
    		System.out.println("Bookings Categories list are Displayed");
    	}
    	else {
    		System.out.println("Bookings Categories list are not Displayed");
    	}
    }
    public void NewClick() {
    	newbutton.click();
    }
    public void  NewBookingInterface() {
    	
    	if(newbooking.isDisplayed())
		{
			System.out.println("New Bookings Interface will be displayed");
		}
		else {
			System.out.println("New Bookings Interface not displayed");
		}	
    }
    public void ShowDisplay() {
    	if(show.isDisplayed()) {
    		ShowClick();
    	}
    }
    public void ShowClick() {
    	showbutton.click();
    }
    public void SelectShowEntry() {
    	showentry.click();
    }
    public void ShoworSearchOutput() {
    	System.out.println(output.getText());
    }
    public void SearchClick(String searchTerm) {
    	searchbutton.click();
    	searchbutton.sendKeys(searchTerm);
    }
    public void SearchCompare(String searchTerm) {
    	String text = search.getText();
    	if(text.contains(searchTerm)) {
    		ShoworSearchOutput();
    	}
    	else {
           	System.out.println("invalid Details");
           }
    }
    public void ClickNextButton() {
    	nextbutton.click();
    }
    public void ClickPreviousButton() {
    	previousbutton.click();
    }
    String BookingNo,Fromdate,Todate;
    public String NoteBookingId() {
    	BookingNo= "#"+bookingid.getText();
    	System.out.println("Noted Booking No="+BookingNo);
    	return BookingNo;
    }
    public void ClickViewButton() {
    	viewbutton.click();
    }
    public void BookingDetailInterface() {
    	if(bookingdetail.isDisplayed()) {
    		String comparebookid = bookid.getText();
    		System.out.println("CompareBookingid="+comparebookid);
    				//CompareBookingId();
    		if(comparebookid.equals(BookingNo)) {
    			
    			System.out.println("Noted Booking id Details are Displayed");
     		}
     		else{
     			System.out.println("Noted Booking id Details are not Displayed");
     		}
    	}
    }
    public void BookingIdStatus() {
    	System.out.println("Booking Status= " +bookingstatus.getText());
    }
    public void ClickNewConfirmButton() {
    	newconfirm.click();
    }
    public void ClickNewCancelButton() {
    	newcancel.click();
    }
    public void ClickConfirmedBooking() {
    	confirmedbutton.click();
    }
    public void ConfirmedBookingInterface() {
    	if(confirmedbookinginterface.isDisplayed()){
  			System.out.println("confirm Bookings Interface will be displayed");
  		}
  		else {
  			System.out.println("Error Occurred");
  		}
    }
    public void ClickCanceledButton() {
    	canceledbutton.click();
    }
    public void CanceledBookingInterface() {
    	if(canceledbookinginterface.isDisplayed())
    	{
   			System.out.println("Cancelled Bookings Interface will be displayed");
   		}
   		else {
   			System.out.println("Error Occurred");
   		}
    }
    public void AdminLogoutClick() {
    	Account.click();
    	Logoutbutton.click();
    	Backtohomebutton.click();
    }
    public void setemailid(String emailid) {
        if(useremailid.isDisplayed()){
            System.out.println("user enters the emailid");
            useremailid.sendKeys(emailid);
        }
    }
    public void setpassid(String passid) {
        if(userpassword.isDisplayed()){
            System.out.println("user enters the password");
    	userpassword.sendKeys(passid);
    }
}
	public void UserLoginRegisterClick() {
        if(loginregisterbutton.isDisplayed()){
            System.out.println("Here user click on login");
		loginregisterbutton.click();
	}
}
	public void UserLoginClick() {
		userloginbutton.click();
	}
	public void UserDropdownClick() {
		userdropdownbutton.click();
	}
	public void UserMyBookingClick() {
		mybookingbutton.click();
	}	
	public void UserLogoutClick() {
		logoutbutton.click();
	}
}
