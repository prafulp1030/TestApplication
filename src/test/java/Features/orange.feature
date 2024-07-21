Feature: Test Orange HRM Application

  Scenario: Validate Login Page Functionality
    Given user is on login page
    When user enter valid credentails
    Then user click on login button

  Scenario: Validate PIM Page Functionality
    When user click on pim link
    And user click on add  button
    And user enter firstname and lastname
    And user click on save button
