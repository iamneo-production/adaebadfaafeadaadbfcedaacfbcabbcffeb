Feature: Contact Us 
  As an Customer,
  I should be able to enter below details in the ContactUsloginBox to send a message on clicking Send Message Button
  i. FullName  
  ii.EmailAddress
  iii.PhoneNumber
  iv.Message
 Background:
    Given User Launch chrome browser

    Scenario: Home | Contact Us
  UnSuccessful Login with Invalid credentials
  When User opens url "https://carrental.neohire.io/contact-us.php"
    When User Enter Invalid FullName,Invalid EmailAddress,Invalid PhoneNumber,Invalid Message
    And Click on Send Message button

    Scenario: Home | Contact Us
  UnSuccessful Login with Invalid credentials
When User opens url "https://carrental.neohire.io/contact-us.php"
When User Enter valid FullName,Invalid EmailAddress,valid PhoneNumber,valid Message
 And Click on Send Message button

 Scenario: Home | Contact Us
  UnSuccessful Login with Invalid credentials
When User opens url "https://carrental.neohire.io/contact-us.php"
When User Enter valid FullName,valid EmailAddress,Invalid PhoneNumber,valid Message
And Click on Send Message button

 Scenario: Home | Contact Us
    Successful Login with valid credentials
    When User opens url "https://carrental.neohire.io/contact-us.php"
    When User Enter valid FullName,valid EmailAddress,valid PhoneNumber,valid Message
    And Click on Send Message button
    
Scenario:  Admin | Manage Contact Us Query
  Successful Login with valid credentials
    When User opens url "https://carrental.neohire.io/admin/"
    Then User should be able to view the Admin Page
    When User Enter UserName,Password
    And Click on Login
    And User Click on ManageContactUsQuery
    Then Verify the ManageContactUsPage 
    When Click on Search button
    And Enter anyone details among valid FullName,valid EmailAddress,valid PhoneNumber,valid Message,valid PostingDate,valid Action
    And Click on action button
     