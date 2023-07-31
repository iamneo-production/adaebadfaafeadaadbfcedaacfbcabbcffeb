Feature: feature to test the Manage pages page

  Background: 
    Given user opens the url "https://carrental.neohire.io/admin/"
    Then user should able see the admin|signin page
    And User should enter username as "admin"  and password ad "Test@12345"
    And click on login
    Then user should able to view car rental portal | admin panel
    And click on ManagePages

  Scenario: Validate the Manage Page button is working or not - TC_ID_ManagePages_1
    When click on ManagePages
    Then user should see the Manage Pages Page

   Scenario: Validate terms and conditions option in dropdown - TC_ID_ManagePage_2
    When user click on select page dropdown and select terms and conditions
    And user should enter the information in the page details
    And click on update
    Then user should able see the success notification
    And user go to terms and condition page
    Then user should see the terms and conditions page with updated information

  Scenario: Validate privacy and policy option in dropdown - TC_ID_ManagePage_3
    When user click on select page dropdown and select privacy and policy
    And user should enter the information in the page details of privacy
    And click on update
    Then user should able see the success notification
    And user go to privacy and policy page
    Then user should see the privacy and policy page with updated information
#
  Scenario: Validate about us option in dropdown - TC_ID_ManagePage_4
    When user click on select page dropdown and select about us
    And user should enter the information in the page details of about us
    And click on update
    Then user should able see the success notification
    And user go to about us page
    Then user should see the about us page with updated information

  Scenario: Validate FQAs option in dropdown  -TC_ID_ManagePage_5
    When user click on select page dropdown and select FQAs
    And user should enter the information in the page details of FQAs
    And click on update
    Then user should able see the success notification
    And user go to FQAs page
    Then user should see the FQAs page with updated information
