Feature: Fill in form feature to fill in a form on a webpage 

  @testing
  Scenario: Login as a authenticated user
    Given user is on form homepage
    When user fill in name "kalle" and job title
    And user enters level of education years of experience
    And press submit button
    Then success message is displayed
