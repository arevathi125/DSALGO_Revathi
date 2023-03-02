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
@homePage
Feature: DSALGO Project
  

  @mainPage
  Scenario: Opening DS Algo portal link
  
    Given The user opens DS Algo portal link
    When user clicks "Get Started" button
    Then user should be redirected to the homepage and see 6 different collections
    Then user click on the "Data Structures" dropdown arrow and sees 6 different collections
    And user clicks any one collection from dropdown
    And user get alert message "you are not logged in"
    Then user clicks on Data structure "get Started" button
    And user get alert message "you are not logged in"
    When user clicks "Sign In" in home page
    Then user is redirected to sign In Page

 
