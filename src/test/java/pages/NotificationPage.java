package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NotificationPage {

    public NotificationPage() {
        PageFactory.initElements(Driver.get(),this);

    }

    @FindBy(xpath = "//a[@id='header-16_notifications']")
    public WebElement notificationButton;

    @FindBy(xpath = "//a[.='View all']")
    public WebElement viewAllButton;

    @FindBy(xpath = "//h1[.='Your Notifications']")
    public WebElement yourNotificationsTitle;


}


