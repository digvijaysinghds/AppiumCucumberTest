Feature: Create a recurring meeting using Native Android/iOS Calendar App.

  @test
  Scenario Outline: Create a new recurring(3 days a week) meeting, and make sure it doesn't repeat on successive days

  Given I have Launched the Calendar app
  #When It is not a "<NonWorkingDay>"
  Then I want to book a meeting with title "<MeetingTitle>"
  And Set meeting duration as "<hours>" in the evening
  And Meeting is not repeated on successive days
  #And I invite "<num>" of people
  And I save the meeting
  Then I check that meeting is created as expected
    Examples:
      | nonWorkingDay | MeetingTitle |hours | num |
      | Sat_Sun       | Recurring-Team Catch Up |9    | 1     |