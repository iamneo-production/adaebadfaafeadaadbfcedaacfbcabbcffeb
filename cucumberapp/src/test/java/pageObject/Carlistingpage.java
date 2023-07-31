package pageObject;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.Select;

public class Carlistingpage {
	public static WebDriver driver;
	public Carlistingpage(WebDriver driver) {
		Carlistingpage.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"navigation\"]/ul/li[3]/a")WebElement carlistingbutton;
	@FindBy(xpath="/html/body/section[1]/div[1]/div/div/h1") WebElement carlistingtitle;
	@FindBy(xpath="/html/body/section[2]/div/div/aside/div[1]/div[2]/form/div[1]/select")WebElement brandtype;
	@FindBy(xpath="/html/body/section[2]/div/div/aside/div[1]/div[2]/form/div[2]/select")WebElement fueltype;
	@FindBy(xpath="/html/body/section[2]/div/div/aside/div[1]/div[2]/form/div[3]/button")WebElement searchbutton;
	@FindBy(xpath="/html/body/section[2]/div/div/div/div[2]/div[2]/a")WebElement viewdetails;
	@FindBy(xpath="/html/body/section[2]/div/div[2]/div/div[2]/div/ul/li[2]/a")WebElement accesories;
	@FindBy(xpath="//*[@id=\"accessories\"]/table/thead/tr/th") WebElement accessoriesfields;
	@FindBy(xpath="//*[@id=\"listing_img_slider\"]/div[2]/div/div[1]")WebElement prevbtn;
	@FindBy(xpath="//*[@id=\"listing_img_slider\"]/div[2]/div")WebElement imageslider;
	@FindBy(xpath="//*[@id=\"listing_img_slider\"]/div[2]/div/div[2]")WebElement nextbtn;
	@FindBy(xpath="//*[@id=\"listing_img_slider\"]/div[1]/div/div[3]/div/img")WebElement nextimage;
	@FindBy(xpath="/html/body/section[2]/div/div[2]/div/div[2]/div/ul/li[1]/a")WebElement vehiclebtn;
	@FindBy(xpath="/html/body/section[2]/div/div/aside/div[2]/div[2]/ul/li[1]/div[2]/a") WebElement RecentcarBtn;
	@FindBy(xpath="/html/body/section[2]/div/div[1]/div[1]") WebElement cartitle;	
	@FindAll({@FindBy(xpath="//div[@class=\"product-listing-content\"]")}) List<WebElement> carlists;
	@FindAll({@FindBy(xpath="//div[@class=\"recent_post_title\"]")}) List<WebElement> recentcarlists;
	@FindBy(xpath="/html/body/section[2]/div/div[5]/div/div/div/div[2]/h5/a") WebElement similarcar;
	@FindBy(xpath="/html/body/section[2]/div/div[1]/div[1]/h2") WebElement cardetails;
	@FindAll({@FindBy(xpath="//div[@class=\"tab-pane active\"]")}) List<WebElement> accessorieslist;
	@FindBy(xpath="//div[@class=\"tab-content\"]") WebElement caroverview;
	
	public void Carlistingbtn() {
		carlistingbutton.click();
	}
	public void checkcarlistingpage() {
		if(carlistingtitle.isDisplayed()) {
			System.out.println("carlisting page is displayed");
	}
		else {
			System.out.println("Carlisting page is not displayed");
		}
	}
	public void listoutcars() {
		System.out.println("Total listings are: "+ carlists.size());
		for(WebElement x : carlists ) {
			System.out.println(x.getText());
		}
	}
	public void selectbrand() {
	    Select select = new Select(brandtype);
	    select.selectByVisibleText("Lamborghini");
	}
	public void selectfuel(){
		Select select = new Select(fueltype);
		select.selectByIndex(1);
	}
	public void Searchbtn() {
		searchbutton.click();
	}
	public void checkcarlistings() {
		 driver.getPageSource().contains("Listings");
	}
	public void Viewdetailsbtn() {
		viewdetails.click();
	}
	public void checkcardetails() {
		driver.getPageSource().contains("Vehicle Overview");
	}
	public void overviewofcar() {
		System.out.println(caroverview.getText());
	}
	public void Accessoriesbtn() {
		accesories.click();
	}
	public void checkAccessories() {
		//driver.getPageSource().contains("ACCESSORIES");
		accessoriesfields.isDisplayed();
	}
	public void listoutaccessories() {
		System.out.println(accessorieslist.size());
		for(WebElement y : accessorieslist ) {
			System.out.println(y.getText());
		}
	}
	public void PrevBtn() {
		Actions act =  new Actions(driver);
		act.moveToElement(prevbtn).click().perform();
	}
	public void checkimageslider() {
		imageslider.isDisplayed();
	}
	public void NextBtn() {
		Actions act =  new Actions(driver);
		act.moveToElement(nextbtn).click().perform();
	}
	public void checknextslider() {
		nextimage.isDisplayed();
	}
	public void vehicleoverviewbtn() {
		vehiclebtn.click();
	}
	public void checkvehicleoverview() {
		driver.getPageSource().contains("Vehicle Overview");
	}
	
	public void RecentlyListedCar() {
		RecentcarBtn.click();
	}
	public void checkrecentlylstcar() {
		cartitle.isDisplayed();
	}
	public void checkrecentlylistedcars() {
		System.out.println(recentcarlists.size());
		for(WebElement y : recentcarlists ) {
			System.out.println(y.getText());
		}
	}
	public void similarcarbtn() {
		similarcar.click();
	}
	public void checksimilarcardetails() {
		cardetails.isDisplayed();
	}	
}
