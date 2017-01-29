Feature:
  Adding items to cart
  Buying items

  Scenario:
    Given user is on main page
    When user adds "Blouse" item to shopping cart
    And user select proceed to checkout
    And user select proceed to checkout
    And user enters "dvil.insid3@gmail.com" and "test1"
    And user clicks on Sign In button
    And user selects proceed to checkout
    And user agrees with terms and conditions
    And user selects proceed to checkout
    And user selects payment option "1"
      |No ||Option                 |
      |1  ||Pay by bank wire       |
      |2  ||Pay by check           |
    And user confirms his order
    Then order confirmation page is shown
