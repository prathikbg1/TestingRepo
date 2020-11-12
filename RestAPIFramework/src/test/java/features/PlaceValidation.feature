Feature: Validating Place API

Scenario Outline:: validate place is added succesfully or not using Add Place API

Given Add place payload pass "<language>" and "<cityName>"
When Users calls "AddPlaceApi" with "POST" Http request
Then API call is success with status code 200
And In body "status" is code "OK"
And verify the placeid created that maps to "name" using "GetPlace" Api

Examples:

|language    |cityName   |
|kannada     |Bangalore  |
|Hindi       |Mumbai     |

Scenario: 

Given Verify deleteAPI
When Users calls "DeletePlaceApi" with "POST" request
Then And In body "status" is code "OK"