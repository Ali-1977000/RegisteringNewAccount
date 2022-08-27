package stepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import pages.RegisterPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.MyUtlities;

import java.util.Set;

public class RegisterStepDef {
    Logger logger = (Logger) LogManager.getLogger(RegisterStepDef.class);

    RegisterPage registerPage = new RegisterPage();
    Faker faker = new Faker();
    String name = faker.name().firstName();
    String lastName = faker.name().lastName();
    String password = faker.internet().password();
    String email = faker.internet().emailAddress();


    @Given("user navigate to the website")
    public void user_navigate_to_the_website() throws InterruptedException {
        logger.info("User navigate to the website");

        Driver.get().get(ConfigurationReader.get("elemnt14Url"));
        Thread.sleep(500);
        registerPage.acceptAllCookies.click();
    }

    @When("user clicks the register button")
    public void user_clicks_the_register_button() {
        logger.info("User clicks the register button");
        MyUtlities.sleep(3);
        registerPage.registerButton.click();

    }

    @When("user enters the name")
    public void user_enters_the_name() {

        logger.info("User enters the name");
        registerPage.signInNameBox.sendKeys(name);

    }

    @When("user enters Email Address")
    public void user_enters_email_address() {
        logger.info("User enters Email Address");
        registerPage.emailBox.sendKeys(email);

    }

    @When("user enters Password")
    public void user_enters_password() {
        logger.info("User enters Password");
        registerPage.passwordBox.sendKeys(password);

    }

    @When("user enters Confirm Password")
    public void user_enters_confirm_password() {

        logger.info("User enters Confirm Password");

        registerPage.confirmPasswordBox.sendKeys(password);

    }

    @When("user selects United Kingdom")
    public void user_selects_united_kingdom() {
        logger.info("User selects United Kingdom");

        Select select = new Select(registerPage.country);
        select.selectByVisibleText("United Kingdom");

    }

    @When("user enters First Name")
    public void user_enters_first_name() {

        logger.info("User enters First Name");
        registerPage.firstNameBox.sendKeys(name);

    }

    @When("user enters Last Name")
    public void user_enters_last_name() {
        logger.info("User enters Last Name");
        registerPage.lastNameBox.sendKeys(lastName);

    }

    @And("user clicks privacyPolicyForDetailsCheckBox")
    public void userClicksPrivacyPolicyForDetailsCheckBox() {
        logger.info("User Clicks Privacy Policy For Details CheckBox");

        registerPage.privacyPolicyForDetailsCheckBox.click();

    }

    @When("user clicks the second check box about Terms of Service")
    public void user_clicks_the_second_check_box_about_terms_of_service() {
        logger.info("User clicks the second check box about Terms of Service");
        registerPage.termsOfServiceCheckBox.click();

    }

    @When("user clicks the CAPTCHA check box")
    public void user_clicks_the_captcha_check_box() {
        logger.info("User clicks the CAPTCHA check box");

        registerPage.captchaCheckBox.click();

    }

    @When("user clicks Join now")
    public void user_clicks_join_now() {
        logger.info("User clicks Join now");
        registerPage.joinNowButton.click();


    }


    @Then("user verifies {string} message")
    public void userVerifiesMessage(String Expectedmessage) {
        logger.info("User verifies \"Welcome to the communityYour account has been created and you are signed in.\" message");

        Assert.assertEquals(Expectedmessage, registerPage.verficationMessage.getText());
    }
}