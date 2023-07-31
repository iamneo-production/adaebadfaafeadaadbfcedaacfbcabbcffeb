
Feature: FAQs 
  As an Customer,
  I should be able to see the FAQ page

  Scenario: Home | FAQs
  Successful Login with valid credentials
    Given User Launch chrome browser
    When User opens url "https://carrental.neohire.io/page.php?type=faqs"
    Then User should be able to view the message