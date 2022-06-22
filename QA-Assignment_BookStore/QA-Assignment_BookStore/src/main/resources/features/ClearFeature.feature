Feature: Clear the text field

  Scenario: Clear the creation book text fields
    Given Open Browser
    When Click on Books
    When Click on Create Book
    Then fill the BookTitleField field with the
    Then fill the BookYearField field with 2010
    When Click on Clear
