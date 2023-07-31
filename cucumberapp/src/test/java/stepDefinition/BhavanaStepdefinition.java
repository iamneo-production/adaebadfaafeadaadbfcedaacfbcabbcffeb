package stepDefinition;

import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObject.AdminLoginPage;
import pageObject.CreateBrandPage;
import pageObject.DashBoardPage;
import pageObject.ManageBrandPage;
import io.cucumber.java.After;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BhavanaStepdefinition {

	public static WebDriver driver=null;
	public AdminLoginPage loginPage;
	public DashBoardPage dashboard;
	public CreateBrandPage createBrand;
	public ManageBrandPage manageBrand;

	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

	@Given("admin launch the browser")
	public void admin_launch_the_browser() throws MalformedURLException{
		
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-dev-shm-usage");
		driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
        driver.get("https://carrental.neohire.io/");
		driver.manage().window().maximize();
		loginPage = new AdminLoginPage(driver);
		dashboard = new DashBoardPage(driver);
		createBrand = new CreateBrandPage(driver);
		manageBrand = new ManageBrandPage(driver);
		System.out.println("User Succesfully launched Chrome Browser");
	}

    @When("admin opens the url {string}")
	public void admin_opens_the_url(String url){
		//Here driver opens the Car Rental Website
		driver.get(url);
		loginPage = new AdminLoginPage(driver);
		driver.manage().window().maximize();
		
		 //Here We are checking Website Interface is launched or not
		WebElement Interface=  driver.findElement(By.xpath("//img[@alt='image']"));
		if(Interface.isDisplayed())
		 {
			System.out.println("Car Rental Website Succesfully Launched");
			
		}
		else {
			System.out.println("Website is not opened");
		}
	}
	
	@When("admin clicks on Admin module")
	public void admin_clicks_on_admin_module() {
		loginPage=new AdminLoginPage(driver);
		//Here we are clicking on admin module
		loginPage.clickAdminButton();
	}
	
	@Then("admin navigates to Admin|SignIn page")
	public void admin_navigates_to_admin_sign_in_page() {
		String adminpage = loginPage.adminSignInPage();
		System.out.println(adminpage+" page is displayed");
	}
	
	@When("admin enters username as {string}  and password as {string}")
	public void admin_enters_username_as_and_password_as(String string, String string2) {
		loginPage.enterUsername("admin");
		loginPage.enterPassword("Test@12345");
	}
	
	@When("click on login button")
	public void click_on_login_button1() {
		loginPage.clickLoginButton();
	}

	@Then("admin should able to view car rental portal | admin panel")
	public void admin_should_able_to_view_car_rental_portal_admin_panel() {
		dashboard=new DashBoardPage(driver);
		String title = "Car Rental Portal | Admin Panel";		
		String actualtitle = dashboard.AdminInterface();
        if (title.equals(actualtitle)) {
        	System.out.println("Admin Login Page is Successfully Opened");
        } else {
        	System.out.println("Admin Login Page is Not Opened");
        }
	}

	@When("admin enters invalid {string} and {string}")
	public void admin_enters_invalid_and(String username, String password) {
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
	}

	@Then("admin should see an error message indicating {string}")
	public void admin_should_see_an_error_message_indicating(String string) {
		Alert alert = driver.switchTo().alert();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage+" alert message will be displayed");
		alert.accept();
		Assert.assertTrue(true);
	}

	@When("admin click on the Back to Home link")
    public void admin_click_on_the_back_to_home_link() {
	loginPage.clickBacktoHomeLink();
    }
	
	@Then("admin should be redirected to the home page")
	public void admin_should_be_redirected_to_the_home_page() {
		loginPage=new AdminLoginPage(driver);
		String homePage = loginPage.getHomePageTitle();
		System.out.println(homePage+ " page is displayed");
	}
