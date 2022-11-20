package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ModerationPage {

    public ModerationPage() {

        PageFactory.initElements(Driver.get(),this);

    }

    @FindBy(xpath = "//div[@class='banner-notifications-container']")
    public WebElement adminButton;

    @FindBy(xpath = "//span[.='Administration']")
    public WebElement administrationButton;

    @FindBy(xpath = "//span[.='Moderation Queue']")
    public WebElement moderationQueueTitle;
}
