Feature: Test Orange HRM Application

  Scenario: Validate Login Page Functionality
    Given user is on login page
    When user enter valid credentails
    Then user click on login button

  Scenario: Validate Home page Functionality
    When user is on home page and validate home page title
    And user validate home page url
    And user validate home page logo

  Scenario: Validate PIM Page Functionality
    When user click on pim link
    And user click on add  button
    And user enter firstname and lastname
    And user click on save button
    
    
      Scenario: Validate Search Functionality in PIM Page
    When user capture employee id
    And user click on employee list
    And user enter captured employee id
    And user click on search button


   Scenario: Validate the Admin Page Functionality
   When user click on admin link
   And user validate user on admin page
   And user click on Add button
   
