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
@linkedList
Feature: DS Algo LinkedList Page

  @linkedList
  Scenario Outline: User Navigate to LinkedList Page and works on Introduction
    #Given User login with username "Numphysdet94NN" and password "sdet94batchNN"
    Given User clicks "Get started" in linkedlist field
    When User clicks "Introduction" first link in Linked list
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     0     |

Scenario Outline: User Navigate to LinkedList Page and works on Creating Linked list
   # Given User login with username "Numphysdet94NN" and password "sdet94batchNN"
    Given User clicks "Get started" in linkedlist field
    When User clicks "Creating Linked list" second link in Linked list
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     0     |
     
   Scenario Outline: User Navigate to LinkedList Page and works on Types of Linked list
    #Given User login with username "Numphysdet94NN" and password "sdet94batchNN"
    Given User clicks "Get started" in linkedlist field
    When User clicks "Types of Linked list" third link in Linked list
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     0     |
      
   Scenario Outline: User Navigate to LinkedList Page and works on Implement Linked List in Python
    #Given User login with username "Numphysdet94NN" and password "sdet94batchNN"
    Given User clicks "Get started" in linkedlist field
    When User clicks "Implement Linked List in Python" fourth link in Linked list
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     0     |
   
   Scenario Outline: User Navigate to LinkedList Page and works on Traversal
    #Given User login with username "Numphysdet94NN" and password "sdet94batchNN"
    Given User clicks "Get started" in linkedlist field
    When User clicks "Traversal" fifth link in Linked list
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     0     |
      
    Scenario Outline: User Navigate to LinkedList Page and works on Insertion
    #Given User login with username "Numphysdet94NN" and password "sdet94batchNN"
    Given User clicks "Get started" in linkedlist field
    When User clicks "Insertion" sixth link in Linked list
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     0     |
      
     Scenario Outline: User Navigate to LinkedList Page and works on Deletion
    #Given User login with username "Numphysdet94NN" and password "sdet94batchNN"
    Given User clicks "Get started" in linkedlist field
    When User clicks "Deletion" seventh link in Linked list
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Then user navigate to homepage
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     0     |
   