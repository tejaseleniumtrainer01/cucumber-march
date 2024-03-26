Feature: Login Action
 

@Regression @modulename @Smoketest @SIT @QA 
Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	And User enters <Uid> and <Pwd> with credentials
	And Click MyInfo and Qualifications
	
 
 Examples:
 |Uid     |Pwd       |FName  |LName  | Mobile     | Email            |
 |"Admin" |"admin123"|"Teja" |"Kumar"|"9999999999"| "asdf@gmail.com" |	
 
