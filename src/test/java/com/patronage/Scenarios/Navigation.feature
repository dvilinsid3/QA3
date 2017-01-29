Feature:
  As a user
  I want to be able to navigate to specific site locations by clicking on links and images on website

  Scenario: Going back to main page
    Given user is on main page
    When user clicks on site logo
    Then user is redirected to homepage
    When user clicks on site banner
    Then user is redirected to homepage

  Scenario: Going to Contact Us page
    Given user is on main page
    When user clicks on Contact Us link
    Then user is redirected to Contact Us page

  Scenario: Going to login page
    Given user is on main page
    When user clicks on Login link
    Then user is redirected to Login page

  Scenario: Checking Women category
    Given user is on main page
    When user clicks on Women category
    Then user is redirected to Women category page

  Scenario: Checking Dresses category
    Given user is on main page
    When user clicks on Dresses category
    Then user is redirected to Dresses category page

  Scenario: Checking TShirts category
    Given user is on main page
    When user clicks on TShirts category
    Then user is redirected to TShirts category page