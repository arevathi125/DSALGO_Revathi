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
@signIn
Feature: DS Algo Sign In Page

  @signIn
  Scenario Outline: User navigate to signIn page
    Given User launches login page
    When User login username and password from given "<SheetName>" and <rownumber>

    Examples: 
      | SheetName  | rownumber|
      | Sheet1     |     0    | 
      | Sheet1     |     1    | 
      | Sheet1     |     2    | 
      | Sheet1     |     3    |
      | Sheet1     |     4    | 
      | Sheet1     |     5    |
      | Sheet1     |     6    | 
      | Sheet1     |     7    |
