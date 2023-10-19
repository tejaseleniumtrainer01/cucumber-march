Feature: Login Action
 
@Regression @modulename @Smoketest @SIT @QA @Dev
Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters <Uid> and <Pwd> with credentials
	And User Compeltes registraion by entering fname <FName> , lname <LName>, mobile<Mobile> and email<Email>
	Then Message displayed Login Successfully
 
 Examples:
 |Uid    |Pwd   |FName  |LName  | Mobile     | Email            |
 |"Teja" |"asdf"|"Teja" |"Kumar"|"9999999999"| "asdf@gmail.com" |	
 