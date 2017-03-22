
Feature: Login to Softools

Scenario: login with softools account
Given I launch given url "https://prerelease.on.softools.net/"
	When I provide userid "testing\tester"
	And I provide password "SofTest93"
	Then I click login button


