@alm_1
Feature: System Login

  As a User, I want the landing page to say ‘Welcome’ with a field to sign in,
  so that I can access my account.

  Scenario Outline: Login to system
    Given I am on login page
    When I entered <username> and <password> to login
    Then I can obtain access to a landing <page>

    Examples:
      | username        | password  | page                           |
      | admin@admin.com | admin     | http://localhost:4200/caselist |
      | admin@admin.com | admin     | http://localhost:4200/caselist |


  Scenario Outline: Failed login to system
    Given I am on login page
    When I entered <username> and <password> to login
    Then I will obtain error <message> display

    Examples:
      | username        | password  | message              |
      | User            |           | Password is required |
      |                 | tester    | Username is required |
#      | User            | xxxxx     | Invalid account data |
