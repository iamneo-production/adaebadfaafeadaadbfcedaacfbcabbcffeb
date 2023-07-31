package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageBrandPage {
	public static WebDriver driver;
	public ManageBrandPage(WebDriver driver) {
		ManageBrandPage.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "/html/body/div[2]/nav/ul/li[3]/ul/li[2]/a")
	WebElement manageBrandLocator;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/h2")
	WebElement manageBrandTitle;
	@FindBy(xpath = "//*[@id=\"zctb_length\"]/label/select")
	WebElement show;
	@FindBy(xpath = "//*[@id=\"zctb_filter\"]/label/input")
	WebElement search;
	@FindBy(xpath = "//*[@id=\"zctb_next\"]/a")
	WebElement nextLocator;
	@FindBy(xpath = "//*[@id=\"zctb_previous\"]/a")
	WebElement previousLocator;
	@FindBy(xpath = "//*[@id=\"zctb_info\"]")
	WebElement entriesLocator;
	@FindBy(xpath = "//*[@id=\"zctb\"]/tbody/tr[4]/td[5]/a[1]")
	WebElement editLocator;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/h2")
	WebElement updateBrandTitle;
	@FindBy(xpath = "//*[@id=\"brand\"]")
	WebElement updateBrandName;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div/div/div/div[2]/form/div[1]")
	WebElement successMessage;
	@FindBy(xpath = "//*[@id=\"zctb\"]/tbody/tr[1]/td[5]/a[2]/i")
	WebElement deleteLocator;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div/div[2]/div[1]")
	WebElement successUpdate;
	@FindBy(xpath = "//*[@id=\"zctb\"]/tbody/tr[4]/td[4]")
	WebElement updateDate;
	@FindBy(name = "brand")
	WebElement validationMsg;
	@FindBy(xpath = "/html/body/section[2]/div/div/aside/div[1]/div[2]/form/div[1]/select/option[5]")
	WebElement verifyUpdateBrand;
	@FindBy(xpath = "//*[@id=\"zctb_info\"]")
	WebElement filteredResult;

	public void clickManageBrand() {
		manageBrandLocator.click();
	}
	public void ManageBrandInterface() {
		if (manageBrandTitle.isDisplayed()) {
			System.out.println("Manage Brands Interface is Displayed");
		} else {
			System.out.println("Manage Brands Interface is not Displayed");
		}
	}
	public void clickShowDropdown(String num) {
		Select drpEntries = new Select(show);
		drpEntries.selectByValue(num);		
	}
	public void enterSearchField(String brandname) {
		search.sendKeys(brandname);
	}
	public String getFilteredBrand() {
		String fil_msg = filteredResult.getText();
		return fil_msg;
	}
	public void clickNextButton() {
		nextLocator.click();
	}
	public void clickPreviousButton() {
		previousLocator.click();
	}
	public void getEntries() {
		entriesLocator.isDisplayed();
	}
	public void clickEdit() {
		editLocator.click();
	}
	public void getUpdateBrandTitle() {
		updateBrandTitle.isDisplayed();
	}
	public void enterUpdateBrandName(String updateBrand) {
		updateBrandName.clear();
		updateBrandName.sendKeys(updateBrand);
	}
	public String getSuccessMessage() {
		String message = successMessage.getText();
		return message;
	}
	public void clickDelete() {
		deleteLocator.click();
	}
	public String getSuccessUpdateMessage() {
		String suc_msg = successUpdate.getText();
		return suc_msg;
	}
	public void getUpdationDate() {
		updateDate.isDisplayed();
	}
	public void clickSelectBrand() {
		Select brandName = new Select(validationMsg);
		brandName.selectByVisibleText("Audi");
	}
	public void findBrandName() {
		verifyUpdateBrand.isDisplayed();
	}
}


	