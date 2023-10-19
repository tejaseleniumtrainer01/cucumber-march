Feature: Login Action
 
@Regression @modulename @Smoketest @UAT @QA 
Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	And User enters <Uid> and <Pwd> with credentials
#	And Compelte registraion <FName> and <LName>
#	Then Message displayed Login Successfully

 
 Examples:
 |Uid     |Pwd       |FName  |LName  |
 |"Admin" |"admin123"|"Teja" |"Kumar"|	
# |"Admin" |"admin123"|"John" |"John" |
# |"Admin" |"admin123"|"Smith"|"Smith"|