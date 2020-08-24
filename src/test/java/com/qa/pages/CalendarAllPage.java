package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

public class CalendarAllPage extends BasePage{
    TestUtils utils = new TestUtils();

    /* Below are page elements
    * All the page elements are added in one page for simplicity
    */

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Continue']")
    private MobileElement continueBtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Add']")
    private MobileElement addNewEvent;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
    private MobileElement meetingName;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Starts']")
    private MobileElement startTime;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypePickerWheel")
    private List<MobileElement> datePicker;

    //Meeting Frequency Element
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Repeat']")
    private MobileElement repeatElm;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Custom']")
    private MobileElement customElm;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Frequency']")
    private MobileElement frequencyElm;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypePickerWheel")
    private MobileElement freqScroll;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Monday']")
    private MobileElement monElm;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Wednesday']")
    private MobileElement wedElm;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Friday']")
    private MobileElement friElm;

    //navigate back and Save
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Repeat']")
    private MobileElement repeatBtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='New Event']")
    private MobileElement newEventBtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Add']")
    private MobileElement addBtn;

    public void addEvent(){
        Assert.assertEquals("Error in launching Calendar app", true ,continueBtn.isDisplayed());
        continueBtn.click();
        utils.log().info("Clicked on continue Button");
        Assert.assertEquals("Add new event button is not loaded", true ,addNewEvent.isDisplayed());
        addNewEvent.click();
        utils.log().info("Clicked on add new meeting");

    }

    public void enterMeetingName(String MeetingTitle){
        Assert.assertEquals("Meeting Name filed is not loaded on UI", true ,meetingName.isDisplayed());
        meetingName.sendKeys(MeetingTitle);
        utils.log().info("Enter the meeting name as: -> Recurring-Team Catch Up");
    }

    public void setMeetingTime(String hours){
        Assert.assertEquals("Start time button is not loaded on UI", true ,startTime.isDisplayed());
        startTime.click();
        utils.log().info("Clicked on Start element to set Start Date and Time");
        Assert.assertEquals("Date picked scroll is not loaded on UI", true ,datePicker.get(0).isDisplayed());
        datePicker.get(0).sendKeys("Aug 24");
        utils.log().info("Set Start Date as Tomorrow's Date");
        datePicker.get(0).sendKeys(Keys.TAB);

        datePicker.get(1).sendKeys(hours);
        utils.log().info("Set start time as-> "+ hours);
        datePicker.get(1).sendKeys(Keys.TAB);

        datePicker.get(2).sendKeys("00");
        utils.log().info("Set start minute as 00");
        datePicker.get(2).sendKeys(Keys.TAB);

        datePicker.get(3).sendKeys("AM");
        utils.log().info("Set morning slot");
    }

    public void setRepeatFrequency(){
        Assert.assertEquals("Repeat meeting button is not loaded on UI", true ,repeatElm.isDisplayed());
        repeatElm.click();
        utils.log().info("Clicked on repeat meeting element");
        Assert.assertEquals("Custom repeat button is not loaded on UI", true ,customElm.isDisplayed());
        customElm.click();
        utils.log().info("Clicked on custom element to set meeting frequency");
        frequencyElm.click();
        utils.log().info("Clicked on frequency element");
        Assert.assertEquals("Frequency scroll is not loaded on UI", true ,freqScroll.isDisplayed());
        freqScroll.sendKeys("Weekly");
        utils.log().info("Scroll and select weekly meeting");

    }

    public void alternateDay(){
        Assert.assertEquals("Week Days is not loaded on UI", true ,monElm.isDisplayed());
        monElm.click();
        utils.log().info("Monday selected from UI");
        wedElm.click();
        utils.log().info("Wednesday selected from UI");
        friElm.click();
        utils.log().info("Friday selected from UI");
    }

    public void saveMeeting(){
        Assert.assertEquals("Repeat navigation button is not loaded", true ,repeatBtn.isDisplayed());
        repeatBtn.click();
        utils.log().info("Navigate back by clicking repeat button");
        newEventBtn.click();
        utils.log().info("Navigate back by clicking on new Evenet buttom");
        addBtn.click();
        utils.log().info("Clicked on add new meeting");
    }

    public void verifyMeeting(){
        utils.log().info("Verifying meeting is created and Calendar home page is displayed");
        Assert.assertEquals("Meeting Created succesfully", true, addNewEvent.isDisplayed());
    }
}
