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
@array
Feature: DS Algo ArrayPage

# Data driven through excel file and hardcoded username and password
  @array
  Scenario Outline: User navigate to Array Page and in works Arrays in Python
    Given user login with username "Numphysdet94NN" and password "sdet94batchNN" given through config
    Given User clicks "Get started" in array
    When User clicks "Arrays in Python" first link in the arrray list
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     0     |
      | pythonCode |     1     |
   
   Scenario Outline: User navigate to Array Page and works in Arrays Using List
    #Given User login with username "Numphysdet94NN" and password "sdet94batchNN"
    Given User clicks "Get started" in array
    When User clicks "Arrays Using List" second link in the arrray list
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     0     |
      | pythonCode |     1     |
   
   Scenario Outline: User navigate to Array Page and works in Basic Operations in lists
    #Given User login with username "Numphysdet94NN" and password "sdet94batchNN"
    Given User clicks "Get started" in array
    When User clicks "Basic Operations in Lists" third link in the arrray list
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     0     |
      | pythonCode |     1     |
      
    Scenario Outline: User navigate to Array Page and works in Applications of Array
    #Given User login with username "Numphysdet94NN" and password "sdet94batchNN"
    Given User clicks "Get started" in array
    When User clicks "Applications of Array" fourth link in the arrray list
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Then user navigate to homepage
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     0     |
      | pythonCode |     1     |