Feature: User Login Functionality for Car Rental Website

  Background: 
    Given user launches chrome browser
    When user navigates to url
    Then user shoud be able to view carrental portal
 		And click on Login/Register button
    Then user should be able to view Login Page

  Scenario: Successful login with valid credentials
    And Enter the Email address as "steja7600@gmail.com" and password as "9014963608"
    And clicks login button
    Then user should see the welcome message

  Scenario Outline: Unsuccessful login with invalid and empty credentials
    When user enters invalid "<email>" and "<password>"
    And clicks login button
    Then user should see an error message indicating "<error_message>"

    Examples: 
      |email                   | password   | error_message   |
      | steja7600@gmail.com    | 9876543210 | Invalid Details |
      | steja9343@gmail.com    | 9014963608 | Invalid Details |
      | tejas7600@gmail.com    | 3746536278 | Invalid Details |
      |                        |            | Invalid Details |

  