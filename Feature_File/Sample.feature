Feature: Covid Guidelines
  Scenario: All must need to adhere to the new covid guidelines
    Given Its covid time
    When we go out
    And it is inside a closed space
    Then we must wear our face mask