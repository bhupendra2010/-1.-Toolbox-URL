@feature
Feature: Filters
  As an end user
  I want to apply filers
  So that i can find desired product

  @smoke @manual
  Scenario: Filter by review
    Given I am homepage
    When I enter email and password
    Then I should be able to login.

