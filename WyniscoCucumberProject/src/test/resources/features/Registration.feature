
Feature: Wynisco User Registration
As a new user
I want to register on the website
So that I can access my account

Scenario: Successful Registration
	Given I am on the Registration Page
	When I enter my firstName as "test"
	When I enter my lastName as "test"
	And I enter my email as "test@gmail.com"
	And I enter mu mobile as "1234567890"
	And I click the submit button
	Then I should see a registration success message

	
	
	

