Feature: feature to test about us button functionality

  Scenario: Check about us page is displayed on clicking about us button
    Given user launches chrome browser
    When user navigates to url
    And click on About us button
    Then user should be able to view About us Page
