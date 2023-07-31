Feature: feature to test manage vehicles page

  Scenario: validate the page of manage vehicles
 When user opens url "https://carrental.neohire.io/admin/"
    Then user able see the admin login page
    When User enters username as "admin" and passwrod as "Test@12345"
    And user clicks on login button
    Then admin should see car rental portal|admin panel
    When admin clicks on vehicle dropdown and selects manage vehicles
    Then admin should see manage vehicles page
    When admin clicks next
    And admin clicks previous
    Then its home page should be visible
    When admin will check the show entries
    And admin checks search box
    Then admin deletes a vehicle
    When admin clicks edit option
    Then edit page should be shown
    When admin makes changes 
    And clicks on save changes button
    Then prompt messege will be displayed
    And admin checks the updated details
    
