Feature: Verify Manage Brands Functionality for car Rental Management

  Background: 
    Given admin launch the browser
    When admin opens url "https://carrental.neohire.io/admin/"
    Then admin navigates to Admin|SignIn page
    When admin enters username as "admin"  and password as "Test@12345"
    And click on login button
    Then admin should able to view car rental portal | admin panel
    When admin click on Brands
    And click on Manage Brands
    Then admin will navigate to Manage Brands Page

  Scenario: Verify show and search in Manage Brands
    When admin selects show entries
    And admin search for the brand name
    Then filtered result will be displayed

  Scenario: Verify previous and next button in Manage Brands
    When admin clicks on Next button
    And Previous button
    Then entries will be displayed

  Scenario: Verify edit option in Manage Brands
    When admin click edit option in action
    Then it navigates to Update Brand page
    When admin updates the brand name
    And click on submit button
    Then the success message will be displayed
    And Updation date also displayed
    When admin navigates to "https://carrental.neohire.io/car-listing.php"
    And click on select brand dropdown
    Then verify the updated brand name

  Scenario: Verify delete option in Manage Brands
    When admin click on delete option in action
    Then confirm alert displays and accept it
    Then success page updated message will be displayed

  Scenario: Verify delete option in Manage Brands
    When admin click on delete option in action
    Then confirm alert displays and reject it
    Then admin will be on manage brand page
