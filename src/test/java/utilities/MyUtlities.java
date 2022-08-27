package utilities;

import org.openqa.selenium.WebElement;

public class MyUtlities {

    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds * 1000 );
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void clickMethod(WebElement element){
        sleep(3);
        element.click();
    }

    public static void sendKey(WebElement element, String key){
        element.sendKeys(key);

    }


}