Feature: Login hrm application
 
 
 @Regression
Scenario: Successful LogOut
	Given User is on Home Page
	When User Navigate to LogIn Page
	
	And User enters UserName and Password
	And User enters UserName and Password
	When User LogOut from the Application
	Then Message displayed LogOut Successfully

	