Feature: validating the login Feature of the application

  Background: 
    Given user is on the login page

@smoke, @sanity, @regression, @tests
 Scenario Outline: Validating the valid login credentials
    When user enters valid password "<password>"
    When user enters valid username "<username>"
    And user clicks on the login button
    Then user should be able to login

    Examples: 
      | username                | password     | 
      | standard_user           | secret_sauce |

@sanity, @regression
Scenario Outline: Validating the valid login credentials
    When user enters valid password "<password>"
    When user enters valid username "<username>"
    And user clicks on the login button
    Then user should be able to login

    Examples: 
      | username                | password     |
      | locked_out_user         | secret_sauce |
      
@smoke, @regression
Scenario Outline: Validating the valid login credentials
    When user enters valid password "<password>"
    When user enters valid username "<username>"
    And user clicks on the login button
    Then user should be able to login

    Examples: 
      | username                | password     |
      | problem_user            | secret_sauce |

@regression
Scenario Outline: Validating the valid login credentials
    When user enters valid password "<password>"
    When user enters valid username "<username>"
    And user clicks on the login button
    Then user should be able to login

    Examples: 
      | username                | password     |
      | performance_glitch_user | secret_sauce |
