package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import POM.Collections_Pom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.ElementsUtils;
import utilities.ExcelReader;
import utilities.Loggerload;

public class Collections_Step {

	  WebDriver driver;
	  Collections_Pom collection = new Collections_Pom();
	  String Excelpath = ConfigReader.getexcelfilepath();
	  static String expectedMesg;
	  
	   //##############  Main Page #############
	  
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() throws IOException {
	   Loggerload.info("Opening DS Algo Portal link");
	   collection.getPage();
	}

	@When("user clicks {string} button")
	public void user_clicks_button(String string) {
	    collection.clickOnGetStarted();
	}

	@Then("user should be redirected to the homepage and see {int} different collections")
	public void user_should_be_redirected_to_the_homepage_and_see_different_collections(Integer int1) {
	    String Page_Title = collection.getPageTitle();
	    Loggerload.info("Page Title is : +Page_Title");
	    assertEquals(Page_Title,"NumpyNinja","Title do not match");
	}

	@Then("user click on the {string} dropdown arrow and sees {int} different collections")
	public void user_click_on_the_dropdown_arrow_and_sees_different_collections(String string, Integer int1) {
	    collection.clickOnDropDown();
	}

	@Then("user clicks any one collection from dropdown")
	public void user_clicks_any_one_collection_from_dropdown() {
	    collection.clickOnDropDownSelect();
	}

	@Then("user get alert message {string}")
	public void user_get_alert_message(String string) {
	    try
	    {
	    	String alertMessage = collection.errorMesage();
	    	Loggerload.info(alertMessage);
	    }
	    catch(NoSuchElementException e) 
	    {
	    	
	    }
	}

	@Then("user clicks on Data structure {string} button")
	public void user_clicks_on_data_structure_button(String string) {
	    try {
			collection.clickOnDataStructureGetStarted();
			Loggerload.info("User clicks on Data structure get started button");
		} catch (NoSuchElementException e) {
			
		}
	}

	@When("user clicks {string} in home page")
	public void user_clicks_in_home_page(String string) {
	    try {
			collection.signIn();
		} catch (NoSuchElementException e) {
			
		}
	}

	@Then("user is redirected to sign In Page")
	public void user_is_redirected_to_sign_in_page() {
		String Page_Title = collection.getPageTitle();
	    Loggerload.info("Page Title is : +Page_Title");
	    assertEquals(Page_Title,"Login","Title do not match");
	}
	
	//##############  Login Page #############
	
	@Given("User launches login page")
	public void user_launches_login_page() throws IOException {
	   Loggerload.info("User launches login page");
	   collection.loginPage();
	}

