package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {

    public RegisterPage() {

        // we use consturcoter to call our locator in the step defintion class
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//span[.='Register'])[1]")
    public WebElement registerButton;

    @FindBy(xpath = "//input[@id='fragment-46_email']")
    public WebElement emailBox;

    @FindBy(css = "input[id='fragment-46_username']")
    public WebElement signInNameBox;

    @FindBy(xpath = "//input[@id='fragment-46_password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='fragment-46_password2']")
    public WebElement confirmPasswordBox;

    @FindBy(id = "fragment-46_profileFieldsForm_717170147_country")
    public WebElement country;

    @FindBy(xpath = "//input[@id='fragment-46_profileFieldsForm_1835267210_first-name']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//input[@id='fragment-46_profileFieldsForm_614460147_last-name']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//input[@id='fragment-46_profileFieldsForm_237248213_oktocontact']")
    public WebElement privacyPolicyForDetailsCheckBox;

    @FindBy(xpath = "//input[@id='fragment-46_acceptAgreement']")
    public WebElement termsOfServiceCheckBox;

    @FindBy(xpath= "//div[@id='rc-anchor-container']/div[3]/div/div/div/span")
    //@FindBy(className = "recaptcha-checkbox-checkmark")
    public WebElement captchaCheckBox;

    //@FindBy(css = ".internal-link.create-account.submit-button.button")
  // @FindBy(xpath = "//a[@class='internal-link create-account submit-button button']")
    @FindBy(xpath = "(//ul[@class='field-list'])[2]/li[7]/span/a")
    public WebElement joinNowButton;


    //@FindBy(xpath = "//*[@id=\"fragment-46\"]/div[1]/form/fieldset/ul/li[7]/span/a")
    @FindBy(xpath = "//div[@id='_p_page']//p[1]")
    public WebElement verficationMessage;

    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement acceptAllCookies;

}
