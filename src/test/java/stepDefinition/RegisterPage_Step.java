package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import POM.Register_Pom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Loggerload;

public class RegisterPage_Step {
      
	Register_Pom register = new Register_Pom();
	
	@Given("User opens register page")
	public void user_opens_register_page() throws IOException {
	    register.getRegisterPage();
	    Loggerload.info("User get into the Register Page");
	}

	@When("User clicks {string} button with all fields empty")
	public void user_clicks_button_with_all_fields_empty(String string) throws IOException {
	    register.clickRegisterLink();
	    register.clickSubmitRegister();
	    register.screenShot();
	}

	@Then("It should display an error message {string} below username textbox")
	public void it_should_display_an_error_message_below_username_textbox(String string) {
	   String errorMessage =  register.getEmptyFieldErrorMsgUser();
	   Loggerload.info("Error Message Is : "+errorMessage);
	}

	@When("User enters {string} with other fields empty and clicks register button")
	public void user_enters_with_other_fields_empty_and_clicks_register_button(String string, io.cucumber.datatable.DataTable dataTable) throws IOException {
	    register.clickRegisterLink();
	    Loggerload.info("User enters with username and other fields empty");
	    register.enetrUserName(dataTable);
	    register.clickSubmitRegister();
	    //register.screenShot();
	}

	@Then("It should display an error message {string} below password textbox")
	public void it_should_display_an_error_message_below_password_textbox(String string) {
		String errorMessage =  register.getEmptyFieldErrorMsgPawd();
		   Loggerload.info("Error Message Is : "+errorMessage);
	}

	@When("User enters {string} and {string} with other fields empty and clicks register button")
	public void user_enters_and_with_other_fields_empty_and_clicks_register_button(String string, String string2, io.cucumber.datatable.DataTable dataTable) throws IOException {
	    register.clickRegisterLink();
	    Loggerload.info("User enters username and password with other fields empty");
	    register.enetrUserName(dataTable);
	    register.enterPassword(dataTable);
	    register.clickSubmitRegister();
	    //register.screenShot();
	}

	@Then("It should display an error message {string} below confirm_password textbox")
	public void it_should_display_an_error_message_below_confirm_password_textbox(String string) {
		String errorMessage =  register.getEmptyFieldErrorMsgconfirmPawd();
		   Loggerload.info("Error Message Is : "+errorMessage);
	}

	@When("User enters {string} with characters other than letters,digits and @\\/-\\/=\\/+ with {string} and {string} and clicks register button")
	public void user_enters_with_characters_other_than_letters_digits_and_with_and_and_clicks_register_button(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
	    register.clickRegisterLink();
	    Loggerload.info("User enters \"username\" with characters other than letters,digits and @/-/=/+ with \"password\" and \"confirm_passwod\"");
	    register.enetrUserName(dataTable);
	    register.enterPassword(dataTable);
	    register.enterConfirmPassword(dataTable);
	    register.clickSubmitRegister();
	}

	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String string) {
	    register.getErrormsg();
	}

	@When("User enters {string}  and different passwords in {string} and {string} fields and clicks register button")
	public void user_enters_and_different_passwords_in_and_fields_and_clicks_register_button(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
		 register.clickRegisterLink();
		    Loggerload.info("User enters \"username\"  and different passwords in \"password\" and \"confirm_password\"");
		    register.enetrUserName(dataTable);
		    register.enterPassword(dataTable);
		    register.enterConfirmPassword(dataTable);
		    register.clickSubmitRegister();
	}

	@When("User enters {string} and with less than {int} characters {string} and {string}  and clicks register button")
	public void user_enters_and_with_less_than_characters_and_and_clicks_register_button(String string, Integer int1, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
		register.clickRegisterLink();
	    Loggerload.info("User enters \"username\" and \"password\" ,\"confirm_password with less than 8 characters");
	    register.enetrUserName(dataTable);
	    register.enterPassword(dataTable);
	    register.enterConfirmPassword(dataTable);
	    register.clickSubmitRegister();
	}

	@Given("User Opens register page")
	public void User_opens_register_page() throws IOException {
		register.getRegisterPage();
	    Loggerload.info("User get into the Register Page");
	}

	@When("User enters {string} and with only numbers {string} and {string} and clicks register button")
	public void user_enters_and_with_only_numbers_and_and_clicks_register_button(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
		register.clickRegisterLink();
	    Loggerload.info("User enters \"username\" and \"password\",\"confirm_password\" with only numbers");
	    register.enetrUserName(dataTable);
	    register.enterPassword(dataTable);
	    register.enterConfirmPassword(dataTable);
	    register.clickSubmitRegister();
	}


//	@When("User clicks {string} button with all fields empty")
//	public void user_clicks_button_with_all_fields_empty(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@Then("It should display an error message {string} below username textbox")
//	public void it_should_display_an_error_message_below_username_textbox(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	
//	@When("User clicks register button after entering {string} ,{string} and {string}")
//	public void user_clicks_register_button_after_entering_and(String username, String password, String confirm_password)throws InterruptedException {
//	    register.register_link(username, password, confirm_password);
//	    Loggerload.info("user   successfully   Registered");
//	}
  
	@When("User clicks register button after entering {string} , {string} and {string}")
	public void user_clicks_register_button_after_entering_and(String username, String password, String confirm_password) {
	   register.register_link(username, password, confirm_password);
	   Loggerload.info("user successfully Registered");
	}

	@Then("It should go to homepage and get message {string}")
	public void it_should_go_to_homepage_and_get_message(String string) {
	    Loggerload.info("User redirected to Login page");
	    String Title = register.registerPage();
	    Loggerload.info("Title of Current Page is : "+Title);
	    assertEquals(Title,"Registration" ,"Title did not match");
	}
   
	@When("User enters valid existing {string} with {string} and {string}")
	public void user_enters_valid_existing_with_and(String username, String password, String confirm_password, io.cucumber.datatable.DataTable dataTable) {
		register.clickRegisterLink();
	    Loggerload.info("User enters valid existing username,password and confirm_password");
	    register.enetrUserName(dataTable);
	    register.enterPassword(dataTable);
	    register.enterConfirmPassword(dataTable);
	    register.clickSubmitRegister();
	}
//	@When("User enters valid existing {string},{string} and {string}")
//	public void user_enters_valid_existing_and(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
//	    register.clickRegisterLink();
//	    Loggerload.info("User enters valid existing username,password and confirm_password");
//	    register.enetrUserName(dataTable);
//	    register.enterPassword(dataTable);
//	    register.enterConfirmPassword(dataTable);
//	    register.clickSubmitRegister();
//	}
}
