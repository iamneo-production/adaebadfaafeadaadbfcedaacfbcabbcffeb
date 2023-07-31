package stepDefinition;
import java.net.MalformedURLException;
import org.junit.Assert;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import pageObject.ContactUsPage;
import pageObject.FAQPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.net.URL;

public class ChetanaStepDefinitions {

	public WebDriver driver=null;
	public ContactUsPage ContactUsPage;
	 public FAQPage FAQPage;
    @After
	public void tearDown(){
      if(driver!=null){
		driver.quit();
	  }
	}
	@Given("User Launch chrome browser")
	public void user_launch_chrome_browser() throws MalformedURLException {
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-dev-shm-usage");
		driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
        driver.get("https://carrental.neohire.io/");
		driver.manage().window().maximize();
        ContactUsPage = new ContactUsPage(driver);
	    FAQPage=new FAQPage(driver); 
	}
	@When("User opens url {string}")
	public void user_opens_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get(string);
	} 
	@When("Click on FAQ Login")
	public void click_on_faq_login() {
		 FAQPage.checkFAQButton();
	}
	@Then("User should be able to view the message")
	public void user_should_be_able_to_view_the_message() {
		FAQPage.checkFAQMessage();
		System.out.println("FAQ page is displayed ");
		tearDown();
	}
	@When("Click on ContactUs Login")
	public void click_on_contact_us_login() {
	   System.out.println("ContactUs page is displayed");
	}
	@When("User Enter valid FullName,Invalid EmailAddress,valid PhoneNumber,valid Message")
	public void user_enter_valid_full_name_invalid_email_address_valid_phone_number_valid_message() throws InterruptedException {
	    ContactUsPage.setFullName("Admin");
	    ContactUsPage.setEmailId("admin22gmail.com");
	    ContactUsPage.setPhoneNumber("1234567890");
	    ContactUsPage.setMessage("I want latest car updates");
	    if(driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/form/div[5]/button")).isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("Unsuccessful Credentials");
			System.out.println("Please include '@' in emailaddress");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("SUCCESS:Query Sent. We will contact you shortly");
		}
	    }
		@When("User Enter valid FullName,valid EmailAddress,Invalid PhoneNumber,valid Message")
	public void user_enter_valid_full_name_valid_email_address_invalid_phone_number_valid_message() throws InterruptedException {
		ContactUsPage.setFullName("Admin");
	    ContactUsPage.setEmailId("admin@gmail.com");
	    ContactUsPage.setPhoneNumber("Hi");
	    ContactUsPage.setMessage("I want latest car updates");
	    if(driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/form/div[5]/button")).isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("Unsuccessful Credentials");
			System.out.println("Please match the requested format");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("SUCCESS:Query Sent. We will contact you shortly");
			
		}   
	}

	@When("User Enter Invalid FullName,Invalid EmailAddress,Invalid PhoneNumber,Invalid Message")
	public void user_enter_invalid_full_name_invalid_email_address_invalid_phone_number_invalid_message() {
		ContactUsPage.setFullName("");
	    ContactUsPage.setEmailId("");
	    ContactUsPage.setPhoneNumber("");
	    ContactUsPage.setMessage("");
	    if(driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/form/div[5]/button")).isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("Unsuccessful Credentials");
			System.out.println("Please fill out this field");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("SUCCESS:Query Sent. We will contact you shortly");
		}    
	}

	@When("User Enter valid FullName,valid EmailAddress,valid PhoneNumber,valid Message")
	public void user_enter_valid_full_name_valid_email_address_valid_phone_number_valid_message()  { 
		ContactUsPage.setFullName("Admin");
	    ContactUsPage.setEmailId("admin@gmail.com");
	    ContactUsPage.setPhoneNumber("1234567890");
	    ContactUsPage.setMessage("I want latest car updates");
	    if(driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div[1]")).isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("SUCCESS:Query Sent. We will contact you shortly");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("Query Failed");
		}		   
	}

	@When("Click on Send Message button")
	public void click_on_send_message_button() {
		ContactUsPage.checkSendMessageButton();
		tearDown();
	}

	@Then("User should be able to view the Admin Page")
	public void user_should_be_able_to_view_the_admin_page() {	 
		ContactUsPage.setAdminPage();
	   System.out.println("Admin successful");
	}

	@When("User Enter UserName,Password")
	public void user_enter_user_name_password() {	 
		ContactUsPage.setUserName("admin");
		ContactUsPage.setPassword("Test@12345");
	}

	@When("Click on Login")
	public void click_on_login() {	 
		ContactUsPage.setLogin();
	    System.out.println("Login successful");
	}

	@When("User Click on ManageContactUsQuery")
	public void user_click_on_manage_contact_us_query() {	 
		ContactUsPage.setManageContactUsQueryClick();
	}

	@Then("Verify the ManageContactUsPage")
	public void verify_the_manage_contact_us_page() {	 
		ContactUsPage.setManageContactUsQueryPage1();
	}

	@When("Click on Search button")
	public void click_on_search_button() {	 
		ContactUsPage.setSearchBoxClick("Admin");
	}

	@When("Enter anyone details among valid FullName,valid EmailAddress,valid PhoneNumber,valid Message,valid PostingDate,valid Action")
	public void enter_anyone_details_among_valid_full_name_valid_email_address_valid_phone_number_valid_message_valid_posting_date_valid_action() {
		ContactUsPage.adminFullName();
		ContactUsPage.adminEmailAddress();
		ContactUsPage.adminPhoneNumber();
		ContactUsPage.adminMessage();
		ContactUsPage.setPostingDate();
	}

	@When("Click on action button")
	public void click_on_action_button() throws InterruptedException {	 
	    ContactUsPage.setReadAction();	  
	}
	
	}
