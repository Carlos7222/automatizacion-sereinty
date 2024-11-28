Feature: Add transaction


  Scenario: Add new transaction
    Given Pepito is logged into the application
    |user|pass|
    When Pepito enter the required information fo the new transtaction
    |12-12-2023|500|wwww |
    Then Pepito should see a new transaction in the table