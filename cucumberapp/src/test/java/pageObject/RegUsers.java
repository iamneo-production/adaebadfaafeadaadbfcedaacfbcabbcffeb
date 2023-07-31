package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegUsers {
	public WebDriver driver;
    public RegUsers(WebDriver driver)
    {
       
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//a[@href='reg-users.php']")
    WebElement Reguserbutton;
    @FindBy(xpath = "//h2[text()='Registered Users']")
    WebElement ReguserInterface;
    @FindBy(id="zctb_info")
    WebElement  output;
    @FindBy(xpath="//input[@type='search']")
    WebElement searchbutton;
    @FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr/td[2]")
    WebElement search;
        public void ReguserClickButton() {
    	Reguserbutton.click();
    }
    public void InterfaceReguser() {
    	if(ReguserInterface.isDisplayed()){
   		 System.out.println("Registered users Interface is Displayed");
		 
   	 }
   	 else {
   		 System.out.println("Registered users Interface not Displayed");
   	 }
    }
    public void ShoworSearchOutput() {
    	System.out.println(output.getText());
    }
    public void SearchClick(String searchTerm) {
    	searchbutton.click();
    	searchbutton.sendKeys(searchTerm);
    }
    public void SearchCompare(String searchTerm) {
    	String text = search.getText();
    	if(text.contains(searchTerm)) {
    		ShoworSearchOutput();
    	}
    	else {
           	System.out.println("invalid Details");
           }
    }   
}
