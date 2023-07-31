package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageContactUsQueryPage {
	
 public static WebDriver driver;
 public ManageContactUsQueryPage(WebDriver driver) {
	 ManageContactUsQueryPage.driver=driver;
	 PageFactory.initElements(driver,this);
	}
 @FindBy(xpath="/html/body/div[2]/div/div/div/div/h2") WebElement testheader;
 @FindBy(xpath="/html/body/div[2]/nav/ul/li[7]/a") WebElement testbutton;
 @FindBy(xpath="//*[@id=\"zctb_filter\"]/label/input") WebElement testsearch;
 @FindBy(xpath="//*[@id=\"zctb_length\"]/label/select")WebElement testshow;
 @FindBy(xpath="//*[@id=\"zctb_next\"]/a") WebElement testnext;
 @FindBy(xpath="//*[@id=\"zctb_previous\"]/a")WebElement testprev;
@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[1]/td[7]/a")WebElement testpending ;
 //@FindBy(xpath="//*[@id="zctb"]/tbody/tr[7]/td[7]/a")WebElement testinactive;
@FindBy(xpath="/html/body/div[1]/a") WebElement carrentalportal;
@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[1]") WebElement testtext;
 public void managecontactusquerybutton() {
	 testbutton.click();
 }
 public void managecontactusquerysearch(String text) throws InterruptedException {
	 testsearch.clear();
	 testsearch.sendKeys(text);
	 //Thread.sleep(1000);
 }
 public void managecontactusqueryfindtext() {
	 testtext.isDisplayed();
 }
 public void managecontactusqueryshow(String num) {
	 Select showdrop = new Select(testshow);
	 showdrop.selectByVisibleText(num);
 }
 public void managecontactusquerynext() {
	 testnext.click();
 }
 public void managecontactusqueryprev() {
	 testprev.click();
 }
 public void managecontactusquerypending() throws InterruptedException {
	 testpending.click();
	 //Thread.sleep(2000);
	 driver.switchTo().alert().accept();
 }
 public void checkcarrentalportal() {
	 carrentalportal.isDisplayed();
 }
 public void checkmanagecontactusquery() {
	 testheader.isDisplayed();
}
}