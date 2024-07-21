Feature: Test Orange HRM Application

  Scenario: Validate Login Page Functionality
    Given user is on login page
    When user enter valid credentails
    Then user click on login button

  Scenario: Validate Home page Functionality
    When user is on home page and validate home page title
    And user validate home page url
    And user validate home page logo
