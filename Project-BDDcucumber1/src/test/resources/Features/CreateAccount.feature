Feature: Rediff Account Creation
#https://www.rediff.com/

Scenario: Create a new Rediff account from the Sign-In page

Given I navigate to website page
When I clicked sign in link
When I clicked create account link
And I entered the details
Then I clicked the create account button
