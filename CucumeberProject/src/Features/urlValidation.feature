

Feature: Home page links

Scenario: Validating multiple links in the home page 

Given user is in the home page 
When  user clicks on the special link
Then user should be on the special page
When user clicks on the new products link
Then user should be on the new product page
When user clicks on the best sellers link 
Then user should be on the best sellers page
When user clicks on the our stores link 
Then user should be on the our stores page 


