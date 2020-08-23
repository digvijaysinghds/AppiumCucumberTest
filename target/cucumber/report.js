$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Calendar.feature");
formatter.feature({
  "name": "Create a recurring meeting using Native Android/iOS Calendar App.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create a new recurring(3 days a week) meeting, and make sure it doesn\u0027t repeat on successive days",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I have Launched the Calendar app",
  "keyword": "Given "
});
formatter.step({
  "name": "I want to book a meeting with title \"\u003cMeetingTitle\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Set meeting duration as \"\u003chours\u003e\" in the evening",
  "keyword": "And "
});
formatter.step({
  "name": "Meeting is not repeated on successive days",
  "keyword": "And "
});
formatter.step({
  "name": "I save the meeting",
  "keyword": "And "
});
formatter.step({
  "name": "I check that meeting is created as expected",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "nonWorkingDay",
        "MeetingTitle",
        "hours",
        "num"
      ]
    },
    {
      "cells": [
        "Sat_Sun",
        "Recurring-Team Catch Up",
        "9",
        "1"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create a new recurring(3 days a week) meeting, and make sure it doesn\u0027t repeat on successive days",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have Launched the Calendar app",
  "keyword": "Given "
});
formatter.match({
  "location": "com.qa.stepdef.CalendarStepDef.iHaveLaunchedTheCalendarApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to book a meeting with title \"Recurring-Team Catch Up\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qa.stepdef.CalendarStepDef.iWantToBookAMeetingWithTitle(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set meeting duration as \"9\" in the evening",
  "keyword": "And "
});
formatter.match({
  "location": "com.qa.stepdef.CalendarStepDef.setMeetingDurationAsInTheEvening(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Meeting is not repeated on successive days",
  "keyword": "And "
});
formatter.match({
  "location": "com.qa.stepdef.CalendarStepDef.meetingIsNotRepeatedOnSuccessiveDays()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I save the meeting",
  "keyword": "And "
});
formatter.match({
  "location": "com.qa.stepdef.CalendarStepDef.iSaveTheMeeting()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check that meeting is created as expected",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qa.stepdef.CalendarStepDef.iCheckThatMeetingIsCreatedAsExpected()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});