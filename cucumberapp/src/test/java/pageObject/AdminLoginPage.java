package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class AdminLoginPage {
	public static WebDriver driver;

	public AdminLoginPage(WebDriver driver) {
		AdminLoginPage.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="/html/body/header/nav/div/div[3]/ul/li[6]/a")
    WebElement adminLocator;
	@FindBy(name="username")
	WebElement usernameInputLocator;
	@FindBy(name="password")
	WebElement passwordInputLocator;
	@FindBy(name="login")
	WebElement loginButtonLocator;
	@FindBy(linkText="Back to Home")
	WebElement backToHomeLocator;
	
	public void clickAdminButton() {
		adminLocator.click();
	}
    public String adminSignInPage() {
		String adminPage = driver.getTitle();
		return adminPage;
    }
    public void enterUsername(String username) {
	 usernameInputLocator.sendKeys(username);
    }
 	public void enterPassword(String password) {
 		passwordInputLocator.sendKeys(password);
 	}
	public void clickLoginButton() {
		loginButtonLocator.click();
	}
	public void clickBacktoHomeLink() {
		backToHomeLocator.click();
	}
	public String getHomePageTitle() {
	String homePage = driver.getTitle();
		return homePage;
	}
}

