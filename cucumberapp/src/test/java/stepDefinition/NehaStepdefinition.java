 package stepDefinition;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.cucumber.java.After;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObject.*;
import io.cucumber.java.en.*;
import pageObject.ManageTestimonialPage;
import pageObject.UpdateContactInfoPage;

public class NehaStepdefinition {
	public WebDriver driver=null;
	public ManageTestimonialPage manage;
	public AdminPage admin;
	public ManageSubscribersPage managesub;
	public UpdateContactInfoPage contactinfo;
	public ManagePages managepage;
	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
	@SuppressWarnings("deprecation")
	@Given("user opens the url {string}")
	public void user_opens_url(String string)throws MalformedURLException{
		// DesiredCapabilities capabilities = new DesiredCapabilities();
        // capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
        // driver = new RemoteWebDriver(new URL("http://34.85.242.216:4456"),capabilities);
		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		// driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-dev-shm-usage");
		driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
        driver.get("https://carrental.neohire.io/");
		driver.manage().window().maximize();
	    manage =new ManageTestimonialPage(driver);
		admin=new AdminPage(driver);
		contactinfo=new UpdateContactInfoPage(driver);
		managesub=new ManageSubscribersPage(driver);
		managepage =new ManagePages(driver);
		driver.manage().window().maximize();
	    driver.navigate().to("https://carrental.neohire.io/admin/");
	}

	@Then("user should able see the admin|signin page")
	public void user_should_able_see_the_admin_signin_page() {
		admin.adminloginpage();
	}

	@And("User should enter username as {string}  and password ad {string}")
	public void user_should_enter_username_as_and_password_ad(String string, String string2)  {
		admin.adminusername("admin");
		admin.adminpass("Test@12345");
	}

	@And("click on login")
	public void click_on_login(){
		admin.adminloginbutton();
	}

	@Then("user should able to view car rental portal | admin panel")
	public void user_should_able_to_view_car_rental_portal_admin_panel() {
		manage.checkcarrentalportal();
	}

	@And("click on Manage Testimonials")
	public void click_on_manage_testimonials() {
		manage.managetestimonialbutton();
	}

	@Then("user should able to see the Manage Testimonials page")
	public void user_should_able_to_see_the_manage_testimonials_page() {
		manage.checkmanagetestimoinal();
		
	}
	@When("user enter the text")
	public void user_enter_the_text() {
	    manage.testimonialsearch("neha");
	}

	@Then("the details of the entered text will appear")
	public void the_details_of_the_entered_text_will_appear(){
	    manage.testimonialfindtext();
	}
	@When("user click on show dropdown and select a number")
	public void user_click_on_show_dropdown_and_select_a_number(){
		 manage.testimonialshow("25");
	}
	@Then("user should see the table with selected number of rows")
	public void user_should_see_the_table_with_selected_number_of_rows() {
		System.out.println("yes");
	}
	@When("User should click on the next button")
	public void user_should_click_on_the_next_button(){
	    manage.managetestimonialnext();
	}

	@Then("user should able to see new table")
	public void user_should_able_to_see_new_table(){
	    manage.checknexttable();
	}
	
	@And("User should click on the previous button")
	public void user_should_click_on_the_previous_button(){
		manage.managetestimonialprev();
	}

	@Then("user should able to see previous table")
	public void user_should_able_to_see_previous_table(){
		manage.checknexttable();
	}
	@When("click on Inactive")
	public void click_on_inactive(){
	   manage.managetestimonialinactive();
	}

	@And("click on Okay")
	public void click_on_okay(){
	    driver.switchTo().alert().accept();
	}

	@Then("user should able see the success message")
	public void user_should_able_see_the_success_message(){
	    manage.checksuccessmessage();
	}
	
	@Then("check the active message is displayed in home page")
	public void check_the_active_message_is_displayed_in_home_page(){
		manage.checkactivemessagedisplay();
	}
	@And("click on Cancel")
	public void click_on_cancel(){
	    driver.switchTo().alert().dismiss();   
	}

