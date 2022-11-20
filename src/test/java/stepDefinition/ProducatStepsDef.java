package stepDefinition;

import io.cucumber.java.en.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.Producat;
import utilities.Driver;
import utilities.MyUtlities;

import java.util.concurrent.TimeUnit;

public class ProducatStepsDef {
    Logger logger = (Logger) LogManager.getLogger(ProducatStepsDef.class);


    Producat producat = new Producat();
    @Given("user navigate to login page")
    public void user_navigate_to_login_page() {
        Driver.get().get("https://community.element14.com/");
    }
    @Then("the user on the login page")
    public void the_user_on_the_login_page() {
        logger.info("the user on the login page");
        MyUtlities.sleep(3);
        String expected = "Log In";
        String actual = producat.logIn.getText();
        Assert.assertEquals(expected,actual);
    }

    @And("the user clicks the login button")
    public void theUserClicksTheLoginButton() {
        producat.logIn.click();
        logger.info("the user clicks the login button");
    }
    @Then("user enters the username")
    public void user_enters_the_username() {
        producat.signinName.sendKeys("autotestnonadmin02");
        logger.info("the user clicks the login button");

    }
    @Then("user enters the password")
    public void user_enters_the_password() {
        producat.password.sendKeys("Password123");
        logger.info("user enters the password");


    }
    @Then("user click on the sign button")
    public void user_click_on_the_sign_button() {
        MyUtlities.sleep(10);
        producat.signIn.click();
        logger.info("user click on the sign button");
    }
//    @And("user clicks on the recaptcha")
//    public void userClicksOnTheRecaptcha() {
//        MyUtlities.waitForVisibility(producat.reCaptcha,20);
//        producat.reCaptcha.click();
//    }
    @Then("user is on the home page")
    public void user_is_on_the_home_page() {
        MyUtlities.sleep(3);
        Assert.assertTrue(producat.userPofile.isDisplayed());
        logger.info("user is on the home page");
    }
    @And("the user accept the cookies")
    public void theUserAcceptTheCookies() {
        producat.cookies.click();
        logger.info("the user accept the cookies");
    }



}
