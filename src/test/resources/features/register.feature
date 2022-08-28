Feature: registering a new account

  @register
  Scenario: register new account on element14
    Given user navigate to the website
    When user clicks the register button
    And user enters the name
    And user enters Email Address
    And user enters Password
    And user enters Confirm Password
    And user selects United Kingdom
    And user enters First Name
    And user enters Last Name
    And user clicks privacy Policy For Details CheckBox
    And user clicks the second check box about Terms of Service
    #And user clicks the CAPTCHA check box
    And user clicks Join now
    Then user verifies "Welcome to the community! Your account has been created and you are signed in." message