Feature: Nopcommerce
  Background:
    Given user able to open browser1
    And  Enter Url1

    Scenario:  NopCommerce valid login test
      When USER CLICK ON LOGIN LINK
      And user on login page and verify login page title
      Then Enter username and password and click on login link


