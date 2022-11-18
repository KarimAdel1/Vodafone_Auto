Feature: Automating Test for Vodafone eshop
  Scenario: Successful Opening Vodafone eshop select products
    Given User Open Vodafone eshop website
    And User Selects first product from main menu
    And User click on buy now button "اشتري الان"
    And User click on main menu to continue shopping
    And User Selects second product from main menu
    And User click on buy now button "اشتري الان"
    And User click on main menu to continue shopping
    And User searches for the third product from search bar
    And User Selects the third button from search result
    And User click on buy now button "اشتري الان"
    And User click on proceed to pay button
    And Screen of filling detail should appear
    Then Browser closes when test done