	@Then("user should be in the same page")
	public void user_should_be_in_the_same_page() {
	    manage.checkmanagetestimoinal();
	}
	@Then("user should able to see the success message of inactive")
	public void user_should_able_to_see_the_success_message_of_inactive(){
		manage.checksuccessmessage();
	}

	@When("click on active")
	public void click_on_active() {
	    manage.managetestimonialactive();
	}
	@Then("check the inactive message is not displayed in home page")
	public void check_the_inactive_message_is_not_displayed_in_home_page() {
		 manage.checkinactivenotdisplay();
	}
	
	@And("click on UpdateContactInfo")
	public void click_on_update_contact_info(){
	    contactinfo.contactinfobutton();
	}

	@Then("user should able to see the Updatecontactinfo page")
	public void user_should_able_to_see_the_updatecontactinfo_page(){
	    contactinfo.checkupdatecontactinfo();
	}
	@When("user enter the address")
	public void user_enter_the_address(){
	    contactinfo.contactinfoadd("Hno:10-14-15");
	}

	@And("user enter the emailid")
	public void user_enter_the_emailid(){
	    contactinfo.contactinfoemail("nehakoutika123@gmail.com");
	}

	@And("user enter the phonenumber")
	public void user_should_enter_the_phonenumber(){
	    contactinfo.contactinfophoneno("8639890782");
	}

	@Then("click on update button")
	public void click_on_update_button(){
	    contactinfo.updatecontactinfoupdatebutton();
	}

	@Then("user should able see the success message on contactus")
	public void user_should_able_see_the_success_message_on_contactus(){
	    contactinfo.checksuccessmessage();
	}
	
	@Then("user should able to see the update info in the home page")
	public void user_should_able_to_see_the_update_info_in_the_home_page() {
	    contactinfo.checkhomeupdateinfo();
	}
	@Then("user should able to see the update info in the contactus page")
	public void user_should_able_to_see_the_update_info_in_the_contactus_page() {
	    contactinfo.checkcontactus();
	}
	@And("user enter the invalid email")
	public void user_enter_the_invalid_email(){
		contactinfo.contactinfoemail("nehakoutika123gmail.com");
	}

	@Then("user should see the popup message that enter the valid email id")
	public void user_should_see_the_popup_message_that_enter_the_valid_email_id() {
		 contactinfo.checkpopupemialid();
	}
	
	@And("user enter the invalid phonenumber")
	public void user_enter_the_invalid_phonenumber(){
		contactinfo.contactinfophoneno("863989");
	}

	@Then("user should see the popup message that enter the field address")
	public void user_should_see_the_popup_message_that_enter_the_field_address() {
		contactinfo.checkpopupadd();
	}
	@When("clear the address field")
	public void clear_the_address_field() {
		contactinfo.clearadd();
	}
	@Then("user should see the popup message that enter the field email")
	public void user_should_see_the_popup_message_that_enter_the_field_email() {
		 contactinfo.checkpopupemialid1();
	}

	@Then("user should see the popup message that enter the field phonenumber")
	public void user_should_see_the_popup_message_that_enter_the_field_phonenumber() {
	    contactinfo.checkpopupphoneno();
	}
	@When("clear the emailid field")
	public void clear_the_emailid_field(){
		contactinfo.clearemail();
	}
	@When("clear the phonenumber field")
	public void clear_the_phonenumber_field(){
		contactinfo.clearphone();
	}

	@When("user should clear all the three fields")
	public void user_should_clear_all_the_three_fields() {
		contactinfo.clearemail();
		contactinfo.clearphone();
		contactinfo.clearadd();
	}

	@Then("click on Manage Subscribers Page")
	public void click_on_manage_subscribers_page(){
		 managesub.clickmanagesubscriber();
	}

	@Then("user should able to see the Manage Subscribers page")
	public void user_should_able_to_see_the_manage_subscribers_page() {
	  managesub.checkmanagesubscriberheader();
	}

