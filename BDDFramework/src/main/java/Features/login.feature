Feature: Login flow Check

#without exmple
#Scenario: zoho login Flow Check
#Given User is in zoho HomePage
#When User clicks on Login Page
#And Enters "prathikgwnkr9@gmail.com" clicks next
#And Enters "Prat1234@" clicks SignIn
#Then User will login succesfully verify it



#with example
Scenario Outline: zoho login Flow Check
Given User is in zoho HomePage
When User clicks on Login Page
And Enters "<username>" clicks next
And Enters "<password>" clicks SignIn
Then User will login succesfully verify it
And close the browser

Examples:
             |username                 |password      |
             |prathikgwnkr9@gmail.com  |Prat1234@     |
             |abc@gmail.com            | 12345        |