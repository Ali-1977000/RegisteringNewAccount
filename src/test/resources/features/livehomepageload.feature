Feature: User on the Homepage

  Background:
    Given user navigate to login page
    Then the user on the login page
    And the user accept the cookies
    And the user clicks the login button
    And user enters the username
    And user enters the password
    #And user clicks on the recaptcha
    And user click on the sign button



  ##1 The home page (does it load,etc.)
  Scenario: Verify that after sign in we should be able to see homepage loading properly
    Then user is on the home page

  @wip
  Scenario: User can see the notifications
    ##2 Notifications(https://community.element14.com/user/nptificatons)

    Given user clicks on notification button
    And user clicks on view all button
    Then user can see Your Notifications

    ##3 https://community.element14.com/administration?returnUrl=%2Fuser%2Fnotifications#_aptype=panel&_appanelid=bbab8f4a-2b6f-413e-94e3-e0271ad8067c
    #@wip
  Scenario: Admin can see the console Moderation page


    Given Admin clicks the console button
    And Admin clicks the Moderation button
    Then Admin can see the Moderation Queue


