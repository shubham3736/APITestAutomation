Feature: Get Customer details by ID
  Scenario: User calls web service to get a details for the customer by ID
	Given a Customer exists with an ID IN3546
	When a user retrieves the customer details by ID
	Then the status code is 200
	And response includes the following
	| Validations 	        | login details			| 
    | Views					| 2						|
    | SubViews     			| 5 				    |
	| Workflow		      	| Manager Approval 		|