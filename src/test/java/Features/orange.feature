Feature: Test Orange HRM Application

  Scenario: Validate Login Page Functionality
    Given user is on login page
    When user enter valid credentails
    Then user click on login button
