Feature: feature to test post a vehicle page

  Scenario: to validate the page of post a vehicle page
 When user opens url "https://carrental.neohire.io/admin/"
    Then admin login page should be visible
    When the username as "admin" and password as "Test@12345"
    And clicks on login button
    Then admin home page should be visible
    When user clicks on vehicles category and selects post a vehicle
    Then post a vehicle page should be visible
    And user click save changes button
    And enters the vehicle form 
    And clicks savechanges button
    Then admin redirects to car listing page
    And checks the posted vehicle is visible
