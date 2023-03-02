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
@graph
Feature: DS Algo Graph

  @graph
  Scenario Outline: User Navigate to Graph Page and works on Graph
    Given user login with username "Numphysdet94NN" and password "sdet94batchNN" given through config
    Given User clicks "Get started" in Graph field
    When User clicks "Graph" first link in Graph
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     0     |

    Scenario Outline: User Navigate to Graph Page and works on Graph Representations
    Given user login with username "Numphysdet94NN" and password "sdet94batchNN" given through config
    Given User clicks "Get started" in Graph field
    When User clicks "Graph Representations" second link in Graph
    Then User clicks "Try here"
    Then User enters code in tryEditor from "<sheetName>" and <rownumber> then click run,output is printed
    Then user navigate to homepage
    Examples: 
      | sheetName  | rownumber |
      | pythonCode |     1     |
      