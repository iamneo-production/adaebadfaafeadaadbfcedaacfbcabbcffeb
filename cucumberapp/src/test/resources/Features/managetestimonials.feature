Feature: feature to test the manage testimonial Page

  Background: 
    Given user opens the url "https://carrental.neohire.io/admin/"
    Then user should able see the admin|signin page
    And User should enter username as "admin"  and password ad "Test@12345"
    And click on login
    Then user should able to view car rental portal | admin panel
    And click on Manage Testimonials
    Then user should able to see the Manage Testimonials page

  Scenario: validate the search field in manage testimonial page -  TC_ID_Manage_1
    When user enter the text
    Then the details of the entered text will appear

  Scenario: validate the show field in manage testimonial page -  TC_ID_Manage_2
    When user click on show dropdown and select a number
    Then user should see the table with selected number of rows

  Scenario: validate the show field in manage testimonial page -  TC_ID_Manage_3
    When User should click on the next button
    Then user should able to see new table
    And User should click on the previous button
    Then user should able to see previous table

   Scenario: Validate the inactive option and then click on okay in testimonial page - TC_ID_Manage_4
    When click on Inactive
    And click on Okay
    Then user should able see the success message
    Then check the active message is displayed in home page 

  Scenario: Validate the inactive option and then click on cancel in testimonial page -  TC_ID_Manage_5
    When click on Inactive
    And click on Cancel
    Then user should be in the same page

  Scenario: Validate the active option and then click on okay in testimonial page - TC_ID_Manage_6
    When click on active
    And click on Okay
    Then user should able to see the success message of inactive
    Then check the inactive message is not displayed in home page

  Scenario: Validate the active option and then click on cancel in testimonial page - TC_ID_Manage_7
    When click on active
    And click on Cancel
    Then user should be in the same page
