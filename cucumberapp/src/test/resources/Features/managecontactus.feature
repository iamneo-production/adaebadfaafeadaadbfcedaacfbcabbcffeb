Feature: feature to test the manage contactus query Page

  Scenario: validate the search in manage contact us query
    When user opens url "https://carrental.neohire.io/admin/"
    Then user should able to see admin|signin page
    When User should enter username as "admin"  and passwrod ad "Test@12345"
    And click on the login
    Then admin should able to view the car rental portal | admin panel
    When click on Manage Contactus Query
    Then admin should able to see the Manage Contact Us Queries page
    And admin checks the next option
    Then admin checks the previous option
    And admin enter the text
    Then the details of entered text will appear
    When admin checks the show entries
    Then admin reads the pending queries
    