//Dashboard step definitions
	@When("admin opens url {string}")
	public void admin_opens_url(String url) {
		//Here admin opens the admin sign in page
		driver.get(url);
	}

	@When("admin click on Dashboard")
	public void admin_click_on_dashboard() {
		dashboard.dashboardButton();
	}

	@When("click on Reg Users Full Detail link")
	public void click_on_reg_users_full_detail_link() {
		//Here we are clicking on reg user in dashboard
		dashboard.regUserButton();
	}

	@Then("admin should be navigated to Registered Users Page")
	public void admin_should_be_navigated_to_registered_users_page() {
		//Here we are verifying Registered User Interface
		dashboard.regUserInterface();
		 WebElement sno1 = driver.findElement(By.xpath("//*[@id=\"zctb\"]/tbody/tr[1]/td[1]"));
			if(sno1.isDisplayed()) {
				System.out.println("Registered Users details are present");
			}
			else {
				System.out.println("Registered Users details are empty");
			}
		driver.navigate().back();
	}

	@When("admin click on Listed Vehicles Full Detail link")
	public void admin_click_on_listed_vehicles_full_detail_link() {
		dashboard.listVehButton();
	}

	@Then("admin should be navigated to Manage Vehicles Page")
	public void admin_should_be_navigated_to_manage_vehicles_page() {
		//Here we are verifying Manage Vehicles Interface
		dashboard.manVehInterface();
		 WebElement sno1 = driver.findElement(By.xpath("//*[@id=\"zctb\"]/tbody/tr[1]/td[1]"));
			if(sno1.isDisplayed()) {
				System.out.println("Manage Vehicles details are present");
			}
			else {
				System.out.println("Manage Vehicles details are empty");
			}
		driver.navigate().back();
	}

	@When("admin click on Total Bookings Full Detail link")
	public void admin_click_on_total_bookings_full_detail_link() {
		dashboard.totalBookButton();
	}

	@Then("admin should be navigated to Manage Bookings Page")
	public void admin_should_be_navigated_to_manage_bookings_Page() {
		//Here we are verifying Manage Bookings Interface
		dashboard.manBookInterface();
		 WebElement sno1 = driver.findElement(By.xpath("//*[@id=\"zctb\"]/tbody/tr[1]/td[1]"));
			if(sno1.isDisplayed()) {
				System.out.println("Manage Bookings details are present");
			}
			else {
				System.out.println("Manage Bookings details are empty");
			}
		driver.navigate().back();
	}

	@When("admin click on Listed Brands Full Detail link")
	public void admin_click_on_listed_brands_full_detail_link() {
		dashboard.listBrandButton();
	}

	@Then("admin should be navigated to Manage Brands Page")
	public void admin_should_be_navigated_to_manage_brands_Page() {
		//Here we are verifying Manage Brands Interface
				dashboard.listBrandInterface();	
				 WebElement sno1 = driver.findElement(By.xpath("//*[@id=\"zctb\"]/tbody/tr[1]/td[1]"));
					if(sno1.isDisplayed()) {
						System.out.println("Manage Brands details are present");
					}
					else {
						System.out.println("Manage Brands details are empty");
					}
		driver.navigate().back();
	}

	@When("admin click on Subscibers Full Detail link")
	public void admin_click_on_subscibers_full_detail_link() {
		dashboard.subscibersButton();
	}

	@Then("admin should be navigated to Manage Subscribers Page")
	public void admin_should_be_navigated_to_manage_subscribers_Page() {
		//Here we are verifying Manage subscibers Interface
		dashboard.subscibersInterface();
		 WebElement sno1 = driver.findElement(By.xpath("//*[@id=\"zctb\"]/tbody/tr[1]/td[1]"));
			if(sno1.isDisplayed()) {
				System.out.println("Manage Subscibers details are present");
			}
			else {
				System.out.println("Manage Subscibers details are empty");
			}
		driver.navigate().back();
	}

	@When("admin click on Queries Full Detail link")
	public void admin_click_on_queries_full_detail_link() {
		dashboard.queriesButton();
	}

	@Then("admin should be navigated to Manage Contact Us Queries Page")
	public void admin_should_be_navigated_to_manage_contact_us_queries_Page() {
		//Here we are verifying Manage Contact Us Queries Interface
				dashboard.queriesInterface();		
				 WebElement sno1 = driver.findElement(By.xpath("//*[@id=\"zctb\"]/tbody/tr[1]/td[1]"));
					if(sno1.isDisplayed()) {
						System.out.println("Manage Contact Us Queries details are present");
					}
					else {
						System.out.println("Manage Contact Us Queries details are empty");
					}
		driver.navigate().back();
	}

	@When("admin click on Testimonials Full Detail link")
	public void admin_click_on_testimonials_full_detail_link() {
		dashboard.testimonialButton();
	}

	@Then("admin should be navigated to Manage Testimonials Page")
	public void admin_should_be_navigated_to_manage_testimonials_Page() {
		//Here we are verifying Manage Testimonials Interface
				dashboard.testimonialInterface();
				 WebElement sno1 = driver.findElement(By.xpath("//*[@id=\"zctb\"]/tbody/tr[1]/td[1]"));
					if(sno1.isDisplayed()) {
						System.out.println("Manage Testimonials details are present");
					}
					else {
						System.out.println("Manage Testimonials details are empty");
					}
		driver.navigate().back();
	}

	@When("admin click on Account option")
	public void admin_click_on_account_option() {
		dashboard.clickAccount();
	}

	@When("clicks on Logout")
	public void clicks_on_logout() {
		dashboard.clickLogout();
	}

