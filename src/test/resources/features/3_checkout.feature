Feature: Checkout

  Scenario: Checkout
    Given user wants to open page
    When user clicks on login menu
    And user do login
    And user do checkout process
    Then order confirmation is created