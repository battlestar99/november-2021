

Feature: End to End Product Buy 

Scenario: Validating the end to end product buy sequence 

Given user is on the login page
When user enters valid password
And user enters valid username
And user clicks on the login button
And user adds the backpack to the cart
And user clicks on the cart button on the homepage
Then user should navigate to the checkout page
When user clicks on the checkout button
Then user should be on the checkout page
When user enters firstname
And user enters lastname
And user enters zipcode 
And user clicks on the continue button
Then user should be on the checkout step two page
When user clicks on the finish button
Then checkout should be successful 







