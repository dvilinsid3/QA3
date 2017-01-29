Feature:
  As a user
  I want to be able to share information about this website on popular social media sites

  Scenario: Facebook
    Given user is on main page
    When user clicks on Facebook icon
    Then user is redirected to selenium framework facebook profile

  Scenario: Twitter
    Given user is on main page
    When user clicks on Twitter icon
    Then user is redirected to selenium framework Twitter profile

  Scenario: YouTube
    Given user is on main page
    When user clicks on Youtube icon
    Then user is redirected to selenium framework YouTube profile

  Scenario: Google plus
    Given user is on main page
    When user clicks on googleplus icon
    Then user is redirected to selenium framework googleplus profile