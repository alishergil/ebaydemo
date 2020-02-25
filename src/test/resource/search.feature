Feature: search
  As a user
  I want to search for products on ebay
  So that i can find out the product prices

  Scenario: user searching products on Ebay
    Given user IS ON Ebay Homepage
    When user can search product "nike"
    And  user click on searchbox
    And  user can select the price list "Low to High"
    And  user can print all the pricelist from "Low to High"
    Then user can see the respective results