    @When("click on cross mark")
    public void click_on_cross_mark(){
      managesub.clickoncross();
    }
    @Then("user should see the success message")
    public void user_should_see_the_success_message(){
        managesub.checksuccessmessage();
    }

	@Then("user is still in the same page")
	public void user_is_still_in_the_same_page(){
	    managesub.checkmanagesubscriberheader();
	} 
    
    @Then("click on ManagePages")
    public void click_on_manage_pages() {
        managepage.clickmanagepages();
    }

    @Then("user should see the Manage Pages Page")
    public void user_should_see_the_manage_pages_page() {
        managepage.checkmanagepagesheader();
    }
    @When("user click on select page dropdown and select terms and conditions")
    public void user_click_on_select_page_dropdown_and_select_terms_and_conditions(){
        managepage.selectpagedropdown("terms and condition");
    }

    @And("user should enter the information in the page details")
    public void user_should_enter_the_information_in_the_page_details(){
        managepage.enterinfoinpagedetails("Ketone");
    }

    @When("user should enter the information in the page details of privacy")
    public void user_should_enter_the_information_in_the_page_details_of_privacy(){
    	 managepage.enterinfoinpagedetails("Alkane privacy");
    }

    @And("click on update")
    public void click_on_update() {
        managepage.clickupdatebutton();
    }
    @Then("user should able see the success notification")
    public void user_should_able_see_the_success_notification(){
        managepage.checksuccessmessage();
    }
    @When("user click on select page dropdown and select privacy and policy")
    public void user_click_on_select_page_dropdown_and_select_privacy_and_policy(){
    	managepage.selectpagedropdown("privacy and policy");
    }

    @And("user should see the privacy and policy page with updated information")
    public void user_should_see_the_privacy_and_policy_page_with_updated_information(){
        managepage.checkprivacyinfo();
    }
    @When("user click on select page dropdown and select about us")
    public void user_click_on_select_page_dropdown_and_select_about_us(){
    	managepage.selectpagedropdown("aboutus");
    }

    @And("user should enter the information in the page details of about us")
    public void user_should_enter_the_information_in_the_page_details_of_about_us(){
    	managepage.enterinfoinpagedetails("alkene aboutus");
    }

    @When("user click on select page dropdown and select FQAs")
	public void user_click_on_select_page_dropdown_and_select_fq_as(){
	    managepage.selectpagedropdown("FAQs");	
    }
	
	@And("user should enter the information in the page details of FQAs")
	public void user_should_enter_the_information_in_the_page_details_of_fq_as(){
	  managepage.enterinfoinpagedetails("Any doubts faqs");
	}
	

	@Then("user go to terms and condition page")
	public void user_go_to_terms_and_condition_page() {
	   driver.navigate().to("https://carrental.neohire.io/page.php?type=terms");
	}
	@Then("user go to privacy and policy page")
	public void user_go_to_privacy_and_policy_page() {
	    driver.navigate().to("https://carrental.neohire.io/page.php?type=privacy");
	}

	@Then("user go to about us page")
	public void user_go_to_about_us_page() {
		driver.navigate().to("https://carrental.neohire.io/page.php?type=aboutus");
	}

	@Then("user go to FQAs page")
	public void user_go_to_fq_as_page() {
		driver.navigate().to("https://carrental.neohire.io/page.php?type=faqs");
	}
	@Then("user should navigate to contactus page")
	public void user_should_navigate_to_contactus_page() {
	    driver.navigate().to("https://carrental.neohire.io/contact-us.php");
	}	
	@Then("user should see the terms and conditions page with updated information")
    public void user_should_see_the_terms_and_conditions_page_with_updated_information() {
        managepage.checktermsofuseinfo();
    }
	@Then("user should see the about us page with updated information")
		public void user_should_see_the_about_us_page_with_updated_information() {
			managepage.checkaboutusinfo();	
		}
	@Then("user should see the FQAs page with updated information")
	public void user_should_see_the_fq_as_page_with_updated_information() {
	   managepage.checkfaqsinfo();
	   
	}
}
