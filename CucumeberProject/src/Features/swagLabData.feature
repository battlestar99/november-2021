# author:
# date:
Feature: SwagLab login
@smoke12
  Scenario Outline: Validating multiple set of test data for login
    Given user is on the login page
    When user enters username "<username>" in app
    When user enters passsword "<password>" in app
    And user clicks on the login button
    Then user should be be able to login based on "<expectedUrl>" in app

    Examples: 
      | username                | password     | expectedUrl                              |
      | standard_user           | secret_sauce | https://www.saucedemo.com/inventory.html |
      | locked_out_user         | secret_sauce | https://www.saucedemo.com/               |
      | problem_user            | secret_sauce | https://www.saucedemo.com/inventory.html |
      | performance_glitch_user | secret_sauce | https://www.saucedemo.com/inventory.html |
      | standard_user           | secret_sauce | https://www.saucedemo.com/inventory.html |
      | locked_out_user         | secret_sauce | https://www.saucedemo.com/               |
      | problem_user            | secret_sauce | https://www.saucedemo.com/inventory.html |
      | performance_glitch_user | secret_sauce | https://www.saucedemo.com/inventory.html |
