Feature: Review Case Details

  As an Adjudicator, I want to be able to see the report details and
  add a message so that I can update the status of the case
  
  Scenario Outline: Review Case Details
    Given I am on the list of fraud reports
    When I click on view case on the page
    Then I can obtain the case details showing <case> <entity> <status>

  Examples:
    | case         | entity         | status      |
    | C-011        | Company A      | Pending     |



