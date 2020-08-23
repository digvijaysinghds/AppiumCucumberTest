package com.qa.stepdef;

import com.qa.pages.CalendarAllPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.net.MalformedURLException;


public class CalendarStepDef {

    CalendarAllPage CalPg;
    public CalendarStepDef(){
        CalPg = new CalendarAllPage();
    }

    @Given("^I have Launched the Calendar app$")
    public void iHaveLaunchedTheCalendarApp() throws MalformedURLException, InterruptedException {
        CalPg.addEvent();
    }

//    @When("^It is not a \"([^\"]*)\"$")
//    public void itIsNotA(String string) {
//
//    }

    @Then("^I want to book a meeting with title \"([^\"]*)\"$")
    public void iWantToBookAMeetingWithTitle(String MeetingTitle) {
        CalPg.enterMeetingName(MeetingTitle);

    }

    @And("^Set meeting duration as \"([^\"]*)\" in the evening$")
    public void setMeetingDurationAsInTheEvening(String hours) {
        CalPg.setMeetingTime(hours);

    }

    @And("^Meeting is not repeated on successive days$")
    public void meetingIsNotRepeatedOnSuccessiveDays() {
        CalPg.setRepeatFrequency();
        CalPg.alternateDay();
    }

//    @Then("^I invite \"([^\"]*)\" of people$")
//    public void iInviteOfPeople(String string) {
//
//    }

    @And("I save the meeting")
    public void iSaveTheMeeting() {
        CalPg.saveMeeting();
    }

    @Then("^I check that meeting is created as expected$")
    public void iCheckThatMeetingIsCreatedAsExpected() {
        CalPg.verifyMeeting();
    }
}
