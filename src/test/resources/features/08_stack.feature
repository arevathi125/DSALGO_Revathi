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
@stack
Feature: Ds Algo Stack page

  @stack
  Scenario Outline: User Navigate to Stack Page and works on Operations in Stack
    Given User clicks "Get started" in stack field
    When User clicks "Operations in Stack" first link in stack
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     1     |
      
     Scenario Outline: User Navigate to Stack Page and works on Implementation
    Given User clicks "Get started" in stack field
    When User clicks "Implementation" second link in stack
    Then User clicks "Try here"
     Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     1     |
      
    Scenario Outline: User Navigate to Stack Page and works on Applications
    Given User clicks "Get started" in stack field
    When User clicks "Applications" third link in stack
    Then User clicks "Try here"
     Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     1    |