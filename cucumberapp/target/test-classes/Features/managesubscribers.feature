Feature: feature to test the manage subscribers Page

  Background: 
    Given user opens the url "https://carrental.neohire.io/admin/"
    Then user should able see the admin|signin page
    And User should enter username as "admin"  and password ad "Test@12345"
    And click on login
    Then user should able to view car rental portal | admin panel
    And click on Manage Subscribers Page
    Then user should able to see the Manage Subscribers page

  Scenario: validate the search field in manage subscribers page -  TC_ID_Manage_subscribers_1
    When user enter the text
    Then the details of the entered text will appear

  Scenario: validate the show field in manage subscribers page -  TC_ID_Manage_subscribers_2
    When user click on show dropdown and select a number
    Then user should see the table with selected number of rows

  Scenario: validate the show field in manage subscribers page -  TC_ID_Manage_subscribers_3
    When User should click on the next button
    Then user should able to see new table
    And User should click on the previous button
    Then user should able to see previous table

  Scenario: Validate the action option in Manage Subscribers Page  -  TC_ID_Manage_subscribers_4
    When click on cross mark
    And click on Okay
    Then user should see the success message

  Scenario: Validate the action option in Manage Subscribers Page  - TC_ID_Manage_subscribers_5
    When click on cross mark
    And click on Cancel
    Then user is still in the same page
