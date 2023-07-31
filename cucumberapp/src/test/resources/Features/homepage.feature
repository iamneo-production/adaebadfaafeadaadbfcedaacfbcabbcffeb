Feature: Feature to test FAQs button functionality

  Background: 
    Given user launches chrome browser
    When user navigates to url
    Then user shoud be able to view carrental portal

  Scenario: Check FAQs page is displayed on clicking faqs button
    When click on FAQs button
    Then user should be able to view FAQs Page

  Scenario: Check Contact us page functionality
    And click on Contact us button
    Then user should be able to view Contact us Page
    When type your full name
    And type your email
    And your phone number
    And type a message
    And click on send message
    Then user should view SUCCESS
  
  Scenario: Verify the warning message for empty fields
  	And click on Contact us button
    Then user should be able to view Contact us Page
    When type your full name
    And type your email
    And your phone number
    And type a message
    When clear full name
    And click on send message
    Then a validation message is displayed
    When type your full name
    When clear email
    And click on send message
    Then a validation message is displayed
    When type your email
    When clear phone number
    And click on send message
    Then a validation message is displayed

  Scenario: Check Admin sign in page is displayed on clicking Admin button
    And click on Admin button
    Then user should be able to view Admin signin Page

  Scenario: Check Login page is displayed on clicking Login/Register button
    And click on Login/Register button
    Then user should be able to view Login Page

  Scenario: Check privacy policy page and Terms of use page is displayed on clicking privacy and terms of use button respectively
    And click on privacy button
    Then user should be able to view privacy Page
    And click on terms of use button
    Then user should be able to Terms and Conditions Page

  Scenario: Check functionality of Subscribe button
    When enter email address
    And click on subscribe button
    Then user should be able to see popup message

  Scenario: Check functionality Service HelpLine button
    When click on Service Helpline option
    Then user should be able to see a popup message
  
  
  
