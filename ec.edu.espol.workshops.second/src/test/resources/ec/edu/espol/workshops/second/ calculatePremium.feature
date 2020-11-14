Feature: Calculate the insurance prime for a customer
	Scenario: The customer is under 44 years old 
		Given is under 44 years old
		When Calculate the insurance prime
		Then Show 500
		
	Scenario Outline: The customer is under 44 years old
		Given is under <age> years old
		When Calculate the insurance prime
		Then Show <prime>
		
		Examples:
		| age	| prime |
		|	24	| 500   |
		| 40	| 500   |
		| 16	| -1	  |
		
	Scenario Outline: The customer is over 80 years old
		Given The customer is over <age> years old
		And is married "married"
		And is gender "gender"
		And have a "statusLicense"
		When Calculate the insurance prime customer over 80
		Then Show insurance <prime>
		
		Examples:
		| age	| marriedStatus | gender 			 | statusLicense	 | prime |
		|	81	| no						|	female			 | Yes						 | -1    |
		|	82	| No						|	female			 | Yes						 | -1  	 |
		|	83	| Yes						|	Male  			 | Yes						 | -1    |
		

	Scenario Outline: Calculate the insurance prime for a customer female
		Given the customer is female
		When Calculate the insurance prime for a customer female
		Then Show prime
		
		Scenario Outline: Calculate the insurance prime for a customer under 18 years old
		Given The costumer is under 18 years old 
		And is male
		When Calculate the insurance prime for a customer under 18 years old
		Then Show prime customer
		
			