package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;     //JUNIT
import io.cucumber.testng.CucumberOptions;     //TESTNG
import io.cucumber.testng.AbstractTestNGCucumberTests;    


/*DONE DATA DRIVEN USING EXAMPLES SCENARIO OUTLINE,  EXCEL FILE, DATATABLE ,CONFIG PROPERTIES
 *DONE READING DATA FROM EXCEL FILE USING SHEET NUMBER ,SHEET NAME   
 *DONE READING USERNAME AND PASSWORD FROM CONFIG.PROPERTIES FILE
 *DONE READING USERNAME AND PASSWORD WITH HARDCODED VALUES IN FEATURE FILE 
 *DONE NEGATIVE TESTING   
 *DONE CROSS BROWSER TESTING 
 *DONE AUTOMATION USING PAGE OBJECT MODEL
 *CREATED LOGS USING LOG4J
 *DONE EXCEPTION HANDLING 
 *USED CONFIG.PROPERTIES FILE,CONFIG READER, EXCEL READER, CONSTANTS, LOG4J, HOOKS,CROSS BROWSER
 *GENERATED EXTENT PDF REPORT , EXTENT SPARK HTML REPORT AND CUCUMBER HTML REPORT   
 *RAN THE CODE IN JUNIT AND TESTNG	      */
    
    //@RunWith(Cucumber.class)             // JUNIT & TestNG
	@CucumberOptions(
			//features = "src/test/resources/features/01_mainPage.feature",
			//features = "src/test/resources/features/02_registerPage.feature",
			//features ="src/test/resources/features/03_signIn.feature",
			//features = "src/test/resources/features/04_dataStructure.feature",
			//features = "src/test/resources/features/05_array.feature",
			//features = "src/test/resources/features/06_arrayPractice.feature",
			//features = "src/test/resources/features/07_linkedList.feature",
			//features = "src/test/resources/features/08_stack.feature",
			//features = "src/test/resources/features/09_queue.feature",
			//features = "src/test/resources/features/10_tree.feature",
			//features = "src/test/resources/features/11_graph.feature",
		   //tags=  "@homepage,@signIn,@dataStructure,@array ,@graph",
			features = "src/test/resources/features/",
			glue =  { "stepDefinition", "hooks" },
			plugin = { "pretty",
             "html:target/cucumber-reports/dsalgo.html",
             "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"	 },
			dryRun=false,
			monochrome = true			 
	)
    
	//allure serve "C:\Users\areva\My Workspace\My_Project\allure-results"
	public class testRunner extends AbstractTestNGCucumberTests{

		}
	
//public class testRunner extends AbstractTestNGCucumberTests{
//      @Override
//      @DataProvider(parallel=false)
//      public Object[][] scenarios()
//      {
//    	  return super.scenarios();
//      }
//}
