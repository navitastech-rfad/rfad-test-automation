Feature: Review List Cases

  As an Adjudicator, I want to see a list of fraud reports showing Case Number, Entity, Status
  and a View Case button so that I can access report details


  Scenario: Display User List Cases
    Given I have login as an Adjudicator
    When System redirect me to landing page
    Then I can see the list of fraud reports

 
