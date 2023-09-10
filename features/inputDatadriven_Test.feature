@tag
Feature: Dtadriven test on input usiong multiple testData

  @regrerssion
  Scenario Outline: verifying input field
    Given I am on Homepage "https://letcode.in/test"
    When I Click on input "<Link>"
    Then I enter "<FullName>" and "<Append>" and "<What>" and "<Clear>"
    And I verfie value "<Confirm>"

    Examples: 
      | Link | FullName         | Append   | What         | Clear          | Confirm               |
      | Edit | Rayhan Chowdhury | Anything | What is this | clear the Text | This text is readonly |

  @smoke
  Scenario: put the data using Datatable
    Given I am on Homepage "https://letcode.in/test"
    When I Click on input link
    Then I fillUp the form
      | FullName         | Append   | What         | Clear          |
      | Rayhan Chowdhury | Anything | What is this | clear the Text |
