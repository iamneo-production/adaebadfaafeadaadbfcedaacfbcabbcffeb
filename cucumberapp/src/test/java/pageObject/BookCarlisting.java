package pageObject;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookCarlisting {
	public WebDriver driver;
	
    public BookCarlisting(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//*[@id=\"navigation\"]/ul/li[3]/a")
    WebElement CarListingbutton;
    @FindBy(xpath="/html/body/section[1]/div[1]/div/div/h1")
    WebElement CarListingInterface;
    @FindBy(xpath="/html/body/section[2]/div/div/div/div[4]/div[2]/a")
    WebElement CarViewDetail;
    @FindBy(xpath="/html/body/section[2]/div/div[1]/div[1]/h2")
    WebElement CarViewDetailInterface;
    @FindBy(xpath="/html/body/section[2]/div/div[2]/aside/div[2]/form/div[1]/input")
    WebElement FromDate;
    @FindBy(xpath="/html/body/section[2]/div/div[2]/aside/div[2]/form/div[2]/input")
    WebElement ToDate;
    @FindBy(xpath="/html/body/section[2]/div/div[2]/aside/div[2]/form/div[3]/textarea")
    WebElement Text;
    @FindBy(xpath="/html/body/section[2]/div/div[2]/aside/div[2]/form/div[4]/input")
    WebElement bookbutton;
    @FindBy(xpath="//input[@type='search']")
    WebElement searchbutton;
    @FindBy(xpath="//*[@id='zctb']/tbody/tr/td[3]")
    WebElement notebookno;
    
    
    public void CarListingbuttonClick() {
    	CarListingbutton.click();
    }
    public void VerifyInterfaceCarListing() {
    	if(CarListingInterface.isDisplayed()) {
    		System.out.println("CarListing Interface is Displayed");
    	}
    	else {
    		System.out.println("CarListing Interface not Displayed");
    	}
    }
    public void CarViewDetailbuttonClick() {
    	CarViewDetail.click();
    }
    public void VerifyCarViewDetailInterface(){
       if(CarViewDetailInterface.isDisplayed()){
        System.out.println("Car View Detail Interface is Displayed");
       }
       else{
        System.out.println("Car View Detail Interface not Displayed");
       }
    }
    String formattedDate;
    Integer desiredyear;
    public void SetDate() {
    	  desiredyear = 2025;
    	  LocalDate startDate = LocalDate.of(desiredyear, 1, 1);
    	  Random random = new Random();
    	  Integer daysToAdd = random.nextInt(364);
    	  LocalDate desiredDate = startDate.plusDays(daysToAdd);
    	  DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("ddMM");
     	  formattedDate = desiredDate.format(formatter1);
     	  System.out.println(formattedDate);
    }
    public void SetFromDate() {
        FromDate.sendKeys(formattedDate);
        WebElement fromyear = driver.switchTo().activeElement();
     	fromyear.sendKeys(String.valueOf(desiredyear));
    }

    public void SetToDate() {	
     	ToDate.sendKeys(formattedDate);
     	WebElement toyear = driver.switchTo().activeElement();
        toyear.sendKeys(String.valueOf(desiredyear));
        
    }
    public void EnterText() {
    	Text.sendKeys("Hi");
    }
    public void Bookbutton() {
    	bookbutton.click();
        
    }
    public String verifyfromdate(String FromdateSearch) {
    	 System.out.println("SearchFromDate="+FromdateSearch);
    	 searchbutton.click();
    	 searchbutton.sendKeys(FromdateSearch);
    	 String bookno ="#"+notebookno.getText();
    	 return bookno;	 
    }    
}
