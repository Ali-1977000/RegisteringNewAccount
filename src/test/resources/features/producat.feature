Feature: User on the Homepage
@wip
  Scenario: Verify that after sign in we should be able to see homepage loading properly

  Given user navigate to login page
  Then the user on the login page
  And the user accept the cookies
  And the user clicks the login button
  And user enters the username
  And user enters the password
    #And user clicks on the recaptcha
  And user click on the sign button
  Then user is on the home page