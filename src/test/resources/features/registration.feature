Feature: Registration

  Scenario Outline: Successful registration
    Given Pepito wants to sign up in the application
    When Pepito send the required information to sign up
      | <name> | <lastName> | <age> | <email> |
    Then Pepito should have a new account created
    Examples:
      | name   | lastName | age | email              |
      | carlos | rincon   | 25  | prueba@hotmail.com |
      | prueba | rincon   | 25  | prueba@hotmail.com |

  Scenario: Missing required fields for registration
    Given Pepito wants to sign up in the application
    When Pepito does not send the required information
    Then Pepito should be told all fields are required