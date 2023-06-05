Feature: Nopcommerce
  Background:
    Given user able to open browser
    And  Enter Url

    Scenario Outline: Register
      When  user click on register link
      Then verify register page title
      Then enter "<Firstname>" and "<Lastname>" and "<Email>"
      And use valid "<Password>" and "<Confirmpassword>"
      Then Click on register button

      Examples:
      |Firstname|Lastname|Email|Password|Confirmpassword|
      |ganga    |chavda  |gitgohil@yahoo.com|abc123456@|abc123456@|

