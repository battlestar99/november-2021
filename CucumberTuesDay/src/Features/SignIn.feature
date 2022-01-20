#Author - Zakir
#Date - 01/11/2022
Feature: Signin feature

  Scenario Outline: Positive testing
    Given user is in sign page
    When user isert valid "<username>"
    And user insert valid "<password>"
    And user click on signin button
    Then user should be able to login

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |

      
 Scenario Outline: Negetive testing
    Given user is in sign page
    When user isert valid "<username>"
    And user insert valid "<password>"
    And user click on signin button
    Then user should be able to login

    Examples: 
      | username                | password     |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |

