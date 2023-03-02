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
@register
Feature: DS Algo Registration Page

  # Using DataTable to read username and password
  # Data driven using examples in register_08
  @TS_register_01
  Scenario: The user is presented with error message for empty fields below username textbox
    Given User opens register page
    When User clicks "Register" button with all fields empty
    Then It should display an error message "Please fill out this field." below username textbox

  @TS_register_02
  Scenario: The user is presented with error message for empty fields below password textbox
    Given User opens register page
    When User enters "username" with other fields empty and clicks register button
        | username      |
        |Numphysdet94NN |
    Then It should display an error message "Please fill out this field." below password textbox
  
  @TS_register_03
   Scenario: The user is presented with error message for empty fields below confirm_password textbox
    Given User opens register page
    When User enters "username" and "password" with other fields empty and clicks register button
        |username       |  password     |
        |Numphysdet94NN | sdet94batchNN |
    Then It should display an error message "Please fill out this field." below confirm_password textbox
  
  @TS_register_04
   Scenario: The user is presented with error message for invalid username
    Given User opens register page
    When User enters "username" with characters other than letters,digits and @/-/=/+ with "password" and "confirm_passwod" and clicks register button
           |username       |  password     | confirm_password|
           | &**&**&       | sdet94batchNN |  sdet94batchNN  |
    Then It should display an error message "Please enter a valid username"
  
  @TS_register_05
   Scenario: The user is presented with error message for password mismatch
    Given User opens register page
    When User enters "username"  and different passwords in "password" and "confirm_password" fields and clicks register button
           |username        |  password     | confirm_password|
           | Numphysdet94NN | sdet94batchNN |  password       |
    Then It should display an error message "password_mismatch:The two password fields didn't match."
  
  @TS_register_06
  Scenario: The user is presented with error message for password with less than 8 characters
   Given User opens register page
   When User enters "username" and with less than 8 characters "password" and "confirm_password"  and clicks register button
           |username        | password | confirm_password|
           |Numphysdet94NN  | sdet94   |  sdet94         |
  Then It should display an error message "Password should contain atleast 8 characters"
  
  @TS_register_07
  Scenario: The user is presented with error message for password with only numbers
  Given User Opens register page
  When User enters "username" and with only numbers "password" and "confirm_password" and clicks register button
           |username        | password | confirm_password|
           | Numphysdet94NN | 12345678 |  12345678       |
  Then It should display an error message "Password can't be entirely numeric"
  
  @TS_register_08
  Scenario Outline: Getting register into page with username and passwords
    Given User opens register page
    When User clicks register button after entering "<username>" , "<password>" and "<confirm_password>"
    Then It should go to homepage and get message "New account created.You are logged in as Username"
    Examples: 
      | username       | password      | confirm_password  |
      | user94name     |    sdet       | sdet94batch       |
      | Numphysdet94NN | sdet94batchNN | sdet94batchNN     |
      
   @TS_register_09
   Scenario: The user is presented with error message for existing username
     Given User opens register page
     When User enters valid existing "username" with "password" and "confirm_password"
      | username       | password      | confirm_password  |
      | Numphysdet94NN | sdet94batchNN | sdet94batchNN     |
     Then It should display an error message "Username already exists"
