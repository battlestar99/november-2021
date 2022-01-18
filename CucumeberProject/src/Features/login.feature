Feature: validating the login Feature of the application

  Background: 
    Given user is on the login page

  Scenario Outline: Validating the valid login credentials
    When user enters valid password "<password>"
    When user enters valid username "<username>"
    And user clicks on the login button
    Then user should be able to login

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
