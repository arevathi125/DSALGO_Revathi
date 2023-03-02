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
@queue
Feature: DS Algo Queue 
  
  @queue
  Scenario Outline: User Navigate to Queue Page and works on Implementation of Queue in Python
    Given User clicks "Get started" in Queue field
    When User clicks "Implementation of Queue in Python" first link in Queue
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     1     |

    Scenario Outline: User Navigate to Queue Page and works on Implementation using collections Deque
    Given User clicks "Get started" in Queue field
    When User clicks "Implementation using collections.deque" second link in Queue
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     0     |
      
   Scenario Outline: User Navigate to Queue Page and works on Implementation using array
    Given User clicks "Get started" in Queue field
    When User clicks "Implementation using array" third link in Queue
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     1     |
      
   Scenario Outline: User Navigate to Queue Page and works on Queue Operations
    Given User clicks "Get started" in Queue field
    When User clicks "Queue Operations" fourth link in Queue
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     0     |