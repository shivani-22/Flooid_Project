Feature: Testing for Flooid contact search results
  Scenario:  Testing that you can enter a search into google and Google will return results
    Given I open a google search page
    When I search for Flooid
    Then it should return results