Feature: Login Action
 
@Regression @modulename @Smoketest @SIT @QA @UAT 
Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters <Uid> and <Pwd> with credentials
	And Compelte registraion <FName> and <LName>
	Then Message displayed Login Successfully
 
 Examples:
 |Uid		    |Pwd  |FName  	 |LName  |
 |"Madhavi" |"xyz"|"Madhavi" |"Battu"|	
 