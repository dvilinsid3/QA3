Feature:
  As a user
  I want to be able to use the search box to find specific products

  Scenario: Search an item - no item
    Given user is on main page
    When user provide "ABCDEFGHIJK" search phase
    And user clicks on Search button
    Then warning message appears

  Scenario: Search an item - item found
    Given user is on main page
    When user provide an example search phase
      | product                     |
      | Faded Short Sleeve T-Shirts |
      | Blouse                      |
      | Printed Dress               |
      | Printed Summer Dress        |
      | Printed Chiffon Dress       |
    And user clicks on Search button
    Then page contating search results should appear
      | product                     |
      | Faded Short Sleeve T-Shirts |
      | Blouse                      |
      | Printed Dress               |
      | Printed Summer Dress        |
      | Printed Chiffon Dress       |

