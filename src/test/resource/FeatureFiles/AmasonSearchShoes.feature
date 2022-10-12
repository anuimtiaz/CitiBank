@regression @smoke @Amazon-01 @E2E
Feature: Amazon Search Functionality

Background: 
	Given Open Amazon Homepage
	
	Scenario: Search for Shoes
		When Search for shoes
		Then Item list should have only shoes related products