	@When("User login username and password from given {string} and {int}")
	public void user_login_username_and_password_from_given_and(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException {
	    ExcelReader reader = new ExcelReader();
	    Loggerload.info("User enter login credentials");
	    //List<Map<String,String>> testData = reader.getData("C:\\Users\\areva\\My Workspace\\My_Project\\src\\test\\resources\\excelData\\LoginDsAlgo.xlsx",0);
	    List<Map<String,String>> testData = reader.getData(Excelpath,0);
	    String User_name=testData.get(rowNumber).get("username");  // heading 
		String Pass_word=testData.get(rowNumber).get("password");  // heading 
		collection.loginWithCredentials(User_name, Pass_word);
		Loggerload.info("User redirected to login page ");
		String Title = collection.login_Page();
		Loggerload.info("Title of current page is : " + Title);
	}
	
	//##############  Data structure Page #############
	     
	    // Common for array ,linked list,queue,graph 
	      
	@Given("user login with username {string} and password {string} given through config")
	//public void user_login_with_username_and_password_given_through_config(String username, String password) throws IOException {
		public void user_login_with_username_and_password_given_through_config(String string, String string2) throws IOException, InterruptedException {
	     collection.loginPage();
	     //collection.loginWithCredentials(username, password);
	     collection.loginWithUernamePwd(string, string2);
	}

	@Given("user launch datastructure page")
	public void user_launch_datastructure_page() {
	    collection.dataStructurePage();
	}

	@When("click on timecomplexity ,tryHere and tryEditor assessment page is open")
	public void click_on_timecomplexity_try_here_and_try_editor_assessment_page_is_open() {
	    collection.tryHere();
	}

	@Then("user enters code from {int} and {int} then click run , code is printed")
	public void user_enters_code_from_and_then_click_run_code_is_printed(Integer sheetNumber, Integer rownumber) throws InvalidFormatException, IOException {
	     collection.enterPythonCode(sheetNumber, rownumber);
	}

	@Then("user navigate to homepage")
	public void user_navigate_to_homepage() throws IOException {
	    collection.backToHome();
	}
	      
	//##############  Array Page #############
	
    
	@Given("User clicks {string} in array")
	public void user_clicks_in_array(String string) throws IOException {
	    collection.clickArray();
	}

	@When("User clicks {string} first link in the arrray list")
	public void user_clicks_first_link_in_the_arrray_list(String string) {
	    collection.clickArraysInPython();
	}
	
	@When("User clicks {string} second link in the arrray list")
	public void user_clicks_second_link_in_the_arrray_list(String string) {
	    collection.clickArraysUsingList();
	}

	@When("User clicks {string} third link in the arrray list")
	public void user_clicks_third_link_in_the_arrray_list(String string) {
	    collection.clickBasicOperationsInLists();
	}

	@When("User clicks {string} fourth link in the arrray list")
	public void user_clicks_fourth_link_in_the_arrray_list(String string) {
	   collection.clickApplicationsOfArray();
	}

	@Then("User clicks {string}")
	public void user_clicks(String string) {
	    collection.clickTryHere();
	}

	@Then("User enters code in tryEditor from {string} and {int} then click run,output is printed")
	public void user_enters_code_in_try_editor_from_and_then_click_run_output_is_printed(String sheetName, Integer rownumber) throws InvalidFormatException, IOException {
	    collection.enterPythonCode(sheetName, rownumber);
	}
  
	//##############  Array Practice Page #############
	
	@When("User is in Array Practice homepage")
	public void user_is_in_array_practice_homepage() throws IOException {
		collection.clickArraysInPython();
		collection.clickPracticeQuestions();
	}

	@When("User clicks {string} first link in the Array Practice list")
	public void user_clicks_first_link_in_the_array_practice_list(String string) {
		collection.clicksearchTheArray();
	}

	@When("user clears the text and enter python code")
	public void user_clears_the_text_and_enter_python_code() {
	   collection.clearCodeInTextEditor();
	}
	
	@Then("user enters Python Code {string} from config")
	public void user_enters_python_code_from_config(String string) throws IOException, InterruptedException {
		collection.pythonCode(string );
	}
	
	@Then("user enters Python Code1 {string} from config")
	public void user_enters_python_code1_from_config(String string) throws IOException, InterruptedException {
		collection.pythonCode1(string );
	}
	@When("User clicks {string} second link in the Array Practice list")
	public void user_clicks_second_link_in_the_array_practice_list(String string) {
	   collection.MaxconsecutiveOnes();
	}

	@Then("user gets the error message")
	public void user_gets_the_error_message() throws InterruptedException {
	    try{
			Loggerload.info("User gets the error message in an Alert  ");
			String fetchError = collection.getErrorText();
			String ExpectedError="SyntaxError: bad input on line 1";
			Loggerload.info("Displayed Error Message  is "+fetchError);
			assertEquals(fetchError,ExpectedError,"Invalid Syntax error message");
			}
			catch(NoSuchElementException e){			   
			   }
	}	

    @When("User clicks {string} third link in the Array Practice list")
     public void user_clicks_third_link_in_the_array_practice_list(String string) {
    	collection.clickFindNumbersWithEvenNumberOfDigits();
      }

    @Then("user enters python code")
     public void user_enters_python_code(io.cucumber.datatable.DataTable dataTable) throws IOException, InvalidFormatException {
              List<List<String>> data = dataTable.cells();
              collection.pythoncode(data.get(0).get(0));
     }
    

    @When("User clicks {string} fourth link in the Array Practice list")
    public void user_clicks_fourth_link_in_the_array_practice_list(String string) {
           collection.clickSquaresOfASortedArray();
    }
	
	//##############  Linked List Page #############
	    
	@Given("User clicks {string} in linkedlist field")
	public void user_clicks_in_linkedlist_field(String string) throws IOException {
	     collection.clickLinkedList();
	}

	@When("User clicks {string} first link in Linked list")
	public void user_clicks_first_link_in_linked_list(String string) {
	    collection.clickIntroduction();
	}

	@When("User clicks {string} second link in Linked list")
	public void user_clicks_second_link_in_linked_list(String string) {
	    collection.clickCreatingLinkedList();
	}

	@When("User clicks {string} third link in Linked list")
	public void user_clicks_third_link_in_linked_list(String string) {
	    collection.clickTypesOfLinkedList();
	}

	@When("User clicks {string} fourth link in Linked list")
	public void user_clicks_fourth_link_in_linked_list(String string) {
	    collection.clickImplementLinkedListInPython();
	}

	@When("User clicks {string} fifth link in Linked list")
	public void user_clicks_fifth_link_in_linked_list(String string) {
	    collection.clickTraversal();
	}

	@When("User clicks {string} sixth link in Linked list")
	public void user_clicks_sixth_link_in_linked_list(String string) {
	    collection.clickInsertion();
	}
	
	@When("User clicks {string} seventh link in Linked list")
	public void user_clicks_seventh_link_in_linked_list(String string) {
	    collection.clickDeletion();
	}
	
	
	//##############  Stack Page #############
	
	@Given("User clicks {string} in stack field")
	public void user_clicks_in_stack_field(String string) throws IOException {
	     collection.clickStack();
	}
	
	@When("User clicks {string} first link in stack")
	public void user_clicks_first_link_in_stack(String string) {
	    collection.clickOperationsInStack();
	}

	@When("User clicks {string} second link in stack")
	public void user_clicks_second_link_in_stack(String string) {
	    collection.clickImplementation();
	}

	@When("User clicks {string} third link in stack")
	public void user_clicks_third_link_in_stack(String string) {
	    collection.clickApplications();
	}

	//##############  Queue Page #############
	
	@Given("User clicks {string} in Queue field")
	public void user_clicks_in_queue_field(String string) throws IOException {
	    collection.clickQueue();
	}
    
	@When("User clicks {string} first link in Queue")
	public void user_clicks_first_link_in_queue(String string) {
	    collection.clickImplementationOfQueueInPython();
	}

	@When("User clicks {string} second link in Queue")
	public void user_clicks_second_link_in_queue(String string) {
	    collection.clickImplementationUsingCollectionsDeque();
	}

	@When("User clicks {string} third link in Queue")
	public void user_clicks_third_link_in_queue(String string) {
	    collection.clickImplementationUsingArray();
	}
	
	@When("User clicks {string} fourth link in Queue")
	public void user_clicks_fourth_link_in_queue(String string) {
	    collection.clickQueueOperations();
	}
	//##############  Tree Page #############
	
	@Given("User clicks {string} in Tree field")
	public void user_clicks_in_tree_field(String string) throws IOException {
	    collection.clickTree();
	}

	@When("User clicks {string} first link in tree")
	public void user_clicks_first_link_in_tree(String string) {
	    collection.clickOverviewOfTrees();
	}

	@When("User clicks {string} second link in tree")
	public void user_clicks_second_link_in_tree(String string) {
	    collection.clickTerminologies();
	}

	@When("User clicks {string} third link in tree")
	public void user_clicks_third_link_in_tree(String string) {
	    collection.clickTypesOfTrees();
	}

	@When("User clicks {string} fourth link in tree")
	public void user_clicks_fourth_link_in_tree(String string) {
	    collection.clickTreeTraversals();
	}

	@When("User clicks {string} fifth link in tree")
	public void user_clicks_fifth_link_in_tree(String string) {
	    collection.clickTraversalsIllustration();
	}

	@When("User clicks {string} sixth link in tree")
	public void user_clicks_sixth_link_in_tree(String string) {
	    collection.clickBinaryTrees();
	}

	@When("User clicks {string} seventh link in tree")
	public void user_clicks_seventh_link_in_tree(String string) {
	    collection.clickTypesOfBinaryTrees();
	}

	@When("User clicks {string} eighth link in tree")
	public void user_clicks_eighth_link_in_tree(String string) {
	    collection.clickImplementationInPython();
	}

	@When("User clicks {string} ninth link in tree")
	public void user_clicks_ninth_link_in_tree(String string) {
	    collection.clickBinaryTreeTraversals();
	}

	@When("User clicks {string} tenth link in tree")
	public void user_clicks_tenth_link_in_tree(String string) {
	    collection.clickImplementationOfBinaryTrees();
	}

	@When("User clicks {string} eleventh link in tree")
	public void user_clicks_eleventh_link_in_tree(String string) {
		collection.clickApplicationsOfBinaryTrees();
	}

	@When("User clicks {string} twelth link in tree")
	public void user_clicks_twelth_link_in_tree(String string) {
	    collection.clickBinarySearchTrees();
	}

	@When("User clicks {string} thirteenth link in tree")
	public void user_clicks_thirteenth_link_in_tree(String string) {
	    collection.clickImplementationOfBST();
	}

	//##############  Graph Page #############
	
	@Given("User clicks {string} in Graph field")
	public void user_clicks_in_graph_field(String string) throws IOException {
	   collection.clickGraphPage();
	}

	@When("User clicks {string} first link in Graph")
	public void user_clicks_first_link_in_graph(String string) {
		 collection.clickGraph();
	}

	@When("User clicks {string} second link in Graph")
	public void user_clicks_second_link_in_graph(String string) {
	    collection.clickGraphRepresentations();
	}
}
