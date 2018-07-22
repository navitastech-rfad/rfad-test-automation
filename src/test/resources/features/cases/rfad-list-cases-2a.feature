@alm-2a
Feature: Review List Cases

  As a User, I want to see a list of cases assigned to me so that I can manage my workload.
  As an Admin, I want to see what a user can see in addition to whose the user is assigned to.

  Scenario: Display User List Cases
    Given I have login as a User
    When I am on the List Cases Screen
    Then I can obtain a list of cases assigned to me
    """
    Case-9274845
    Case-2836927
    Case-2739757
    Case-6718203
    """

  Scenario: Review Admin List Cases
    Given That I have login as an Admin
    When I am on the List Cases Screen
    Then I can obtain a list of cases with the assigned user
    """
    Case-9274845, User1
    Case-2836927, User2
    Case-2739757, User3
    Case-6718203, User4
    """

  Scenario: No List Cases Assigned Me
    Given That I have successfully login
    When No list cases found
    Then Screen would display empty list
 
