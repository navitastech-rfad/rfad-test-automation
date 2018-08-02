@alm_2
Feature: Provide info of a new scam

  As a member of the public, I want to be able to provide the description of the scam

  Scenario Outline: Provide info of a new scam
    Given I am on the Submit New page
    When I entered <firstname>, <lastname>, <email>, <phonenumber> and <descriptions>
    Then I am able to submit the scam

    Examples:
      | firstname   | lastname    | email               | phonenumber   | descriptions
      | John        | Doe         | john.doe@yahoo.com  | 1234567890    | This is scam info