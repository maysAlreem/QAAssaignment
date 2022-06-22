Feature: Search on Book

  Scenario: Search on Book

    Given Open Browser
    When fill the SearchField field with the secret
    When Click on Search
    Then Check if is opened successfully