//create brand step definitions
	@When("admin click on Brands")
	public void admin_click_on_brands() {
		createBrand.clickBrands();
	}

	@When("click on Create Brand")
	public void click_on_create_brand() {
		createBrand.clickCreateBrands();
	}

	@Then("admin will navigates to create Brand Page")
	public void admin_will_navigates_to_create_brand_page() {
		createBrand.createBrandInterface();		
	}

	@When("admin enter Brand name in the text field")
	public void i_enter_brand_name_in_the_text_field() {
		createBrand.enterBrandName("BMW");
	}

	@When("admin click on Submit button")
	public void admin_click_on_submit_button() {
		createBrand.clickSubmit();
	}

	@Then("Success message will be displayed")
	public void success_message_will_be_displayed() {
		String msg = createBrand.getMessage();
		System.out.println(msg);
	}

	@When("admin navigates to {string}")
	public void admin_navigates_to(String url) {
		//Here admin navigates to car listing page 
		driver.get(url);
	}

	@When("click on select brand dropdown menu")
	public void click_on_select_brand_dropdown_menu() {
		createBrand.clickSelectBrandDropdown();
	}
	
	@Then("verify the brand name")
	public void verify_the_brand_name() {
		//Here brand name is verified in car listing page
		createBrand.findYourCar();
	}
	
	@Then("alert message will be displayed")
	public void alert_message_will_be_displayed() {
		String message = createBrand.getValMessage();
		System.out.println(message+" alert message will be displayed");
	}

	//manage brand step definitions
	@When("click on select brand dropdown")
	public void click_on_select_brand_dropdown() {
		manageBrand.clickSelectBrand();
	}
	
	@Then("verify the updated brand name")
	public void verify_the_updated_brand_name() {
		manageBrand.findBrandName();
	}

	@When("click on Manage Brands")
	public void click_on_manage_brands() {
		manageBrand.clickManageBrand();
	}

	@Then("admin will navigate to Manage Brands Page")
	public void admin_will_navigate_to_manage_brands_page() {
		manageBrand.ManageBrandInterface();
	}

	@When("admin selects show entries")
	public void admin_selects_show_entries() {
		manageBrand.clickShowDropdown("10");
		manageBrand.clickShowDropdown("25");
		manageBrand.clickShowDropdown("50");
		manageBrand.clickShowDropdown("100");
	}

	@When("admin search for the brand name")
	public void admin_search_for_the_brand_name() {
		manageBrand.enterSearchField("BMW");
	}

	@Then("filtered result will be displayed")
	public void filtered_result_will_be_displayed() {
		// manageBrand.getSearchedBrandName();
		String fil_msg = manageBrand.getFilteredBrand();
		System.out.println(fil_msg);
	}

	@When("admin clicks on Next button")
	public void admin_clicks_on_next_button() {
		manageBrand.clickNextButton();
	}

	@When("Previous button")
	public void previous_button() {
		manageBrand.clickPreviousButton();
	}

	@Then("entries will be displayed")
	public void entries_will_be_displayed() {
		manageBrand.getEntries();
	}

	@When("admin click edit option in action")
	public void admin_click_edit_option_in_action() {
		manageBrand.clickEdit();
	}

	@Then("it navigates to Update Brand page")
	public void it_navigates_to_update_brand_page() {
		manageBrand.getUpdateBrandTitle();
	}

	@When("admin updates the brand name")
	public void admin_updates_the_brand_name() {
		manageBrand.enterUpdateBrandName("Audi");
	}

	@When("click on submit button")
	public void click_on_submit_button() {
		createBrand.clickSubmit();
	}

	@Then("the success message will be displayed")
	public void the_success_message_will_be_displayed() {
		String message = manageBrand.getSuccessMessage();
		System.out.println(message);
	}

	@Then("Updation date also displayed")
	public void Updation_date_also_displayed() {
		driver.navigate().back();
		driver.navigate().back();
		manageBrand.getUpdationDate();
	}

	@When("admin click on delete option in action")
	public void admin_click_on_delete_option_in_action() {
		manageBrand.enterSearchField("BMW");
		manageBrand.clickDelete();
	}

	@Then("confirm alert displays and accept it")
	public void confirm_alert_displays_and_accept_it() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@Then("success page updated message will be displayed")
	public void success_page_updated_message_will_be_displayed() {
		String suc_msg = manageBrand.getSuccessUpdateMessage();
		System.out.println(suc_msg);
	}

	@Then("confirm alert displays and reject it")
	public void confirm_alert_displays_and_reject_it() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	@Then("admin will be on manage brand page")
	public void admin_will_be_on_manage_brand_page() {
		manageBrand.ManageBrandInterface();
	}	
}
	
	
	















