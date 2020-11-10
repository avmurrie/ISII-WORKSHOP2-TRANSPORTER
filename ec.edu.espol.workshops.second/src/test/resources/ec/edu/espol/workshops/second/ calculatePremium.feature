
Feature:Calculate the insurance prime for a customer
	Scenario: The customer is under 44 years old 
		Given is married
		And is under 44 years old
		And	is male 
		And have a valid driving license
		When Calculate the insurance prime
		Then Show 300
		
	Scenario Outline: Customer is under 44 years old
		Given is "<marriedStatus>"
		And is under "<age>" years old
		And is "<gender>"
		And have a "<statusLicense>" 	
		When Calculate the insurance prime
		Then Show "<prime>"
		
		Examples:
		| age	| marriedStatus | gender | statusLicense | prime |
		|	24	| Y							|	M			 | Y						 | 300   |
		| 40	| y							|	m			 | y						 | 300   |
		| 16	| N							|	F			 | Y						 | 300   |
		

Feature:Calculate the insurance prime for a customer
	Scenario: The customer is over 80 years old 
		Given age is over 80 years old
		And	is not married
		And is female
		And have a valid driving license
		When Calculate the insurance prime
		Then Show -1
		
	Scenario Outline: The customer is over 80 years old
		Given age is over "<age>" years old
		And	is "<marriedStatus>"
		And is "<gender>"
		And have a "<statusLicense>"
		When Calculate the insurance prime
		Then Show "<prime>"
		
		Examples:
		| age	| marriedStatus | gender | statusLicense | prime |
		|	81	| n							|	f			 | Y						 | -1    |
		|	82	| N							|	F			 | Y						 | -1  	 |
		|	83	| Y							|	M			 | Y						 | -1    |
		

Feature: Calculate the insurance prime for a customer
	Scenario: The customer is female  
		Given is female
		When Calculate the insurance prime
		Then Show 300
		
	Scenario Outline: Calculate the insurance prime for a customer
		Given "<gender>"
		When Calculate the insurance prime
		Then Show "<prime>"
		
		Examples:
		| gender | prime |
		|	f			 | 300   |
		| F			 | 300   |


