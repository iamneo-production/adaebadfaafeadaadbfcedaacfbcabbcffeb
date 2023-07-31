Feature: Feature to verify post a testimonial functionality of car rental website

  Background: 
    Given user launches chrome browser
    When user navigates to url
    Then user shoud be able to view carrental portal
    When user clicks on Login/Register module
    And fill the form
    And click on Login button
    Then welcome message will be displayed
    When user click on dropdown menu
    And click on Post a testimonial
    Then user navigates to post a testimonial page

  Scenario: Verify post a testimonial
    When user enters a testimonial
    And user clicks on save button
    Then testimonial submitted message will be displayed
    When admin clicks on the Admin module
    Then admin should able to see the admin signin page
    When admin enters the username as "admin"  and password as "Test@12345"
    And click on the login button
    Then admin should be able to view the car rental portal | admin panel
    When admin click on manage testimonials
    Then admin navigates to manage testimonial page
    And verify the posted testimonial

  Scenario: Verify empty testimonial field
    When user click on save button
    Then warning message will be displayed

  Scenario: Verify signout option
    When user click on dropdown menu
    And click on signout option
    Then it should be redirected to the home page
 
