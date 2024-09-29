Feature: Login Feature

  Scenario: Successfull login with valid crediantials
    Given I have entered a valid Email and Password
    When I click on login button
    Then I should be logged in successfully

  Scenario Outline: Unsuccessfull login with invalid crediantials
    Given I have entered invalid "<Email>" and "<Password>"
    When I click on login button
    Then I should see an error message "<error message>"

    Examples: 
      | Email              | Password  | error message                               |
      | james1@yopmail.com |  12345678 | These credentials do not match our records. |
      | david@yopmail.com  | 123456789 | These credentials do not match our records. |

  Scenario: Navigate to forgotten password page
    When I click on forgot password page
    Then It should redirect to password reset page
