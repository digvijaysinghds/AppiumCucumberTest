package com.qa.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverManager {
    //private static AppiumDriver driver;
    private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<AppiumDriver>();

    public AppiumDriver getDriver(){
        return driver.get();
    }

    public void setDriver(IOSDriver driver2){
        driver.set(driver2);
    }

    public void initializeDriver(){
        AppiumDriver driver = null;

        if (driver == null){
            try{
                DesiredCapabilities dc = new DesiredCapabilities();
                dc.setCapability(MobileCapabilityType.APPLICATION_NAME, "XCUITest");
                dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
                dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.6");
                dc.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11");
                dc.setCapability("bundleId", "com.apple.mobilecal");

                URL url = new URL("http://0.0.0.0:4723/wd/hub");
                driver = new IOSDriver(url, dc);
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            this.driver.set(driver);
        }
    }


}
