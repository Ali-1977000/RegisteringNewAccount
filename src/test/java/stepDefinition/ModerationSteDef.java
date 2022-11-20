package stepDefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.ModerationPage;

public class ModerationSteDef {

    ModerationPage moderationPage = new ModerationPage();
    @Given("Admin clicks the console button")
    public void admin_clicks_the_console_button() {
        moderationPage.adminButton.click();

    }
    @And("Admin clicks the Moderation button")
    public void admin_clicks_the_moderation_button() {
        moderationPage.administrationButton.click();

    }
    @Then("Admin can see the Moderation Queue")
    public void admin_can_see_the_moderation_queue() {
        String actual = "Moderation Queue";
        String expected = moderationPage.moderationQueueTitle.getText();
        Assert.assertEquals(actual,expected);

    }


}
