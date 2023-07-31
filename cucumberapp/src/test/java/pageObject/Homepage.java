package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class Homepage {
	public static WebDriver driver;
	public Homepage(WebDriver driver) {
		Homepage.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"navigation\"]/ul/li[4]/a")WebElement Faqsbtn;
	@FindBy(xpath="/html/body/section[2]/div/div/p")WebElement Faqsfield;
	@FindBy(xpath="//*[@id=\"navigation\"]/ul/li[5]/a")WebElement Contactusbtn;
	@FindBy(xpath="/html/body/section[1]/div[1]/div/div/h1")WebElement Contactusfield;
	@FindBy(id = "fullname")WebElement fullname;
	@FindBy(id="emailaddress")WebElement email;
	@FindBy(id="phonenumber")WebElement phnnumber;
	@FindBy(name = "message")WebElement msg;
	@FindBy(name = "send")WebElement sendbtn;
	@FindBy(xpath="//*[@id=\"navigation\"]/ul/li[6]/a")WebElement adminbtn;
	@FindBy(xpath="/html/body/header/div/div/div/div[2]/div/div[4]/a")WebElement loginbtn;
	@FindBy(xpath="/html/body/footer/div[1]/div/div/div[1]/ul/li[3]/a")WebElement privacybtn;
	@FindBy(xpath="/html/body/footer/div[1]/div/div/div[1]/ul/li[4]/a")WebElement termsofusebtn;
	@FindBy(name = "subscriberemail")WebElement subscribefield;
	@FindBy(name = "emailsubscibe")WebElement subscribebtn;
	@FindBy(xpath="/html/body/header/div/div/div/div[2]/div/div[2]/a")WebElement helplinebtn;
	
	
	public void FAQsbtn() {
		Faqsbtn.click();
	}
	public void checkfaqspage() {
		Faqsfield.isDisplayed();
	}
	public void ContactUsBtn() {
		Contactusbtn.click();
	}
	public void checkcontacuspage() {
		Contactusfield.isDisplayed();
	}
	public void FullName() {
		fullname.sendKeys("Y SAI TEJA");
	}
	public void Emailadd() {
		email.sendKeys("steja7600@gmail.com");
	}
	public void PhoneNumber() {
		phnnumber.sendKeys("9876543210");
	}
	public void Message() {
		msg.sendKeys("Brief your query");
	}
	public void SendBtn() {
		sendbtn.click();
	}
	public void checkmessageinfo() {
		driver.getPageSource().contains("SUCCESS:Query Sent. We will contact you shortly");
	}
	public void clearfullname() {
		fullname.clear();
	}
	public void clearemail() {
		email.clear();
	}
	public void clearphonenumber() {
		phnnumber.clear();
	}
	public void checkvalidation() {
		String message=fullname.getAttribute("validationMessage");
		System.out.println(message);
		if(message.contains("Please fill out this field.")) {
			System.out.println("popup is displayed");
		}
		String message1=email.getAttribute("validationMessage");
		System.out.println(message1);
		if(message1.contains("Please fill out this field.")) {
			System.out.println("popup is displayed");
		}
		String message2=phnnumber.getAttribute("validationMessage");
		System.out.println(message2);
		if(message.contains("Please fill out this field.")) {
			System.out.println("popup is displayed");
		}
		
	}
	public void AdminBtn() {
		adminbtn.click();
	}
	public void checkAdminPage() {
		driver.getPageSource().contains("Admin | Sign in");
	}
	public void LoginBtn() {
		loginbtn.click();
	}
	public void checkloginpage() {
		driver.getPageSource().contains("Login");
	}
	public void PrivacyBtn() {
		privacybtn.click();
	}
	public void checkprivacypage() {
		driver.getPageSource().contains("Privacy Policy");
	}
	public void TermsOfUsebtn() {
		termsofusebtn.click();
	}
	public void checktermspage() {
		driver.getPageSource().contains("Terms and Conditions");
	}
	public void SubscribeField() {
		subscribefield.sendKeys("steja7600@gmail.com");
	}
	public void SubscribeBtn() {
		subscribebtn.click();
	}
	public void checkpopupmessage() {
		 String str = driver.switchTo().alert().getText();
		 System.out.println(str);
		 if(str.contains("Subscribed successfully.") || str.contains("Already Subscribed.")) {
			   driver.switchTo().alert().accept();
		   }
	}
	public void HelpLineBtn() {
		helplinebtn.click();
	}
	public void checkhelplinepopup() {
		driver.getPageSource().contains("Open Pick an app");
	}
}
