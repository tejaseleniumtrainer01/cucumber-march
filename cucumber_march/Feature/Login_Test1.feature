Feature: Login Action
 
@Regression @modulename @Smoketest  @QA 
Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	And User enters <Uid> and <Pwd> with credentials
	And Compelte registraion <FName> and <LName>
	Then Message displayed Login Successfully

 
 Examples:
 |Uid     |Pwd       |FName  |LName  |
 |"Admin" |"admin123"|"Teja" |"Kumar"|	
 |"Admin" |"admin123"|"John" |"John" |



@Regression @modulename @Smoketest  @QA 
Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	And User enters <Uid> and <Pwd> with credentials
	 
 Examples:
 |Uid     |Pwd       |
 |"Admin" |"admin123"|	
 |"Admin" |"admin123"|
