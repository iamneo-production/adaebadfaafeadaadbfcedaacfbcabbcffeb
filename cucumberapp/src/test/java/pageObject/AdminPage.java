package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	public static WebDriver driver;
	 public AdminPage(WebDriver driver) {
		 AdminPage.driver=driver;
		 PageFactory.initElements(driver,this);
		}
@FindBy(xpath="/html/body/div/div/div/div/div/h1") WebElement loginpage;
@FindBy(xpath="/html/body/div/div/div/div/div/div/div/form/input[1]") WebElement username ;
@FindBy(xpath="/html/body/div/div/div/div/div/div/div/form/input[2]") WebElement password ;
@FindBy(xpath="/html/body/div/div/div/div/div/div/div/form/button") WebElement loginbutton;

public void adminloginpage(){
	loginpage.isDisplayed();
}
public void adminusername(String name) {
	username.clear();
	username.sendKeys(name);
}
public void adminpass(String pass) {
	password.clear();
	password.sendKeys(pass);
	
}
public void adminloginbutton() {
	loginbutton.click();
}
}
