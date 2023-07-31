package stepDefinition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
import pageObject.AdminPage;
import pageObject.ManageContactUsQueryPage;
import pageObject.ManageVehiclespage;
import pageObject.PostaVehiclePage;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class KarthikStepdefinition {
	public WebDriver driver=null;
	public ManageContactUsQueryPage manage;
	public ManageVehiclespage managevehicle;
	public PostaVehiclePage postvehicle;
	public AdminPage admin;

	@After
	public void browser_tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}

	@When("user opens url {string}")
	public void user_opens_url(String string) throws MalformedURLException{

		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-dev-shm-usage");
		driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
        driver.get("https://carrental.neohire.io/");
		driver.manage().window().maximize();
	    manage =new ManageContactUsQueryPage(driver);
		managevehicle =new ManageVehiclespage(driver);
		postvehicle =new PostaVehiclePage(driver);
		admin=new AdminPage(driver);
	    driver.navigate().to("https://carrental.neohire.io/admin/");
	}

	@Then("user should able to see admin|signin page")
	public void user_should_able_see_the_admin_signin_page() {
		admin.adminloginpage();
	}

	@And("User should enter username as {string}  and passwrod ad {string}")
	public void user_should_enter_username_as_and_password_ad(String string, String string2) throws InterruptedException {
		admin.adminusername("admin");
		admin.adminpass("Test@12345");
		//Thread.sleep(1000);
	}

	@And("click on the login")
	public void click_on_login() throws InterruptedException {
		admin.adminloginbutton();
		//Thread.sleep(1000);
	}

	@Then("admin should able to view the car rental portal | admin panel")
	public void user_should_able_to_view_car_rental_portal_admin_panel() {
		manage.checkcarrentalportal();
	}

	@And("click on Manage Contactus Query")
	public void click_on_managecontactusquery() throws InterruptedException {
		manage.managecontactusquerybutton();
	    //Thread.sleep(2000);
	}

	@Then("admin should able to see the Manage Contact Us Queries page")
	public void user_should_able_to_see_the_manage_contactusquery_page() {
		manage.checkmanagecontactusquery();	
	}
	@And("admin checks the next option")
	public void clickingnextbutton() throws InterruptedException {
		manage.managecontactusquerynext();
		//Thread.sleep(1000);
		manage.managecontactusquerynext();
		//Thread.sleep(1000);
	}
	@Then("admin checks the previous option")
	public void clickingpreviousbutton() throws InterruptedException {
		manage.managecontactusqueryprev();
		//Thread.sleep(1000);
		manage.managecontactusqueryprev();
		//Thread.sleep(1000);
	}
	@And("admin enter the text")
	public void user_enter_the_text() throws InterruptedException {
	    manage.managecontactusquerysearch("sai teja pending");
	    
	}

	@Then("the details of entered text will appear")
	public void the_details_of_the_entered_text_will_appear() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		manage.managecontactusqueryfindtext();
	    //Thread.sleep(2000);
	}
	
	@When("admin checks the show entries")
	public void user_checks_the_show_entries() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    manage.managecontactusqueryshow("25");
	    //Thread.sleep(2000);
	    manage.managecontactusqueryshow("50");
	    //Thread.sleep(2000);
	    manage.managecontactusqueryshow("100");
	    //Thread.sleep(2000);
	    
	    
	}
	@Then("admin reads the pending queries")
	public void clickon_pending_and_read() throws InterruptedException{
		manage.managecontactusquerypending();
	}

	//managevehicles step definations
	@Then("user able see the admin login page")
	public void signin_page(){
		admin.adminloginpage();
	}

	@When("User enters username as {string} and passwrod as {string}")
	public void credentials(String string, String string2){
		admin.adminusername("admin");
		admin.adminpass("Test@12345");
	}

	@And("user clicks on login button")
	public void clicks_login(){
		admin.adminloginbutton();
	}

	@Then("admin should see car rental portal|admin panel")
	public void adminhome(){
		managevehicle.checkcarrental();
	}
	@When("admin clicks on vehicle dropdown and selects manage vehicles")
	public void user_clicks_on_vehicle_dropdown_and_selects_manage_vehicles(){
	    managevehicle.managevehiclesbutton();
	}
	@Then("admin should see manage vehicles page")
	public void checking_the_page() {
		managevehicle.checkmanagevehicles();
	}
	@When("admin clicks next")
	public void nextbutton(){
		managevehicle.managevehiclesnext();
	}
	@And("admin clicks previous")
	public void previousbutton(){
		managevehicle.managevehiclesprev();
	}
	@Then("its home page should be visible")
	public void checkhome() {
		managevehicle.check1stpage();
	}
	@When("admin will check the show entries")
	public void admin_will_check_the_show_entries(){
		managevehicle.managevehiclesshow("25");
	    managevehicle.managevehiclesshow("50");
	    managevehicle.managevehiclesshow("100");
	}
	@And("admin checks search box")
	public void admin_checks_search_box(){
		managevehicle.managevehiclessearch("hector");
	}
	@Then("admin deletes a vehicle")
	public void deletevehicle(){
		managevehicle.managevehicledelete();
		driver.switchTo().alert().accept();
		driver.navigate().to("https://carrental.neohire.io/admin/manage-vehicles.php");
	}
	
	@When("admin clicks edit option")
	public void admin_clicks_edit_option(){
		managevehicle.managevehiclesedit();
	}

	@Then("edit page should be shown")
	public void edit_page_should_be_shown(){
	    managevehicle.checkeditvehicles();
	}

	@When("admin makes changes")
	public void admin_makes_changes(){
		managevehicle.managevehiclesedittitle("bhavana");
		managevehicle.managevehicleseditppd("1000");
		managevehicle.managevehicleseditseating("7");
	    managevehicle.managevehicleseditbrand();
		managevehicle.managevehicleseditcheckboxes();
	}

	@And("clicks on save changes button")
	public void clicks_on_save_changes_button(){
		managevehicle.managevehicleseditsave();
	    
	}
	@Then("prompt messege will be displayed")
	public void prompt_messege_will_be_displayed() {
		managevehicle.doneedit();
    
	}
	@And("admin checks the updated details")
	public void admin_checks_the_updated_details(){
		driver.navigate().to("https://carrental.neohire.io/car-listing.php");
		managevehicle.checkedited();
	}

	//post a vehicle step definitions
	@Then("admin login page should be visible")
	public void admin_login_page_should_be_visible(){
		admin.adminloginpage();
	}

	@When("the username as {string} and password as {string}")
	public void the_username_as_and_password_as(String string, String string2){
		admin.adminusername("admin");
		admin.adminpass("Test@12345");
	}

	@And("clicks on login button")
	public void clicks_on_login_button(){
		admin.adminloginbutton();
	}

	@Then("admin home page should be visible")
	public void admin_home_page_should_be_visible(){
		postvehicle.checkcarrental();
	}

	@When("user clicks on vehicles category and selects post a vehicle")
	public void user_clicks_on_vehicles_category_and_selects_post_a_vehicle(){
		postvehicle.postavehiclebutton();
	}

	@Then("post a vehicle page should be visible")
	public void post_a_vehicle_page_should_be_visible(){
		postvehicle.checkpostingpage();
	}

	@And("user click save changes button")
	public void user_click_save_changes_button(){
		postvehicle.savechanges();
	}

	@And("enters the vehicle form")
	public void enters_the_vehicle_form(){
		postvehicle.form();
	}

	@And("clicks savechanges button")
	public void clicks_savechanges_button(){
		postvehicle.savechanges();
	}

	@Then("admin redirects to car listing page")
	public void admin_redirects_to_car_listing_page(){
		driver.navigate().to("https://carrental.neohire.io/car-listing.php");
	}

	@And("checks the posted vehicle is visible")
	public void checks_the_posted_vehicle_is_visible(){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		postvehicle.viewdetailsbutton();
	}
}