@regression @smoke @Amazon-10 @E2E
Feature: Amazon Career Search Functionality

Background: 
	Given Open Amazon Homepage
	
	Scenario: Amazon Career Search Functionality
		When Click on Career
		And Search for Job
		And Search for Location
		And Click on Search
		Then Job Search Result Should Appear