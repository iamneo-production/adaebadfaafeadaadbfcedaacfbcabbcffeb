Feature: Admin Login Functionality for Car Rental Website

  Background: 
    Given admin launch the browser
    When admin opens the url "https://carrental.neohire.io/"
    And admin clicks on Admin module
    Then admin navigates to Admin|SignIn page

  Scenario: Successful login with valid credentials
    When admin enters username as "admin"  and password as "Test@12345"
    And click on login button
    Then admin should able to view car rental portal | admin panel

  Scenario Outline: Unsuccessful login with invalid and empty credentials
    When admin enters invalid "<username>" and "<password>"
    And click on login button
    Then admin should see an error message indicating "<error_message>"

    Examples: 
      | username | password   | error_message   |
      | bunny    | Test@12345 | Invalid Details |
      | admin    | Test@12346 | Invalid Details |
      | bunny    | Test@12347 | Invalid Details |
      |          |            | Invalid Details |

  Scenario: Navigating to the back to home page
    When admin click on the Back to Home link
    Then admin should be redirected to the home page
