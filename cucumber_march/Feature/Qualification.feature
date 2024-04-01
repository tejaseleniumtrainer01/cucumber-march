Feature: Login Action
 

@Regression @modulename @Smoketest @SIT @QA 
Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	And User enters from <From> and destination <Destination> details
#	And Click MyInfo and Qualifications
	
 
 Examples:
 | From         | Destination |FName  |LName  | Mobile     | Email            |
 |"Toronto YYZ" |"Delhi DEL"|"Teja" |"Kumar"|"9999999999"| "asdf@gmail.com" |	
 
