
Feature: Testing for Flooid contact search results
  Scenario:  Testing that you can enter a search into google and Google will return results
    Given I open a google search page
    When I search for Flooid
    Then it should return results

    Scenario: : List 10 top websites that contains the phone number of Flooid Coventry and validate
    any website has details other than Flooid
      Given I consider the top five websites
      When I visit on them one by one
      And Check for the presence of Flooid Coventry phone number
      Then The websites that displays the number on their prime page are a pass
      When The websites doesnt have phone number displayed on their prime page
      Then Its a fail case