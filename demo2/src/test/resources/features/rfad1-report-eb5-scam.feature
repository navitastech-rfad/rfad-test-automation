@alm_1
Feature: Report a new EB5 scam

  As a member of the public, I want to be able to submit a tip to USCIS to report an EB5 scam

  Scenario: Report a new EB5 scam
    Given I am on the USCIS EB5 scam
    When I click on Submit New button
    Then I will be redirect to submit a scam