package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LiveHomePageLoad {

    public LiveHomePageLoad() {
        PageFactory.initElements(Driver.get(),this);

    }

    @FindBy(xpath = "(//span[.='Log In'])[1]")
    public WebElement logIn;

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement cookies;

    @FindBy(xpath = "//input[@id='fragment-3283_username']")
    public WebElement signinName;
//    @FindBy(xpath = "//*[@id=fragment-3283]/div[1]/form/fieldset/ul/li[2]/span[1]/label")
//    public WebElement emailAddress;

    @FindBy(xpath = "//input[@id='fragment-3283_password']")
    public WebElement password;

    @FindBy(xpath = "//span[@class='recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox']")
    public WebElement reCaptcha;

    @FindBy(xpath = "//a[@class='internal-link login submit-button button']")
    public WebElement signIn;

    @FindBy(xpath = "//a[@id='header-16_user']")
    public WebElement userPofile;

}

