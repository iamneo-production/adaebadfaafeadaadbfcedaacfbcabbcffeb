package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageSubscribersPage {
	public static WebDriver driver;
	 public ManageSubscribersPage(WebDriver driver) {
		 ManageSubscribersPage.driver=driver;
		 PageFactory.initElements(driver,this);
		}
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/h2")WebElement subscribersheader;
	 @FindBy(xpath="/html/body/div[2]/nav/ul/li[11]/a")WebElement managesubbutton ;
	 @FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[1]/td[4]/a/i")WebElement subcross1;
     @FindBy(xpath="/html/body/div[2]/div/div/div/div/div/div[2]/div[1]")WebElement subsuccess;

	 public void checkmanagesubscriberheader() {
		 boolean t=subscribersheader.isDisplayed();
		 if (t) {
		        System.out.println("Manage Subscribers Page header is dispalyed");
		     } else {
		        System.out.println("Manage Subscribers Page  is not dispalyed");
		     }
	 }
	 public void clickmanagesubscriber() {
		 managesubbutton.click();
	 }
	 public void clickoncross() {
		 subcross1.click();
	 }
	 public void checksuccessmessage() {
		 boolean t=subsuccess.isDisplayed();
			if (t) {
		        System.out.println("success message is dispalyed");
		     } else {
		        System.out.println("success message is not dispalyed");
		     }
	 }
}
