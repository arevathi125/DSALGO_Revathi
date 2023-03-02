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
@Tree
Feature: DS Algo Tree 

  @Tree
  Scenario Outline: User Navigate to Tree Page and works on Overview of Trees
    Given User clicks "Get started" in Tree field
    When User clicks "Overview of Trees" first link in tree
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     1     |

   Scenario Outline: User Navigate to Tree Page and works on Terminologies
    Given User clicks "Get started" in Tree field
    When User clicks "Terminologies" second link in tree
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     1     |
      
    Scenario Outline: User Navigate to Tree Page and works on Types of Trees
    Given User clicks "Get started" in Tree field
    When User clicks "Types of Trees" third link in tree
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     0     |
   
   Scenario Outline: User Navigate to Tree Page and works on Tree Traversals
    Given User clicks "Get started" in Tree field
    When User clicks "Tree Traversals" fourth link in tree
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     1     |
      
    Scenario Outline: User Navigate to Tree Page and works on Traversals-Illustration
    Given User clicks "Get started" in Tree field
    When User clicks "Traversals-Illustration" fifth link in tree
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     0     |
      
    Scenario Outline: User Navigate to Tree Page and works on Binary Trees
    Given User clicks "Get started" in Tree field
    When User clicks "Binary Trees" sixth link in tree
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     0     |
     
    Scenario Outline: User Navigate to Tree Page and works on Types of Binary Trees
    Given User clicks "Get started" in Tree field
    When User clicks "Types of Binary Trees" seventh link in tree
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     1     |
      
    Scenario Outline: User Navigate to Tree Page and works on Implementation in Python
    Given User clicks "Get started" in Tree field
    When User clicks "Implementation in Python" eighth link in tree
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     0     |
   
   Scenario Outline: User Navigate to Tree Page and works on Binary Tree Traversals
    Given User clicks "Get started" in Tree field
    When User clicks "Binary Tree Traversals" ninth link in tree
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     1     |
   
    Scenario Outline: User Navigate to Tree Page and works on Implementation of Binary Trees
    Given User clicks "Get started" in Tree field
    When User clicks "Implementation of Binary Trees" tenth link in tree
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     0     |
      
    Scenario Outline: User Navigate to Tree Page and works on Applications of Binary trees
    Given User clicks "Get started" in Tree field
    When User clicks "Applications of Binary trees" eleventh link in tree
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     0     |
      
    Scenario Outline: User Navigate to Tree Page and works on Binary Search Trees
    Given User clicks "Get started" in Tree field
    When User clicks "Binary Search Trees" twelth link in tree
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     0     |
      
     Scenario Outline: User Navigate to Tree Page and works on Implementation Of BST
    Given User clicks "Get started" in Tree field
    When User clicks "Implementation Of BST" thirteenth link in tree
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     0     |