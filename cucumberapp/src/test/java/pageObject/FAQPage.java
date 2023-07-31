package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FAQPage {
public WebDriver adriver;
public FAQPage(WebDriver bdriver)
{
    adriver=bdriver;
    PageFactory.initElements(adriver, this);
}
@FindBy(xpath="//*[@id=\"navigation\"]/ul/li[4]/a")
WebElement FAQPage;
@FindBy(xpath="/html/body/section[2]/div/div/p")
WebElement FAQMessage;
@FindBy(xpath="/html/body/footer/div[1]")
WebElement PageDownward;
@FindBy(xpath="//*[@id=\"back-top\"]/a/i")
WebElement UpArrowSymbol;
public void checkFAQPage() {
    FAQPage.isDisplayed();
    FAQMessage.isDisplayed();
    UpArrowSymbol.isDisplayed();
}
public void checkFAQButton() {
    FAQPage.click();
}
public void checkFAQMessage() {
    FAQMessage.click();
}
public void checkPageDownward() {
	PageDownward.click();
}
public void checkUpArrowSymbol() {
    UpArrowSymbol.click();
}
}