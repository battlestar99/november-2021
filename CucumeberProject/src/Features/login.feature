

Feature: validating the login Feature of the application 

Background: 
Given user is on the login page

Scenario: Validating the valid login credentials 


When user enters valid password
When user enters valid username
And user clicks on the login button
Then user should be able to login

Scenario: Validating the invalid login credentials 


When user enters invalid username
And user enters invalid password 
And user clicks on the login button
But user should not be able to login


