Feature:
  As a user
  I want to be able to create an account on the website

  Scenario: Register - correct data
    Given user is on main page
    When user clicks on Login link
    And user provides "testemailwerwer@test.com" email for registration
    And user clicks on submit button
    And user provides required data
      |Title| |FirstName| |LastName| |Passwd|  |Day| |Month   | |Year|  |Newsletter|  |Offers|  |FirstName2| |LastName2|  |Company| |Address| |Address2|  |City|  |State| |Zip    | |AdditionalInfo|  |HomePhone|  |MobilePhone|  |AddressAlias|
      |Mr   | |John     | |Smith   | |123456|  |1  | |1       | |1980|  |1         |  |1     |  |John      | |Smith    |  |none   | |asd    | |23      |  |test|  |1    | |12300  | |none          |  |12345678 |  |555555555  |  |asdas       |
    And user clicks on register submit button
    Then account is created and user is on My account page
