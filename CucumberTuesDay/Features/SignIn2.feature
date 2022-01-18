#Author - Zakir
#Date - 01/11/2022
Feature: Signin feature

  Scenario: Positive testing
    Given user is in sign page
    When user isert valid username
    And user insert valid password
    And user click on signin button
    Then user should be able to login
      
 Scenario: Negetive testing
    Given user is in sign page
    When user isert valid username
    And user insert valid password
    And user click on signin button
    Then user should be able to login
