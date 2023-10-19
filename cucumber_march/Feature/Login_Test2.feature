Feature: Login Action
 
@Regression @modulename @Smoketest @UAT @QA 
Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters <Uid> and <Pwd> with credentials
	And Compelte registraion <FName> and <LName>
	Then Message displayed Login Successfully
 
 Examples:
 |Uid    |Pwd   |FName  |LName  |
 |"Teja" |"asdf"|"Teja" |"Kumar"|	
 |"John" |"xyza"|"John" |"John" |
 |"Smith"|"abcd"|"Smith"|"Smith"|