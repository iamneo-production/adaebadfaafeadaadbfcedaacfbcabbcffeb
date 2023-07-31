package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileSettings {
	public static WebDriver driver;
	 public ProfileSettings(WebDriver driver) {
		 ProfileSettings.driver=driver;
		 PageFactory.initElements(driver,this);
		}
	 @FindBy(xpath="/html/body/header/div/div/div/div[2]/div/div[4]/a") WebElement login_registerbutton ;
	 @FindBy(xpath="//*[@id=\"loginform\"]/div/div/div[2]/div/div/div/form/div[1]/input") WebElement emailid ;
	 @FindBy(xpath="//*[@id=\"loginform\"]/div/div/div[2]/div/div/div/form/div[2]/input") WebElement pass ;
	 @FindBy(xpath="//*[@id=\"loginform\"]/div/div/div[2]/div/div/div/form/div[4]/input") WebElement loginbutton ;
	 @FindBy(xpath="/html/body/header/div/div/div/div[2]/div/div[3]") WebElement welcomemessage;
	 @FindBy(xpath="//*[@id=\"navigation_bar\"]/div/div[2]/div[1]/ul/li/a") WebElement dropdown ;
	 @FindBy(xpath="//*[@id=\"navigation_bar\"]/div/div[2]/div[1]/ul/li/ul/li[1]/a") WebElement profilesettingsbutton ;
	 @FindBy(xpath="/html/body/section[1]/div[1]/div/div/h1") WebElement yourprofileheader;
	 @FindBy(xpath="//*[@id=\"fullname\"]") WebElement fullname ;
	 @FindBy(xpath="//*[@id=\"phone-number\"]") WebElement phonenumber ;
	 @FindBy(xpath="/html/body/section[2]/div/div[2]/div[2]/div/form/div[10]/button") WebElement savechangesbutton;
	 @FindBy(xpath="//*[@id=\"navigation\"]/ul/li[6]/a") WebElement adminbutton ;
	 @FindBy(xpath="/html/body/div[2]/nav/ul/li[8]/a") WebElement reguserbutton ;
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/h2") WebElement registereduserheader;
	 @FindBy(xpath="//*[@id=\"zctb_filter\"]/label/input") WebElement searchbox;
	 @FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr") WebElement row;
	 @FindBy(xpath="/html/body/section[2]/div/div[2]/div[2]/div/div") WebElement successmessage ;
	 @FindBy(xpath="//*[@id=\"navigation_bar\"]/div/div[2]/div[1]/ul/li/ul/li[6]") WebElement signout;
	 

	 public void clicklogin_registerbutton() {
		 login_registerbutton.click();
	 }
	 public void enteremail(String email) {
		 emailid.sendKeys(email);
	 }
	 public void enterpass(String password) {
		 pass.sendKeys(password);
	 }
	 public void clickonloginbutton() {
		 loginbutton.click();
	 }
	 public void checkwelcomemessage() {
		 boolean t=welcomemessage.isDisplayed();
		 if (t) {
	         System.out.println("Welcome message is dispalyed");
	      } else {
	         System.out.println("Welcome message is not dispalyed");
	      }
	 }
	 public void invalid_login(String email, String password) {
		emailid.sendKeys(email);
		pass.sendKeys(password);
	}
	
	public void geterror_message(String error_message) {
		error_message = driver.switchTo().alert().getText();
	   System.out.println(error_message);
	   driver.switchTo().alert().accept();
	}

	 public void clickondropdown() {
		 dropdown.click();
		 profilesettingsbutton.click();
		 
	 }
	 public void checkprofilepage() {
		 boolean t=yourprofileheader.isDisplayed();
		 if (t) {
	         System.out.println("Your Profile Page is dispalyed");
	      } else {
	         System.out.println("Your Profile Page is not dispalyed");
	      }
	 }
	 public void enterfullname(String s) {
		 fullname.clear();
		 fullname.sendKeys(s);
	 }
	 public void enterphonenumber(String p) {
		 phonenumber.clear();
		 phonenumber.sendKeys(p);
	 }
	 public void clickonsavechangesbutton() {
		 savechangesbutton.click();
	 }
	 public void adminbutton() {
		 adminbutton.click();
	 }
	 public void clickonreguser() {
		 reguserbutton.click();
	 }
	 public void checkreguserpage() {
		boolean t= registereduserheader.isDisplayed();
		 if (t) {
	         System.out.println("Registered Users Page is dispalyed");
	      } else {
	         System.out.println("Registered Users Page Page is not dispalyed");
	      }
	 }
	 public void entersearchbox(String d) {
		 searchbox.sendKeys(d);
	 }
	 public void checktheupdatedinfo() {
		 String name="saiteja";
		 String phonenumber="9876543210";
		 String rowinfo=row.getText();
		 if(rowinfo.contains(name)) {
			 if(rowinfo.contains(phonenumber)) {
			 System.out.println("fields are updated");
		 }
			 else {System.out.println("fields are not updated");}
		 }
		 else {System.out.println("fields are not updated");} 
		 
	 }
	 public void checksuccessmessage() {
		 boolean f=successmessage.isDisplayed();
		 if(f) {
			 System.out.println("Success message is dispalyed");
		 }
		 else {
			 System.out.println("Success message is not dispalyed");
		 }
	 }
	 public void clearnamefield() {
		 fullname.clear();
	 }
	 public void clearphonenumber() {
		 phonenumber.clear();
	 }
	 public void checkpopupname(){
			String mess=fullname.getAttribute("validationMessage");
			System.out.println(mess);
			if(mess.contains("Please fill out this field.")) {
				System.out.println("popup is displayed");
			}
			else{
				System.out.println("popup is not displayed");
			}
		}
	 public void checkpopupphonenumber(){
			String mess=phonenumber.getAttribute("validationMessage");
			System.out.println(mess);
			if(mess.contains("Please fill out this field.")) {
				System.out.println("popup is displayed");
			}
			else{
				System.out.println("popup is not displayed");
			}
		}
	 public void clicksignout() {
		 dropdown.click();
		 signout.click();
	 }
	 public void checkloginbuttonhome() {
		 boolean t=login_registerbutton.isDisplayed();
		 if(t) {
			 System.out.println("homepage is displayed");
		 }
		 else {
			 System.out.println("homepage is not displayed");
		 }
		 
	 }
}