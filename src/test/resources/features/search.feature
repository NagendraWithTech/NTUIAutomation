Feature: Amazon Search Functionality

  Background:
    Given I am on the Amazon home page

  Scenario: Search for a product
    When I search for "<SEARCH_TERM>"
    Then I should see search results

  Scenario: Verify product details page
    When I search for "<SEARCH_TERM>"
    And I click on one of the products
    Then I should see the product details page

  Scenario: Apply a filter on search results
    When I search for "<SEARCH_TERM>"
    And I apply the filter "HP"
    Then I should see search results

  Scenario: Navigate to the next page of search results
    When I search for "<SEARCH_TERM>"
    And I navigate to the next page
    Then I should see search results on the next page
