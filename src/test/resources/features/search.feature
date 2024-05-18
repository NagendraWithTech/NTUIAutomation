Feature: Amazon Search Functionality

  Scenario: Search for a product
    Given I am on the Amazon home page
    When I search for "laptop"
    Then I should see search results

  Scenario: Apply a filter on search results
    Given I am on the Amazon home page
    When I search for "laptop"
    And I apply the filter "HP"
    Then I should see search results

  Scenario: Navigate to next page of search results
    Given I am on the Amazon home page
    When I search for "laptop"
    Then I should be able to navigate to the next page
