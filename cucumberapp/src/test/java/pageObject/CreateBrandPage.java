package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateBrandPage {	
	public static WebDriver driver;
	public CreateBrandPage(WebDriver driver) {
		CreateBrandPage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/div[2]/nav/ul/li[3]/a")
	WebElement brandsLocator;
	@FindBy(xpath = "/html/body/div[2]/nav/ul/li[3]/ul/li[1]/a")
	WebElement createBrandLocator;
	@FindBy(tagName = "h2")
	WebElement createBrandTitle;
	@FindBy(className = "form-control")
	WebElement brandNameLocator;
	@FindBy(name = "submit")
	WebElement submitLocator;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div/div/div/div[2]/form/div[1]")
	WebElement successLocator;
	@FindBy(name = "brand")
	WebElement validationMsg;
	@FindBy(xpath = "/html/body/section[2]/div/div/aside/div[1]/div[2]/form/div[1]/select/option[64]")
	WebElement validateBrand;

	public void clickBrands() {
		brandsLocator.click();
	}
	public void clickCreateBrands() {
		createBrandLocator.click();
	}
	public void createBrandInterface() {
		if (createBrandTitle.isDisplayed()) {
			System.out.println("Create Brand Interface will be displayed");
		} else {
			System.out.println("Create Brand Interface is not displayed");
		}
	}
	public void enterBrandName(String brandName) {
		brandNameLocator.sendKeys(brandName);
	}
	public void clickSubmit() {
		submitLocator.click();
	}
	public String getMessage() {
		String msg = successLocator.getText();
		return msg;
	}
	public String getValMessage() {
		String message = validationMsg.getAttribute("validationMessage");
		return message;
	}
	public void clickSelectBrandDropdown() {
		Select brandName = new Select(validationMsg);
		brandName.selectByVisibleText("BMW");
	}
	public void findYourCar() {
		validateBrand.isDisplayed();
	}
}