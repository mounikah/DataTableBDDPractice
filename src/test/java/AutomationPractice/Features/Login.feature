Feature: User Login in Automation Practice website
  As a User
  I want to see Login page
  so that I can login successfully

  @validLogin
  Scenario: User can able to login with valid credentials
    Given User is on the home page
    When User selects sign in button
    Then User should see the login page
    When User enter valid login details
      | Field    | Value                    |
      | Email    | qamasters@mailinator.com |
      | Password | Password1                |
    And selects submit
    Then User should login successfully
