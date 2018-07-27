@alm_2a
Feature: Review List Cases

  As a User, I want to see a list of cases assigned to me so that I can manage my workload.
  As an Admin, I want to see what a user can see in addition to whose the user is assigned to.

  Scenario: Display User List Cases
    Given I have login as a User
    When System redirect me to landing page
    Then I can obtain a list cases assigned to me

  Scenario: Review Admin List Cases
    Given I have login as an Admin
    When System redirect me to landing page
    Then I can obtain a list cases with assigned users

  Scenario: No List Cases Assigned Me
    Given I have login as a User
    And I do not have list cases assigned to me
    When System redirect me to landing page
    Then Screen would display empty list
 
