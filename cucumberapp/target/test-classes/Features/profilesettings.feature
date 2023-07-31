Feature: To validate the profile settings option in the user module

  Background: 
    Given user launches chrome browser
    When user navigates to url
    Then user shoud be able to view carrental portal
    Then Click on the login/Register button
    And Enter the Email address as "steja7600@gmail.com" and password as "9014963608"
    And click on Login button
    Then user should see the welcome message
    And user should click on the dropdown and select the profile settings
    Then user should see the Your Profile settings page

  Scenario: To validate the entered fields are updated in the admin module
    When user enter all the details
    And click on save changes
    Then user should see the success message in profile page
    And Click on the signout
    Then user should see the homepage

  Scenario: To validate the entered fields are updated in the admin module
    When user should clear the name field
    And click on save changes
    Then user should see the validation message near name filed
    And Click on the signout

  Scenario: To validate the entered fields are updated in the admin module
    When user should clear the phone number field
    And click on save changes
    Then user should see the validation message near phone number field
    And Click on the signout

  Scenario: To validate the entered fields are updated in the admin module
    When user enter all the details
    And click on save changes
    And user should click on the dropdown and select the profile settings
    And click on admin
    Then admin should able to see the admin signin page
    When admin enters the username as "admin"  and password as "Test@12345"
    And click on the login button
    Then admin should be able to view the car rental portal | admin panel
    And Click on Reg Users
    Then user should see the Registered Users Page
    And enter the user name in the search box
    Then user should see the updated info in the table
