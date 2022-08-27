package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utilities.Driver;

import java.util.concurrent.TimeUnit;



public class Hooks {

    Logger logger = (Logger) LogManager.getLogger(Hooks.class);
    // @Before comes from Cucumber Java and helps us to maximize the window
    @Before
    public void setUp(){
       logger.info("This is where tests are starting");
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    // @After comes from Cucumber Java and helps to close the driver
    @After
    public void tearDown(){
        logger.info("This is where tests are finishing");
        Driver.closeDriver();
    }


}

