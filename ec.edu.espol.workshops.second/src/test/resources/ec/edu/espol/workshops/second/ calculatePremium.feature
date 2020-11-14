Feature: Calculate the insurance prime for a customer under 44 years old
	Scenario: The customer is under 44 years old 
		Given is under 44 years old
		#And is married
		When Calculate the insurance prime
		Then Show 500
		
	Scenario Outline: The customer is under 44 years old
		Given is under <age> years old
		#And is <marriedStatus>
		When Calculate the insurance prime
		Then Show <prime>
		
		Examples:
		| age	| marriedStatus | prime |
		|	24	| Y							| 500   |
		| 40	| y							| 500   |
		| 16	| N							| 500   |
		

	Scenario: The customer is female  
		Given is customer female
		When Calculate the insurance prime
		Then Show 300
		
	Scenario Outline: Calculate the insurance prime for a customer
		Given is customer <gender>
		When Calculate the insurance prime
		Then Show <prime>		
		Examples:
		| gender | prime |
		|	f			 | 300   |
		| F			 | 300   |




