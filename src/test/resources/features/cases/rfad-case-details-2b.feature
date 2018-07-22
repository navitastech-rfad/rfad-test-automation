@alm-2b
Feature: Review Case Details

  As a user, I want to see a page of case details so that I can review 
  the case number, benefit applied, first name, last name and address.
  
  Scenario Outline: Review Case Details
    Given List Cases page has list of cases
    When I select a <case> on the page
    Then I can obtain the case details showing <case>, <benefit-applied>, <first-name>, <last-name> and <address>

  Examples:
    | case           | benefit-applied | first-name | last-name | address                                           |
    | "Case-9274845" | "ABC123"        | "WILL"     | "SMITH"   | "123 MAIN STREET, ANYTOWN, WASHINGTON D.C. 20001" |
    | "Case-2836927" | "NBC444"        | "JADA"     | "PICKETT" | "123 MAIN STREET, ANYTOWN, WASHINGTON D.C. 20001" |
    | "Case-2739757" | "IOE54321"      | "RICKY"    | "MARTIN"  | "5608 HOLLYWOOD BLVD, HOLLYWOOD, CA, 90038"       |


