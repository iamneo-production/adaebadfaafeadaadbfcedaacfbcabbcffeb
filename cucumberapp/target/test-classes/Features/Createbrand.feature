Feature: Verify Create Brand Functionality for car Rental Management

  Background: 
    Given admin launch the browser
    When admin opens url "https://carrental.neohire.io/admin/"
    Then admin navigates to Admin|SignIn page
    When admin enters username as "admin"  and password as "Test@12345"
    And click on login button
    Then admin should able to view car rental portal | admin panel
    When admin click on Brands
    And click on Create Brand
    Then admin will navigates to create Brand Page

  Scenario: Verify the Brand Name in Create Brand
    When admin enter Brand name in the text field
    And admin click on Submit button
    Then Success message will be displayed
    When admin navigates to "https://carrental.neohire.io/car-listing.php"
    And click on select brand dropdown menu
    Then verify the brand name

  Scenario: Verify the Empty Brand Name in Create Brand
    When admin click on Submit button
    Then alert message will be displayed
