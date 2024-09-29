Feature: Automate Sitepro website

  Scenario Outline: Login flow
    Given Open browser
    When Enter site URL
    And check page title
    And check logo of the site
    And Enter james@yopmail.com and 12345678
    Then Click on login button
    Given Click on User module
    When Click on create new button
    And Enter one@yopmail.com and Validate
    Then Enter user information one and account and Moon
    And Select permissions and click on submit
