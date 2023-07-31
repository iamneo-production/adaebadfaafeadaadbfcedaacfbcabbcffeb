Feature: feature to test the Update contact info --#line 170 in javafile

  Background: 
    Given user opens the url "https://carrental.neohire.io/admin/"
    Then user should able see the admin|signin page
    And User should enter username as "admin"  and password ad "Test@12345"
    And click on login
    Then user should able to view car rental portal | admin panel
    And click on UpdateContactInfo
    Then user should able to see the Updatecontactinfo page

  Scenario: Validate the popup message is displayed when the admin enter invalid Email id -TC_ID_Update_contact_1
    When user enter the address
    And user enter the phonenumber
    And user enter the invalid email
    And click on update button
    Then user should see the popup message that enter the valid email id

  Scenario: Validate the popup message is displayed when the admin enter invalid contact - TC_ID_Update_contact_2 (Failed testcase)
    When user enter the address
    And user enter the invalid phonenumber
    And user enter the emailid
    And click on update button
    Then user should see the popup message that enter the field phonenumber

  Scenario: Validate the popup message is displayed when the admin enter only email, contact -TC_ID_Update_contact_3
    When clear the address field
    And click on update button
    Then user should see the popup message that enter the field address

  Scenario: Validate the popup message is displayed when the admin enter only address, contact - TC_ID_Update_contact_4
    When clear the emailid field
    And click on update button
    Then user should see the popup message that enter the field email

  Scenario: Validate the popup message is displayed when the admin enter only address, emailid - TC_ID_Update_contact_5
    When clear the phonenumber field
    And click on update button
    Then user should see the popup message that enter the field phonenumber

  Scenario: Validate the popup message is displayed when all the fields are empty - TC_ID_Update_contact_6
    When user should clear all the three fields
    And click on update button
    Then user should see the popup message that enter the field address

  Scenario: Validate the admin can change the fields in Update Contact Info in home page -   TC_ID_Update_contact_7
    When user enter the address
    And user enter the emailid
    And user enter the phonenumber
    Then click on update button
    Then user should able see the success message on contactus
    Then user should able to see the update info in the home page

   Scenario: Validate the admin can change the fields in Update Contact Info in contact us page- TC_ID_Update_contact_8
    When user enter the address
    And user enter the emailid
    And user enter the phonenumber
    And click on update button
    Then user should able see the success message on contactus
    And user should navigate to contactus page
    Then user should able to see the update info in the contactus page
