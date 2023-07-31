package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateContactInfoPage {
	public static WebDriver driver;
	public UpdateContactInfoPage(WebDriver driver) {
		 UpdateContactInfoPage.driver=driver;
		 PageFactory.initElements(driver,this);
		}
	@FindBy(xpath="//*[@id=\"address\"]")WebElement contactadd;
	@FindBy(xpath="//*[@id=\"email\"]")WebElement contactemail;
	@FindBy(xpath="//*[@id=\"contactno\"]")WebElement contactphoneno;
	@FindBy(name="submit")WebElement contactupdatebutton;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/h2")WebElement contactpage;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div/div/div/div[2]/form/div[1]")WebElement contactsuccess;
	@FindBy(xpath="/html/body/header/div/div/div/div[2]/div/div[1]/a")WebElement homeemail;
	@FindBy(xpath="/html/body/header/div/div/div/div[2]/div/div[2]/a")WebElement homephoneno;
	@FindBy(xpath="/html/body/section[2]/div/div/div[2]/div/ul/li[1]/div[2]")WebElement contactusadd;
	@FindBy(xpath="/html/body/section[2]/div/div/div[2]/div/ul/li[2]/div[2]/a")WebElement contactusemail;
	@FindBy(xpath="/html/body/section[2]/div/div/div[2]/div/ul/li[3]/div[2]/a")WebElement contactusphoneno;
	@FindBy(xpath="//*[@id=\"navigation\"]/ul/li[5]/a") WebElement contactus;
	@FindBy(xpath="/html/body/div[2]/nav/ul/li[10]/a")WebElement updatecontactinfo;
	@FindBy(xpath="/html/body/div[1]/ul/li/ul/li[2]/a") WebElement logout;
	@FindBy(xpath="/html/body/div[1]/ul/li/a/i") WebElement drop;
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/p/a") WebElement backtohome;
	public void checksuccessmessage() {
		boolean t =contactsuccess.isDisplayed();
		if (t) {
	         System.out.println("Element is dispalyed");
	      } else {
	         System.out.println("Element is not dispalyed");
	      }
		
	}
	public void contactinfobutton() {
		updatecontactinfo.click();
	}
	public void contactinfoadd(String addr) {
		contactadd.clear();
		contactadd.sendKeys(addr);
	}
	public void contactinfoemail(String email) {
		contactemail.clear();
		contactemail.sendKeys(email);
	}
	public void contactinfophoneno(String phoneno) {
		contactphoneno.clear();
		contactphoneno.sendKeys(phoneno);
	}
	public void updatecontactinfoupdatebutton() {
		contactupdatebutton.click();
	}
	public void checkupdatecontactinfo() {
		contactpage.isDisplayed();
		boolean t=contactpage.isDisplayed();
		 if (t) {
		        System.out.println("UpdateContactInfo Page header is dispalyed");
		     } else {
		        System.out.println("UpdateContactInfo Page  is not dispalyed");
		     }
	}
	public void checkhomeupdateinfo() {
		drop.click();
	    logout.click();
	    backtohome.click();
		String emailid="nehakoutika123@gmail.com";
		String phoneno="8639890782";
		String emailid1=homeemail.getText();
		String phoneno1=homephoneno.getText();
		if(emailid.equalsIgnoreCase(emailid1) ) {
			if(phoneno.equalsIgnoreCase(phoneno1)) {
			System.out.println("Matched");
		}
			else{System.out.println("Not Matched");}	
			}
		else {
			System.out.println("Not Matched");
		}
		}
	public void checkcontactus() {
		String add="Hno:10-14-15";
		String emailid="nehakoutika123@gmail.com";
		String phoneno="8639890782";
		String add1=contactusadd.getText();
		String emailid1=contactusemail.getText();
		String phoneno1=contactusphoneno.getText();
		System.out.println(add1);
		if(emailid.equalsIgnoreCase(emailid1)) {
			if(phoneno.equalsIgnoreCase(phoneno1)) {
				if(add.equalsIgnoreCase(add1)){
					System.out.println("Matched");
				}
			else{System.out.println("Not Matched");}
				}
			else {System.out.println("Not Matched");}
			}
		else {System.out.println("Not Matched");}
	}
	public void contactusbutton() {
		contactus.click();
	}
	public void checkpopupemialid(){
		String mess=contactemail.getAttribute("validationMessage");
		System.out.println(mess);
		if(mess.contains("Please include an '@' in the email address. 'nehakoutika123gmail.com' is missing an '@'.")) {
			System.out.println("popup is displayed");
		}
		else{
			System.out.println("popup is not displayed");
		}
	}
	public void checkpopupemialid1(){
		String mess=contactemail.getAttribute("validationMessage");
		System.out.println(mess);
		if(mess.contains("Please fill out this field.")) {
			System.out.println("popup is displayed");
		}
		else{
			System.out.println("popup is not displayed");
		}
	}
	public void checkpopupadd(){
		String mess=contactadd.getAttribute("validationMessage");
		System.out.println(mess);
		if(mess.contains("Please fill out this field.")) {
			System.out.println("popup is displayed");
		}
		else {
			System.out.println("popup is not displayed");
		}
		
	}
	public void checkpopupphoneno(){
		String mess=contactphoneno.getAttribute("validationMessage");
		System.out.println(mess);
		if(mess.contains("Please fill out this field.")) {
			System.out.println("popup is displayed");
		}
		else {
			System.out.println("popup is not displayed");
		}
		
	}
	public void clearadd() {
		contactadd.clear();
	}
	public void clearphone() {
		contactphoneno.clear();
	}
	public void clearemail() {
		contactemail.clear();
	}	
}
