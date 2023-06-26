package com.nopcommerce.StepDefinitions;
import com.nopcommerce.DriverUtil.Driver;
import com.nopcommerce.Listeners.ListenerClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    
    ListenerClass listener = new ListenerClass();

    @Before()
    public void open() {
        Driver.initDriver();

    }

    @After
    public void close(Scenario scenario) {

//        if (scenario.isFailed()){
//            byte[] screenshotBytes = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshotBytes, "image/png", "screenshot" );
//        }


        Driver.tearDown();
    }


}
