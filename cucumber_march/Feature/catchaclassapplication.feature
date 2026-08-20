Feature: Login Action
 
 @SmokeTest @UAT @SIT
Scenario Outline: Login to catch a class application
	Given Catch a class open url
	And Then user enters uid <Userid> and password <Pwd> details
	And Add a New Class
	And Catch a class logout
	
 Examples:
 |LoginType         |Userid                            |Pwd            | 
 |"Freelance Tutor" |"teja.seleniumtrainer01@gmail.com"|"Catchaclass1@"|	

