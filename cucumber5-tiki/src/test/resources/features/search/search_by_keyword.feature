Feature: Buy on tiki

  Scenario: Searching for a term
    Given Viet is on the tiki home page
    When he searches for "android"
    And he tick on tikinow checkbox
    And he chooses his location
    And he should be back to search result page
    And he choose the 2th product
    Then he verify the product
