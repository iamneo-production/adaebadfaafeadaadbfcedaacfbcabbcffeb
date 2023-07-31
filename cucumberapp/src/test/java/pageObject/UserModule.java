package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserModule {
	public static WebDriver driver;
	
	public UserModule(WebDriver driver) {
		UserModule.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="/html/body/header/div/div/div/div[2]/div/div[4]/a")
	WebElement userLoginLocator;
	@FindBy(xpath="//*[@id=\"loginform\"]/div/div/div[2]/div/div/div/form/div[1]/input")
	    WebElement emailLocator;
	@FindBy(xpath="//*[@id=\"loginform\"]/div/div/div[2]/div/div/div/form/div[2]/input")
	WebElement passLocator;
	@FindBy(name="login")
	WebElement loginLocator;
	@FindBy(xpath="//*[@id=\"navigation_bar\"]/div/div[2]/div[1]/ul/li/a")
	WebElement dropdownLocator;
	@FindBy(xpath="//*[@id=\"navigation_bar\"]/div/div[2]/div[1]/ul/li/ul/li[4]/a")
	WebElement postatestLocator;
	@FindBy(xpath="/html/body/header/div/div/div/div[2]/div")
	WebElement headerLocator;
	@FindBy(xpath="/html/body/section[1]/div[1]/div/div/h1")
	WebElement disPostaTest;
	@FindBy(name="testimonial")
	WebElement setPostaTest;
	@FindBy(name="submit")
	WebElement saveLocator;
	@FindBy(xpath="/html/body/section[2]/div/div[2]/div[2]/div/div")
	WebElement successmsg;
	@FindBy(name = "testimonial")
	WebElement validMessage;
	@FindBy(xpath="/html/body/div[2]/nav/ul/li[6]/a")
	WebElement manageTestLocator;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/h2")
	WebElement manageTestPage;
	@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[2]/td[2]")
	WebElement checktestimonial;
	@FindBy(xpath="//*[@id=\"navigation_bar\"]/div/div[2]/div[1]/ul/li/ul/li[6]/a")
	WebElement testSignOut;
	@FindBy(xpath="/html/body/header/nav/div/div[3]/ul/li[6]/a")
	    WebElement adminLocator;
	@FindBy(name="username")
	WebElement usernameInputLocator;
	@FindBy(name="password")
	WebElement passwordInputLocator;
	@FindBy(name="login")
	WebElement loginButtonLocator;
	   @FindBy(xpath="//a[text()='Car Rental Portal | Admin Panel']")
	   WebElement admininterface;
	
	public void clickUserLogin() {
	userLoginLocator.click();
	}
	public void enterEmail(String email) {
	emailLocator.sendKeys(email);
	}
	public void enterPass(String pass) {
	passLocator.sendKeys(pass);
	}
	public void clickLogin() {
	loginLocator.click();
	}
	public void userLogin(String email,String pass) {
	enterEmail(email);
	enterPass(pass);
	}
	public void clickDropdown() {
	dropdownLocator.click();
	}
	public void clickpost() {
	postatestLocator.click();
	}
	public void welcomeMsg() {
	headerLocator.isDisplayed();
	}
	public void postATestMsg() {
	disPostaTest.isDisplayed();
	}
	public void enterPostATestimonial(String post) {
	setPostaTest.sendKeys(post);
	}
	public void clickSave() {
	saveLocator.click();
	}
	public String getSuccessMsg() {
	String message = successmsg.getText();
	return message;
	}
	public String getValidationMsg() {
	String message = validMessage.getAttribute("validationMessage");
	return message;
	}
	public void clickManageTestimonial() {
	manageTestLocator.click();
	}
	public void manageTestPageTitle() {
	manageTestPage.isDisplayed();
	}
	public void checkPostedTest() {
	checktestimonial.isDisplayed();
	}
	public void clickSignOut() {
	testSignOut.click();
	}
	
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
	public String AdminInterface() {    
	       admininterface.isDisplayed();
	    String title = admininterface.getText();
	    return title;
	   }
	public String getHomePageTitle() {
	String homePage = driver.getTitle();
	return homePage;
	}
}