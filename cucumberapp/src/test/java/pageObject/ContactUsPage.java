package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ContactUsPage {
    public static WebDriver driver;
    public ContactUsPage(WebDriver driver) {
        ContactUsPage.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="fullname")
    WebElement FullName;
    @FindBy(id = "emailaddress")
    WebElement EmailAddress;
    @FindBy(id = "phonenumber")
    WebElement PhoneNumber;
    @FindBy(name = "message")
    WebElement Message;
    @FindBy(name="send")
    WebElement SendMessageButton;
    @FindBy(xpath="/html/body/footer/div[1]")
    WebElement FooterClick;
    @FindBy(xpath = "//*[@id=\"back-top\"]/a/i")
    WebElement UpArrowSymbol;
    @FindBy(xpath="/html/body/section[2]/div/div/div[1]/div[1]")
    WebElement QueryBox;
    @FindBy(xpath="/html/body/div/div/div/div/div/div")
	WebElement AdminPage;
	@FindBy(name="username")
	WebElement UserName;
	@FindBy(name="password")
	WebElement Password;
	@FindBy(name="login")
	WebElement Login;
	@FindBy(xpath="/html/body/div[2]/nav/ul/li[7]/a")
	WebElement ManageContactUsQueryClick;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div")
	WebElement ManageContactUsQueryPage1;
	@FindBy(xpath="//*[@id=\"zctb_filter\"]/label/input")
	WebElement SearchBoxClick;
	@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[2]/td[2]")
	WebElement AdminFullName;
	@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[2]/td[3]")
	WebElement AdminEmailAddress;
	@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[2]/td[4]")
	WebElement AdminPhoneNumber;
	@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[2]/td[5]")
	WebElement AdminMessage;
	@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[2]/td[6]")
	WebElement PostingDate;
	@FindBy(xpath="//*[@id=\"zctb\"]/tbody/tr[3]/td[7]")
	WebElement ReadAction;
    public void checkContactUsPage() {
        
        FullName.isDisplayed();
        EmailAddress.isDisplayed();
        PhoneNumber.isDisplayed();
        Message.isDisplayed();
        SendMessageButton.isDisplayed();
        UpArrowSymbol.isDisplayed();
        QueryBox.isDisplayed();
        FooterClick.isEnabled();
        AdminPage.isDisplayed();
		UserName.isSelected();
		Password.isSelected();
		Login.isSelected();
		ManageContactUsQueryClick.isSelected();
		ManageContactUsQueryPage1.isDisplayed();
		SearchBoxClick.isEnabled();
		AdminFullName.isDisplayed();
		AdminEmailAddress.isDisplayed();
		AdminPhoneNumber.isDisplayed();
		AdminMessage.isDisplayed();
		PostingDate.isDisplayed();
		ReadAction.isDisplayed();
    }
    public void setFullName(String fullname) {
        FullName.clear();
        FullName.sendKeys(fullname);
    }
    public void setEmailId(String emailaddress) {
        EmailAddress.clear();
        EmailAddress.sendKeys(emailaddress);
    }
    public void setPhoneNumber(String phonenumber) {
        PhoneNumber.clear();
        PhoneNumber.sendKeys(phonenumber);
    }
    public void setMessage(String message) {
        Message.clear();
        Message.sendKeys(message);
    }
    public void checkSendMessageButton() {
        SendMessageButton.click();
    }
    public void checkFooterClick() {
    	FooterClick.click();
    }
    public void checkUpArrowSymbol() {
        UpArrowSymbol.click();
    }
   public void CheckQueryBox() {
	   QueryBox.isDisplayed();
   }
   public void setAdminPage() {
    AdminPage.click();
    AdminPage.isDisplayed();
   }
public void setUserName(String username) {
    UserName.sendKeys(username);
   }
public void setPassword(String password) {
    Password.sendKeys(password);
}
public void setLogin() {
    Login.click();
}
public void setManageContactUsQueryClick() {
    ManageContactUsQueryClick.click();
}
public void setManageContactUsQueryPage1() {
    ManageContactUsQueryPage1.isDisplayed();
}
public void setSearchBoxClick(String searchbox) {
    SearchBoxClick.click();
    SearchBoxClick.sendKeys(searchbox);    
}
public void adminFullName() {
    AdminFullName.isDisplayed();
    
}
public void adminEmailAddress() {
    AdminEmailAddress.isDisplayed();
    
}
public void adminPhoneNumber() {
    AdminPhoneNumber.isDisplayed();
    
}
public void adminMessage() {
    AdminMessage.isDisplayed();
}
public void setPostingDate() {
    PostingDate.isDisplayed();
}
public void setReadAction() {
    ReadAction.isDisplayed();
}
}