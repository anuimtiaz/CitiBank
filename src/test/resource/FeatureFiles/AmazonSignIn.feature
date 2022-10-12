@regression @smoke @Amazon-06 @E2E
Feature: Amazon Sign In Functionality

Background: 
	Given Open Amazon Homepage
	
	Scenario: Amazon Sign In Functionality
		When Mousehover to Account List
		And Click on Sign In
		And Enter Email or Mobile Phone Number
		And Click on Continue
		And Enter Password
		And Click Sign-In
		Then User Should Able to Sign-in and Homepage Appear