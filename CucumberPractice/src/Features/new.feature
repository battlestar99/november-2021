#Author - Zakir
#Date - 01/12/2022
Feature: Signin to the application

@tests
  Scenario Outline: positive testing
    Given user is in signin page
    When user insert valid username "<username>"
    And user insert valid password "<password>"
    And user click on login button
    Then user should login

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
      
Scenario Outline: positive testing
    Given user is in signin page
    When user insert valid username "<username>"
    And user insert valid password "<password>"
    And user click on login button
    Then user should login

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
