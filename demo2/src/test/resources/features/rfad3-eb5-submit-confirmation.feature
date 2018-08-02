@alm_3
Feature:  New Incident Submission Confirmation

  As a member of the public, once I click “Send” for my EB-5 scam incident,
  I want to see a screen telling me “Thank you for your submission”.

  Scenario: Scam Incident Submission Confirmation
    Given That I have entered my EB-5 scam incident
    When I click Send
    Then I can see a message notifying me that my submission was successful