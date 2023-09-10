@tag
Feature: Selenium Action Class aproch

  @regression
  Scenario: verefying MultiSelect
    Given I am on Homepage "https://letcode.in/test"
    When I click Multi Select
    Then I Select all the menue presnt
    And I validate the outcomes
