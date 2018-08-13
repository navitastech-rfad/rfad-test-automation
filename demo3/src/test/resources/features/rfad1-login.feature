Feature: System Login

  As an Adjudicator, I want to enter a username and password so that I can sign in to EB-5 scam sign-in page.

  Scenario Outline: Login to system
    Given I am on signin page
    When I entered <username> and <password> to login
    Then I can obtain access to a Reports of Fraud <page>

    Examples:
      | username        | password  | page                           |
      | admin@admin.com | admin     | http://localhost:4200/caselist |
      | admin@admin.com | admin     | http://localhost:4200/caselist |
