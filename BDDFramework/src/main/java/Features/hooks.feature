Feature: Free CRM app test 


Scenario: free crm create campaign test 
	Given user is on CRM home page click on plus sign
	When user select campaign option fill the form and click on save
	Then campaign is created 
	

Scenario Outline: free crm create vendor test

Given user is on campaign page click on plus sign
When user select vendor option 
And user enters "<Vendor Name>" and click on save button
Then vendor is created

Examples:
|Vendor Name|
|Amazon|