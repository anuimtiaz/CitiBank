@regression @smoke @Amazon-04 @E2E
Feature: Amazon Prime Mousehover

Background: 
	Given Open Amazon Homepage
	
	Scenario: Amazon Prime Mousehover
		When Mousehover to Prime
		Then Click on Try Prime