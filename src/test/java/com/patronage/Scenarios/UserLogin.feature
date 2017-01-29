Feature:
  As a user
  I want to be able to log into an account and logout

  Scenario: Log into an account - wrong password
    Given user is on main page
    When user clicks on Sign In link
    Then user should see authentication page
    When user enters "someUsername" and "somePassword"
    And user clicks on Sign In button
    Then user should see an "Authentication error" message box

  Scenario: Log into an account - no email
    Given user is on main page
    When user clicks on Sign In link
    Then user should see authentication page
    When user enters "someUsername" and ""
    And user clicks on Sign In button
    Then user should see an "An email address required" message box

  Scenario: Log into an account - no password
    Given user is on main page
    When user clicks on Sign In link
    Then user should see authentication page
    When user enters "" and "somePassword"
    And user clicks on Sign In button
    Then user should see an "Password is required" message box

  Scenario: Log into an account with correct data and logout
    Given user is on main page
    When user clicks on Sign In link
    Then user should see authentication page
    When user enters "dvil.insid3@gmail.com" and "test1"
    And user clicks on Sign In button
    Then user should see My Account web page
    When user clicks on Sign Out link
    Then user should see authentication page
