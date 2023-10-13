Feature: Login Action
 
 @SmokeTest @UAT
Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters UserName and Password
	Then Message displayed Login Successfully
 
 @Regression SIT
Scenario: Successful LogOut
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters UserName and Password
	When User LogOut from the Application
	Then Message displayed LogOut Successfully

	
@SmokeTest
Scenario: Successful Login with Valid Credentials2
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters UserName and Password
	Then Message displayed Login Successfully