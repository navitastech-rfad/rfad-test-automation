@alm-1
Feature: System Login

  As a User, I want the landing page to say ‘Welcome’ with a field to sign in,
  so that I can access my account.

  Scenario Outline: Login to system
    Given I have entered <username> and <password> on login page
    When I select Login
    Then I can obtain access to a landing page with display <message>

    Examples:
      | username         | password  | message         |
      | admin@admin.com  | admin     | “Welcome User”  |
      | admin@admin.com  | admin     | “Welcome Admin” |

  Scenario Outline: Failure Login to system
    Given I have entered <username> and <password>
    When I select Login
    Then I would see error <message> on login page

    Examples:
      | username | password    | message                |
      | “”       | “tester"    | “Username is required” |
      | “User”   | “”          | “Password is required” |
      | “User”   | “xxxxx”     | “Invalid password”     |