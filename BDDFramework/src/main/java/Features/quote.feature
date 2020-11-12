Feature: create CRM flow check

Scenario: Create a quote 
Given User is in zoho HomePage1
When User clicks on Login Page1
And Enters username clicks next
|prathikgwnkr9@gmail.com |
And Enters password clicks SignIn
|Prat1234@  |
And User will login succesfully verify it1
Then User clicks on plus option
And User select quote option
And User Enters Subject and ContactName and AccountName
|Trippy  |Tom k   |dcd |  
And user select save option
And verify the quote Page
And close browser firefox