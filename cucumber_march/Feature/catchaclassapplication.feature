Feature: Login Action
 
 @SmokeTest @UAT @SIT
Scenario Outline: Login to catch a class application
	Given Catch a class open url
	And User selects <LoginType> then enters uid <Userid> and password <Pwd> details
	And Catch a class logout
	
 Examples:
 |LoginType         |Userid                            |Pwd            | 
 |"Freelance Tutor" |"teja.seleniumtrainer01@gmail.com"|"Catchaclass1@"|	

 
