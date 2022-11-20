package stepDefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.Producat;
import utilities.Driver;
import utilities.MyUtlities;

import java.util.concurrent.TimeUnit;

public class ProducatStepsDef {


    Producat producat = new Producat();
    @Given("user navigate to login page")
    public void user_navigate_to_login_page() {
        Driver.get().get("https://community.element14.com/");
    }
    @Then("the user on the login page")
    public void the_user_on_the_login_page() {
        MyUtlities.sleep(3);
        String expected = "Log In";
        String actual = producat.logIn.getText();
        Assert.assertEquals(expected,actual);
    }

    @And("the user clicks the login button")
    public void theUserClicksTheLoginButton() {
        producat.logIn.click();
    }
    @Then("user enters the username")
    public void user_enters_the_username() {
        producat.signinName.sendKeys("autotestnonadmin02");

    }
    @Then("user enters the password")
    public void user_enters_the_password() {
        producat.password.sendKeys("Password123");

    }
    @Then("user click on the sign button")
    public void user_click_on_the_sign_button() {
        MyUtlities.sleep(10);
        producat.signIn.click();
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
    }
    @And("the user accept the cookies")
    public void theUserAcceptTheCookies() {
        producat.cookies.click();
    }


}
