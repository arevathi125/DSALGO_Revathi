#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@dataStructure
Feature: DS Algo DataStructure Page
  
  @dataStructure
  Scenario: User navigate to dataStructure Page
    Scenario Outline: user navigate to datastructure page
	  Given user login with username "USERNAME" and password "PASSWORD" given through config
 	  Given user launch datastructure page  
    When  click on timecomplexity ,tryHere and tryEditor assessment page is open 
    Then  user enters code from <sheetNumber> and <rownumber> then click run , code is printed    
    Then  user navigate to homepage
    Examples:
    |sheetNumber  |rownumber|
	  |1 	          |0		    |
	  |1	          |1        |