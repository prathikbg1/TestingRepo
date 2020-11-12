Feature: create contact flow check

Scenario Outline: Create a contact using user details
Given User is in zoho HomePage
When User clicks on Login Page
And Enters "<username>" clicks next
And Enters "<password>" clicks SignIn
And User will login succesfully verify it
Then User clicks on Plus sign option
And user select contact option
And User Enters "<fname>" and "<lname>" and "<department>" and clicks save option
And verify the contact creation
And close firefox browser

Examples:

 |username                 |password         |fname           |lname          |depatment    |
 |prathikgwnkr9@gmail.com  |Prat1234@       |Tom             |K              |IT           |
                                            