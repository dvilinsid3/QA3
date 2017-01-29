Feature:
  As a user
  I want to be able to subscribe to the newsletter

  Scenario: Subscribe - invalid or no email
    Given user is on main page
    When user provides "ABCDEFGHIJK" email
    Then user should see an "Invalid email address" message box

  Scenario: Subscribe - correct email
    Given user is on main page
    When user provides "test@test.test" email
    Then user should see an confirmation message box