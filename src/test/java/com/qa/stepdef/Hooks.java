package com.qa.stepdef;

import com.qa.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;

public class Hooks {

    @Before
    public void initialize(){
        new DriverManager().initializeDriver();
    }

    @After
    public void quit(Scenario scenario){

        //capture screenshot on failure
        if (scenario.isFailed()){
            byte[] screenshot = new DriverManager().getDriver().getScreenshotAs(OutputType.BYTES);
            //scenario.attach(screenshot, "image/png", scenario.getName());
            scenario.embed(screenshot, "image/png", scenario.getName());
        }

        //teardown
        DriverManager driverManager = new DriverManager();
        if(driverManager.getDriver() != null){
            driverManager.getDriver().quit();
            driverManager.setDriver(null);
        }
    }
}
