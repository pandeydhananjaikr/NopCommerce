package StepDefinitions;
import DriverUtil.Driver;
import Listeners.ListenerClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static DriverUtil.DriverManager.driver;

public class Hooks {
    
    ListenerClass listener = new ListenerClass();

    @Before()
    public void open() {
        Driver.initDriver();

    }

    @After
    public void close(Scenario scenario) {

        if (scenario.isFailed()){
            byte[] screenshotBytes = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshotBytes, "image/png", "screenshot" );
        }


        Driver.tearDown();
    }


}
