package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManagePages {
	public static WebDriver driver;
	 public ManagePages(WebDriver driver) {
		 ManagePages.driver=driver;
		 PageFactory.initElements(driver,this);
		}
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/h2")WebElement managepagesheader;
	 @FindBy(xpath="/html/body/div[2]/nav/ul/li[9]/a")WebElement managepagesbutton;
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/div/div/div/div[2]/form/div[1]/div/select")WebElement selectpagedropdown ;
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/div/div/div/div[2]/form/div[3]/div")WebElement selectedpage;
	 @FindBy(xpath="/html/body/div[2]/div/div/div/div/div/div/div/div[2]/form/div[4]/div/div[2]/div")WebElement pagedetails;
	 @FindBy(xpath="//*[@id=\"submit\"]")WebElement updatebutton;
	 @FindBy(xpath="/html/body/section[2]/div/div")WebElement termsofuseinfo;
	@FindBy(xpath="/html/body/footer/div[1]/div/div/div[1]/h6")WebElement aboutushomeheader;
	@FindBy(xpath="/html/body/footer/div[1]/div/div/div[1]/ul/li[4]/a")WebElement termsofusehome;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div/div/div/div[2]/form/div[1]")WebElement successmess;
	@FindBy(xpath="/html/body/footer/div[1]/div/div/div[1]/ul/li[3]/a")WebElement privacyhome;
	@FindBy(xpath="/html/body/footer/div[1]/div/div/div[1]/ul/li[1]/a")WebElement aboutushome;
	@FindBy(xpath="/html/body/footer/div[1]/div/div/div[1]/ul/li[2]/a")WebElement faqshome;
	@FindBy(xpath="/html/body/section[2]/div/div")WebElement aboutusinfo;
	@FindBy(xpath="/html/body/section[2]/div/div")WebElement faqsinfo;
	@FindBy(xpath="/html/body/section[2]/div/div")WebElement privacyinfo;
	 public void checkmanagepagesheader() {
		 boolean t=managepagesheader.isDisplayed();
		 if (t) {
		        System.out.println("Manage Pages  is dispalyed");
		     } else {
		        System.out.println("Manage Pages  is not dispalyed");
		     }
	 }
	 public void clickmanagepages() {
		 managepagesbutton.click();
	 }
	 public void clickupdatebutton() {
		 updatebutton.click();
	 }
	 public void checksuccessmessage() {
		 boolean t=successmess.isDisplayed();
			if (t) {
		        System.out.println("success message is dispalyed");
		     } else {
		        System.out.println("success message is not dispalyed");
		     }
	 }
	 
	 public void selectpagedropdown(String name) {
		 String neh=selectedpage.getText();
		 Select showdrop = new Select(selectpagedropdown);
		 showdrop.selectByVisibleText(name);
		 WebElement digit = showdrop.getFirstSelectedOption();
	     String selectedoption = digit.getText();
	     if(selectedoption.contains(neh)) {
	    	 System.out.println("Matched");
	     }
	     else {
	    	 System.out.println("Not Matched");
	     }
	 }
	 public void enterinfoinpagedetails(String para) {
		pagedetails.sendKeys(para);
	 }
	 public void checktermsofuseinfo() {
		 String para=termsofuseinfo.getText();
		 if(para.contains("Ketone")) {
			 System.out.println("updated successfully");
			 
		 }
		 else {
			 System.out.println("not updated");
		 }
	 }
	 public void checkprivacyinfo() {
		 String para=privacyinfo.getText();
		 if(para.contains("Alkane privacy")) {
			 System.out.println("updated successfully");
			 
		 }
		 else {
			 System.out.println("not updated");
		 }
	 }
	 public void checkaboutusinfo() {
		 String para=aboutusinfo.getText();
		 if(para.contains("alkene aboutus")) {
			 System.out.println("updated successfully");
			 
		 }
		 else {
			 System.out.println("not updated");
		 }
	 }
	 public void checkfaqsinfo() {
		 String para=faqsinfo.getText();
		 if(para.contains("Any doubts faqs")) {
			 System.out.println("updated successfully");
			 
		 }
		 else {
			 System.out.println("not updated");
		 }
	 }	 
}
