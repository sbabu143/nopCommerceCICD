
Feature: Buy computer
  As a customer,
  I want to select computer and add to basket
  so that I can buy

  Scenario: validate computer buying process
    Given I am on the home page
    And I click on the "Computers"
    Then I should see "Computers" text on result page
    And the url should contain with "/computers"
    When I click on the "Desktops"
    Then I should see "desktops" text on result page
    When I click on Lenovo IdeaCentre 600 All-in-One PC
    Then I should see "Lenovo IdeaCentre 600 All-in-One PC" text on result page
    And I click on "ADD TO CART"
    Then I should see "The product has been added to your shopping cart" message


