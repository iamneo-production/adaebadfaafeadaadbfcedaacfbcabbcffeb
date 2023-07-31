package pageObject;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageTestimonialPage {
	
 public static WebDriver driver;
 public ManageTestimonialPage(WebDriver driver) {
	 ManageTestimonialPage.driver=driver;
	 PageFactory.initElements(driver,this);
	}
 @FindBy(xpath="/html/body/div[2]/div/div/div/div/h2") WebElement testheader;
 @FindBy(xpath="/html/body/div[2]/nav/ul/li[6]/a") WebElement testbutton;
 @FindBy(xpath="//*[@id=\"zctb_filter\"]/label/input") WebElement testsearch;
 @FindBy(xpath="//*[@id=\"zctb_length\"]/label/select")WebElement testshow;
 @FindBy(xpath="//*[@id=\"zctb_next\"]/a") WebElement testnext;
 @FindBy(xpath="//*[@id=\"zctb_previous\"]/a")WebElement testprev;
 @FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[2]/td[6]/a")WebElement testactive ;
 @FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[1]/td[6]/a")WebElement testinactive;
@FindBy(xpath="/html/body/div[1]/a") WebElement carrentalportal;
@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[1]/td[2]") WebElement testtext;
@FindBy(xpath="//*[@id=\"zctb\"]/tbody")WebElement testtable;
@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[1]/td[1]") WebElement testnextcol;
@FindBy(xpath="/html/body/div[2]/div/div/div/div/div/div[2]/div[1]")WebElement testsuccess;
@FindBy(xpath="/html/body/section[4]/div[1]/div[1]/h2") WebElement oursatisfiedcustomers;
@FindBy(xpath="//*[@id=\"testimonial-slider\"]/div[1]/div") WebElement hometestimonials;
@FindBy(xpath="//*[@id=\"testimonial-slider\"]/div[2]/div/div[1]") WebElement homescroll;
@FindBy(xpath="/html/body/div[1]/ul/li/ul/li[2]/a") WebElement logout;
@FindBy(xpath="/html/body/div[1]/ul/li/a/i") WebElement drop;
@FindBy(xpath="/html/body/div/div/div/div/div/div/div/p/a") WebElement backtohome;
public void checkactivemessagedisplay(){
	drop.click();
	logout.click();
	backtohome.click();
	String tabletext ="I am satisfied with their service great job";
	String text2 = hometestimonials.getText();
	if(text2.contains(tabletext)) {
		System.out.println("displayed");
	}
	else {
	System.out.println("not displayed");
	}
}
public void checkinactivenotdisplay(){
	drop.click();
	logout.click();
	backtohome.click();
	String tabletext2 ="Hello. great service";
	String text2 = hometestimonials.getText();
	if(text2.contains(tabletext2)) {
		System.out.println("not displayed");
	}
	else {
		System.out.println("displayed");
	}
}
public void checksuccessmessage() {
	boolean t=testsuccess.isDisplayed();
	if (t) {
        System.out.println("success message is dispalyed");
     } else {
        System.out.println("success message is not dispalyed");
     }
	
	
}
 public void managetestimonialbutton() {
	 testbutton.click();
 }
 public void testimonialsearch(String text) {
	 testsearch.clear();
	 testsearch.sendKeys(text);
 }
 public void testimonialfindtext() {
	boolean t=testtext.isDisplayed();
	 if (t) {
         System.out.println("text is dispalyed");
      } else {
         System.out.println("text is not dispalyed");
      }
	 testsearch.clear();
 }
 public void testimonialshow(String num) {
	 String a1="10";
	 String a2="25";
	 String a3="50";
	 Select showdrop = new Select(testshow);
	 showdrop.selectByVisibleText(num);
	 WebElement digit = showdrop.getFirstSelectedOption();
     String selectedoption = digit.getText();
     List<WebElement>TotalRowsList = testtable.findElements(By.tagName("tr"));
     System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size());
     int a=TotalRowsList.size();
     if(selectedoption.equals(a1)) {
    	 if(a==10) {
    		 System.out.println("The selected number(10)of rows are displayed");
    	 }
     }
     else if(selectedoption.equals(a2)) {
    	 if(a<=25 & a>=10) {
    		 System.out.println("The selected number(25) of rows are displayed");
    	 }
     }else if(selectedoption.equals(a3)) {
    	 if(a<=50 & a>=25) {
    		 System.out.println("The selected number (50)of rows are displayed");	
     }
 }
 }
 public void testimonialshow2(String num) {
	 Select showdrop = new Select(testshow);
	 showdrop.selectByVisibleText(num);
 }
 public void managetestimonialnext() {
	 testnext.click();
 }
 public void managetestimonialprev() {
	 testprev.click();
 }
 public void managetestimonialactive() {
	 String sampleactive="Active";
	 String textactive=testactive.getText();
	 if(sampleactive.equalsIgnoreCase(textactive)) {
	 testactive.click();
	 }
	 else {
		 testactive.click();
		 driver.switchTo().alert().accept();
		 testactive.click();
	 }
 }
 public void managetestimonialinactive() {
	 String sampleinactive="Inactive";
	 String textinactive=testinactive.getText();
	 if(sampleinactive.equalsIgnoreCase(textinactive)) {
	 testinactive.click();
	 }
	 else {
		 testinactive.click();
		 driver.switchTo().alert().accept();
		 testinactive.click();
	 }
 }
 public void checkcarrentalportal() {
	 boolean t=carrentalportal.isDisplayed();
	 if (t) {
         System.out.println("car rental portal is dispalyed");
      } else {
         System.out.println("car rental portal is not dispalyed");
      }
 }
 public void checkmanagetestimoinal() {
	 boolean t=testheader.isDisplayed();
	 if (t) {
         System.out.println("Manage testimonial header is dispalyed");
      } else {
         System.out.println("Manage testimonial header is not dispalyed");
      }
 }
 public void checknexttable() {
	 boolean t=testnextcol.isDisplayed();
	 if (t) {
         System.out.println("next table is dispalyed");
      } else {
         System.out.println("next table is not dispalyed");
      }
 }
 public void naviagtetohome() {
	 driver.navigate().to("https://carrental.neohire.io/");
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView();", oursatisfiedcustomers);
 }
}
