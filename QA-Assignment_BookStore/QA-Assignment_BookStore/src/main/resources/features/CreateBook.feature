Feature: Create Book

  Scenario: Create Book
    Given Open Browser
    When Click on Books
    When Click on Create Book
    Then fill the BookTitleField field with the
    Then fill the BookYearField field with 2010
    When Click on Save
    Then Verify validation msg
    When Click on Clear
    Then fill the BookTitleField field with Secret
    When Click on Save
    Then Check saved Successfully