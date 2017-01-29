Feature:
  As a user
  I want to be able to recover my password

  Scenario: Forgot password - invalid or no e-mail address
    Given user is on main page
    When user clicks on Login link
    Then user is redirected to Login page
    When user clicks on Forgot your password link
    And user clicks on Retrieve Password button
    Then user should see an "Invalid email address" message box

  Scenario: Forgot password - valid e-mail address
    Given user is on main page
    When user clicks on Login link
    Then user is redirected to Login page
    When user clicks on Forgot your password link
    And user enters "dvil.insid3@gmail.com" as email
    And user clicks on Retrieve Password button
    Then user should confirmation message box