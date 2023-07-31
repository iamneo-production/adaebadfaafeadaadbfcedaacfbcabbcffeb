package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class DashBoardPage {
	public static WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		DashBoardPage.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Car Rental Portal | Admin Panel']")
	WebElement admininterface;
	@FindBy(xpath = "/html/body/div[1]/a")
	WebElement carRentalPortal;
	@FindBy(xpath = "/html/body/div[2]/nav/ul/li[2]/a")
	WebElement testDashButton;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div/div/div/div[1]/div/a")
	WebElement testRegButton;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/h2")
	WebElement testRegHeader;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div/div/div/div[2]/div/a")
	WebElement testListVehButton;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/h2")
	WebElement testManVehHeader;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div/div/div/div[3]/div/a")
	WebElement testTotBookButton;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/h2")
	WebElement testManBookHeader;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div/div/div/div[4]/div/a")
	WebElement testListBrandButton;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/h2")
	WebElement testManBrandHeader;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div/div/div[1]/div/a")
	WebElement testSubscibersButton;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/h2")
	WebElement testManSubHeader;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div/div/div[2]/div/a")
	WebElement testQueriesButton;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/h2")
	WebElement testManContactHeader;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div/div/div[3]/div/a")
	WebElement testTestimonialButton;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/h2")
	WebElement testManTestHeader;
	@FindBy(xpath = "/html/body/div[1]/ul/li/a")
	WebElement accountLocator;
	@FindBy(xpath = "/html/body/div[1]/ul/li/ul/li[2]/a")
	WebElement logoutLocator;

	public void checkCarRentalPortal() {
		carRentalPortal.isDisplayed();
	}
	public String AdminInterface() {
		admininterface.isDisplayed();
		String title = admininterface.getText();
		return title;
	}
	public void dashboardButton() {
		testDashButton.click();
	}
	public void regUserButton() {
		testRegButton.click();
	}
	public void regUserInterface() {
		if (testRegHeader.isDisplayed()) {
			System.out.println("Registered Users Interface is displayed");
		} else {
			System.out.println("Registered Users Interface is not displayed");
		}
	}
	public void listVehButton() {
		testListVehButton.click();
	}
	public void manVehInterface() {
		if (testManVehHeader.isDisplayed()) {
			System.out.println("Manage Vehicles Interface is displayed");
		} else {
			System.out.println("Manage Vehicles Interface is not displayed");
		}
	}
	public void totalBookButton() {
		testTotBookButton.click();
	}
	public void manBookInterface() {
		if (testManBookHeader.isDisplayed()) {
			System.out.println("Manage Bookings Interface is displayed");
		} else {
			System.out.println("Manage Bookings Interface is not displayed");
		}
	}
	public void listBrandButton() {
		testListBrandButton.click();
	}
	public void listBrandInterface() {
		if (testManBrandHeader.isDisplayed()) {
			System.out.println("Manage Brands Interface is displayed");
		} else {
			System.out.println("Manage Brands Interface is not displayed");
		}
	}
	public void subscibersButton() {
		testSubscibersButton.click();
	}
	public void subscibersInterface() {
		if (testManSubHeader.isDisplayed()) {
			System.out.println("Manage Subscribers Interface is displayed");
		} else {
			System.out.println("Manage Subscribers Interface is not displayed");
		}
	}
	public void queriesButton() {
		testQueriesButton.click();
	}
	public void queriesInterface() {
		if (testManContactHeader.isDisplayed()) {
			System.out.println("Manage Contact Us Queries Interface is displayed");
		} else {
			System.out.println("Manage Contact Us Queries Interface is not displayed");
		}
	}
	public void testimonialButton() {
		testTestimonialButton.click();
	}
	public void testimonialInterface() {
		if (testManTestHeader.isDisplayed()) {
			System.out.println("Manage Testimonial Interface is displayed");
		} else {
			System.out.println("Manage Testimonial Interface is not displayed");
		}
	}
	public void clickAccount() {
		accountLocator.click();
	}
	public void clickLogout() {
		logoutLocator.click();
	}
}


	
