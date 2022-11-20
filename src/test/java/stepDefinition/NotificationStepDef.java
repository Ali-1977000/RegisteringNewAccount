package stepDefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.NotificationPage;

public class NotificationStepDef {

    NotificationPage notificationPage = new NotificationPage();

    @Given("user clicks on notification button")
    public void user_clicks_on_notification_button() {
        notificationPage.notificationButton.click();

    }
    @Given("user clicks on view all button")
    public void user_clicks_on_view_all_button() {
        notificationPage.viewAllButton.click();

    }
    @Then("user can see Your Notifications")
    public void user_can_see_your_notifications() {

        String actual = "Your Notifications";
        String expected = notificationPage.yourNotificationsTitle.getText();
        Assert.assertEquals(actual, expected);

    }

}
