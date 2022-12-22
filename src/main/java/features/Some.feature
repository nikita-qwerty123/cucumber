@NegativeTests
Feature: Negative tests
  Scenario: Check that message "Certificate not found" is appear
    When I open page "https://certificate.ithillel.ua/"
    And Enter code "12345678"
    Then Check that message is displayed

