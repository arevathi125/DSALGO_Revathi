package POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import crossBrowser.DriverFactory;
import io.cucumber.datatable.DataTable;
import utilities.ConfigReader;
import utilities.ElementsUtils;
import utilities.Loggerload;



public class Collections_Pom {

	    public static WebDriver driver = DriverFactory.getdriver();
	    private final static String propertyFilePath = "./src/test/resources/config.properties";
	    private static Properties properties;
        static ElementsUtils eleUtil = new ElementsUtils();
        String DataStructureURL = "https://dsportalapp.herokuapp.com/data-structures-introduction/";
        String tryEditorURL = ConfigReader.tryEditorURL();

	    // ************** Main Page ***************
	    
	  By getstarted = By.xpath("/html/body/div[1]/div/div/a/button");
	  @FindBy(xpath="//*[@id=\'navbarCollapse\']/div[1]/div/a")WebElement dropDown;
      @FindBy (linkText ="Stack")WebElement dropDown_stack;
      @FindBy(xpath="/html/body/div[2]")WebElement alert_Msg;
      @FindBy(linkText ="Sign in")WebElement sign_In;
      @FindBy(xpath="//a[contains(@href,'data-structures-introduction')]")WebElement dataStructureDropDown;
      By registerBut=By.linkText("Register");

       // ************** Log in  Page ***************

       By login_Username=By.name("username"); 
       By login_Password=By.name("password");
       By login_Button=By.xpath("//input[@value='Login']");

       // ************** DataStructure  Page ***************

//        private static Properties properties;
//        ElementsUtils eleUtil = new ElementsUtils();
//        String DataStructureURL = "https://dsportalapp.herokuapp.com/data-structures-introduction/";
//        String tryEditorURL = ConfigReader.tryEditorURL();
        By getTimeComplexity = By.xpath("/html/body/div[2]/ul/a");
        @FindBy(xpath = "//textarea[@tabindex='0']") WebElement editorInput;
        By tryhere=By.xpath("//a[contains(text(),'Try here>>>')]");
        By enterPythonText = By.xpath("//*[@id=\'answer_form\']/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre");
        //By runButton = By.xpath("//button[contains(text(),'Run']");
        By runButton = By.xpath("//*[@id=\"answer_form\"]/button");
        By pythonOutPut = By.id("output");
      
     // ************** Array  Page ***************
        
        @FindBy(xpath = "//a[contains(@href,'array')]")WebElement arrayLink;
        @FindBy(xpath = "//a[contains(text(),'Arrays in Python')]")WebElement arraysInPython;
        @FindBy(xpath = "//a[contains(text(),'Try here')]")WebElement tryHere;
        @FindBy(xpath = "//a[contains(text(),'Arrays Using List')]")WebElement arraysUsingList;
        @FindBy(xpath = "//a[contains(text(),'Basic Operations in Lists')]")WebElement arraysBasicOperationsInList;
        @FindBy(xpath = "//a[contains(text(),'Applications of Array')]")WebElement applicationOfArray;
        
     // ************** Array  Page Practice Questions ***************
      
        @FindBy(xpath = "//a[contains(text(),'Practice Questions')]")WebElement practiceQuestions;
        @FindBy(xpath = "/html/body/div[2]/a") WebElement searchTheArray;
        @FindBy(xpath = "//textarea[@tabindex='0']") WebElement textEditorInput;
        By runButtonPractice = By.xpath("//*[@id=\"answer_form\"]/button");
        @FindBy(xpath = "/html/body/div[3]/a")WebElement maxConsecutiveOnes;
        @FindBy(xpath = "/html/body/div[4]/a")WebElement findNumbersWithEvenNumberOfDigits;
        @FindBy(xpath = "/html/body/div[5]/a") WebElement squaresOfASortedArray;
        
       // @FindBy(xpath = "//a[contains(text(),'Search the array']") WebElement searchTheArray;
       //@FindBy(xpath = "//a[contains(text(),'Max Consecutive Ones']") WebElement maxConsecutiveOnes;
       // @FindBy(xpath = "//a[contains(text(),'Find Numbers with Even Number of Digits']") WebElement findNumbersWithEvenNumberOfDigits;
       //@FindBy(xpath = "//*[@id='answer_form']/div/div/div[6]") WebElement textEditorInput;
       // @FindBy(xpath = "//a[contains(text(),'Squares of a Sorted Array']") WebElement squaresOfASortedArray;
        
        // ************** LinkedList  Page ***************
        
        @FindBy(xpath = "//a[contains(@href,'linked-list')]")WebElement linkedListLink;
        @FindBy(xpath = "//a[contains(text(),'Introduction')]")WebElement introduction;
        @FindBy(xpath = "//a[contains(text(),'Creating Linked LIst')]")WebElement creatingLinkedList;
        @FindBy(xpath = "//a[contains(text(),'Types of Linked List')]")WebElement typesOfLinkedList;
        @FindBy(xpath = "//a[contains(text(),'Implement Linked List in Python')]")WebElement implementLinkedList;
        @FindBy(xpath = "//a[contains(text(),'Traversal')]")WebElement traversal;
        @FindBy(xpath = "//a[contains(text(),'Insertion')]")WebElement insertion;
        @FindBy(xpath = "//a[contains(text(),'Deletion')]")WebElement deletion;
        
        
        // ************** Stack  Page ***************
        
        @FindBy(xpath = "//a[contains(@href,'Stack')]")WebElement stackLink;
        @FindBy(xpath = "//a[contains(text(),'Operations in Stack')]")WebElement operationsInStack;
        @FindBy(xpath = "//a[contains(text(),'Implementation')]")WebElement implementation;
        @FindBy(xpath = "//a[contains(text(),'Applications')]")WebElement applications;
        
     // ************** Queue  Page ***************
        
        @FindBy(xpath = "//a[contains(@href,'Queue')]")WebElement queueLink;
        @FindBy(xpath = "//a[contains(text(),'Implementation of Queue in Python')]")WebElement implementationOfQueueInPython ;
        @FindBy(xpath = "//a[contains(text(),'Implementation using collections.deque')]")WebElement implementationUsingCollectionsDeque;
        @FindBy(xpath = "//a[contains(text(),'Implementation using array')]")WebElement implementationUsingArray;
        @FindBy(xpath = "//a[contains(text(),'Queue Operations')]")WebElement queueOperations;
        
     // ************** Graph  Page ***************
        
       // @FindBy(xpath = "//a[contains(@href,'Graph')]")WebElement graphLink;
        //@FindBy(xpath = "//a[contains(text(),'Graph')]")WebElement graph;
        @FindBy(xpath = "/html/body/div[2]/ul[2]/a")WebElement graph;
        @FindBy(xpath = "//a[contains(text(),'Graph Representations')]")WebElement graphRepresentations;
        
     // ************** Tree  Page ***************
        
        @FindBy(xpath = "//a[contains(@href,'Tree')]")WebElement treeLink;
        @FindBy(xpath = "//a[contains(text(),'Overview of Trees')]")WebElement overviewOfTrees ;
        @FindBy(xpath = "//a[contains(text(),'Terminologies')]")WebElement terminologies;
        @FindBy(xpath = "//a[contains(text(),'Types of Trees')]")WebElement typesOfTrees;
        @FindBy(xpath = "//a[contains(text(),'Tree Traversals')]")WebElement treeTraversals;
        @FindBy(xpath = "//a[contains(text(),'Traversals-Illustration')]")WebElement traversalsIllustration;
        @FindBy(xpath = "//a[contains(text(),'Binary Trees')]")WebElement binaryTrees;
        @FindBy(xpath = "//a[contains(text(),'Types of Binary Trees')]")WebElement typesOfBinaryTrees;
        @FindBy(xpath = "//a[contains(text(),'Implementation in Python')]")WebElement implementationInPython;
        @FindBy(xpath = "//a[contains(text(),'Binary Tree Traversals')]")WebElement binaryTreeTraversals;
        @FindBy(xpath = "//a[contains(text(),'Implementation of Binary Trees')]")WebElement implementationOfBinaryTrees;
        @FindBy(xpath = "//a[contains(text(),'Applications of Binary trees')]")WebElement applicationsOfBinaryTrees;
        @FindBy(xpath = "//a[contains(text(),'Binary Search Trees')]")WebElement binarySearchTrees;
        @FindBy(xpath = "//a[contains(text(),'Implementation Of BST')]")WebElement implementationOfBST;
        
       // ##########################################################
        
        public Collections_Pom()
        {
        	PageFactory.initElements(driver, this);
        }
        
       // &&&&&&&&&&&&&&&&&&&&& Main Page &&&&&&&&&&&&&&&&&&& 
        
           public void getPage() throws IOException
           {
        	   ConfigReader.loadConfig();
        	   String URL =ConfigReader.getApplicationUrl();
        	   driver.get(URL);
           }
           
           public void clickOnGetStarted()
           {
        	   driver.findElement(getstarted).click();
           }
           
           public void clickOnDropDown()
           {
        	   dropDown.click();
           }
           
           public void clickOnDropDownSelect()
           {
        	   dropDown_stack.click();
           }
        
           public void signIn()
           {
        	   sign_In.click();
           }
           
           public void clickOnRegister()
           {
        	   driver.findElement(registerBut).click();
           }
           
           public String getPageTitle()
           {
        	  String title = driver.getTitle();
        	  return title;
           }
           
           public String errorMesage()
           {
        	 String alertMessage = alert_Msg.getText();
        	  return alertMessage;
           } 
           public void clickOnDataStructureGetStarted()
           {
           dataStructureDropDown.click();
           }
           
       // &&&&&&&&&&&&&&&&&&&&& Log in Page &&&&&&&&&&&&&&&&&&& 
        
           public void loginPage() throws IOException
           {
        	   ConfigReader.loadConfig();
        	   String URL = ConfigReader.getLoginPage();
        	   driver.get(URL);
           }
           
           public void loginWithCredentials(String username,String password)
           {
        	   driver.findElement(login_Username).sendKeys(username);
        	   driver.findElement(login_Password).sendKeys(password);
        	   driver.findElement(login_Button).click();
           }
           
           public String login_Page()
           {
        	   String title = driver.getTitle();
        	   return title;
           }
           
       // &&&&&&&&&&&&&&&&&&&&& Data Structure Page &&&&&&&&&&&&&&&&&&& 
        
           public void dataStructurePage()
           {
        	   driver.get(DataStructureURL);
           }
           
           public void loginWithUernamePwd(String string, String string2) throws InterruptedException, IOException {
       	    FileInputStream stream = new FileInputStream(propertyFilePath);
       	    properties = new Properties();    
       	      properties.load(stream);
       	    Constants.user_name=properties.getProperty("USERNAME");
       	    Constants.pass_word=properties.getProperty("PASSWORD");
       	    driver.findElement(login_Username).sendKeys(Constants.user_name);  
       	    driver.findElement(login_Password).sendKeys(Constants.pass_word);
       	    driver.findElement(login_Button).click();
       	  }
           
           public void tryHere()
           {
        	   JavascriptExecutor executor = (JavascriptExecutor) driver;
        	   executor.executeScript("window.scrollBy(0,750)", "");
        	   driver.findElement(getTimeComplexity).click();
        	   driver.findElement(tryhere).click();
           }
           
           public void enterPythonCode(int sheetNumber,int rownumber) throws InvalidFormatException, IOException 
           {
        	   String code = eleUtil.getCodefromExcel(sheetNumber, rownumber);
        	   eleUtil.enterCode(code, editorInput);
        	   driver.findElement(runButton).click();
           }
           
//           public String getExpectedResult(Integer sheetNumber,Integer rownumber) throws InvalidFormatException, IOException
//           {
//        	   String expectedResult = eleUtil.getResultfromExcel(sheetNumber, rownumber);
//        	   return expectedResult;
//           }
           
           public void backToHome() throws IOException
           {
        	   ConfigReader.loadConfig();
        	   String URL = ConfigReader.getHomePage();
        	   driver.get(URL);
           }
           
       // &&&&&&&&&&&&&&&&&&&&& Array Page &&&&&&&&&&&&&&&&&&& 
        
           public void clickArray() throws IOException
           {
        	   ConfigReader.loadConfig();
        	   String URL = ConfigReader.getArrayUrl();
        	   driver.get(URL);
           }
           
           public void clickArraysInPython()
           {
        	   arraysInPython.click();
           }
           
           public void clickArraysUsingList()
           {
        	   arraysUsingList.click(); 
           }
           
           public void clickBasicOperationsInLists()
           {
        	   arraysBasicOperationsInList.click();
           }
           
           public void clickApplicationsOfArray()
           {
        	   applicationOfArray.click();
           }
           
           public void clickTryHere()
           {
        	   tryHere.click(); 
           }
           
           public void enterPythonCode(String sheetName, int rownumber) throws InvalidFormatException, IOException 
       	   {		
       		String code=eleUtil.getCodefromExcel(sheetName, rownumber);
       		eleUtil.enterCode(code,editorInput);
       		driver.findElement(runButton).click();		
       	     }
           
        // ************** Array  Page Practice Questions ***************
          
           public void clickPracticeQuestions() throws IOException
           {
        	   practiceQuestions.click();
           }
           
           public void clicksearchTheArray()
           {
        	   searchTheArray.click();
           }
           
           public void clearCodeInTextEditor()
           {
        	   textEditorInput.sendKeys(Keys.CONTROL,"a");
        	   textEditorInput.sendKeys(Keys.DELETE);
           }
           
           public void pythonCode(String PythonCode) throws IOException {
         	    Constants.python_Code=properties.getProperty("PythonCode");
         	    textEditorInput.sendKeys(properties.getProperty("PythonCode"));
        	    driver.findElement(runButtonPractice).click();
              }
           
           public void pythonCode1(String PythonCode) throws IOException {
        	    Constants.python_Code1=properties.getProperty("PythonCode1");
        	    textEditorInput.sendKeys(properties.getProperty("PythonCode1"));
       	        driver.findElement(runButtonPractice).click();
             }
           public void pythoncode(String pythoncode) throws InvalidFormatException, IOException {
        	 textEditorInput.sendKeys(pythoncode);
       		driver.findElement(runButtonPractice).click();
       	}
           
           public static String getErrorText() throws InterruptedException
           {
        	   Thread.sleep(2000);
        	   String errorMsg = driver.switchTo().alert().getText();
        	   Loggerload.info("Error Message Is : "+errorMsg);
        	   driver.switchTo().alert().accept();
        	   return errorMsg;
           }
           
           public void MaxconsecutiveOnes()
           {
        	   maxConsecutiveOnes.click();
           }
           
           public void clickFindNumbersWithEvenNumberOfDigits()
           {
        	   findNumbersWithEvenNumberOfDigits.click();
           }
            
           public void clickSquaresOfASortedArray()
           {
        	   squaresOfASortedArray.click();
           }
          
//       	   public String getExpectedResult(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException 
//       	   {
//       		 String expectedResult = eleUtil.getResultfromExcel(sheetName, rowNumber);
//       		 return expectedResult;
//       	    }
           
//           public void backToArrayPracticePage() throws IOException
//           {
//        	   ConfigReader.loadConfig();
//        	   String URL = ConfigReader.getArrayPracticeUrl();
//        	   driver.get(URL);
//           }
         
           
           
         // &&&&&&&&&&&&&&&&&&&&& Linked List Page &&&&&&&&&&&&&&&&&&& 
        
       	    public void clickLinkedList() throws IOException
       	    {
       	     ConfigReader.loadConfig();
      	     String URL = ConfigReader.getLinkedListUrl();
      	     driver.get(URL);
       	    }
       	    
       	    public void clickIntroduction()
       	    {
       	    	introduction.click();
       	    }
       	    
       	    public void clickCreatingLinkedList()
       	    {
       	    	creatingLinkedList.click();
       	    }
       	    
       	    public void clickTypesOfLinkedList()
       	    {
       	    	typesOfLinkedList.click();
       	    }
       	    
       	    public void clickImplementLinkedListInPython() 
       	    {
       	    	implementLinkedList.click();
       	    }
       	    
       	    public void clickTraversal()
       	    {
       	    	traversal.click();
       	    }
       	    
       	    public void clickInsertion()
       	    {
       	    	insertion.click();
       	    }
       	    
       	    public void clickDeletion()
       	    {
       	    	deletion.click();
       	    }
       	    
       // &&&&&&&&&&&&&&&&&&&&& Stack Page &&&&&&&&&&&&&&&&&&& 
        
       	    public void clickStack() throws IOException
       	    {
       	    	ConfigReader.loadConfig();
         	     String URL = ConfigReader.getStackUrl();
         	     driver.get(URL);
       	    }
       	    
       	    public void clickOperationsInStack()
       	    {
       	    	operationsInStack.click();
       	    }
       	    
       	    public void clickImplementation()
       	    {
       	    	implementation.click();
       	    }
       	    
       	    public void clickApplications()
       	    {
       	    	applications.click();
       	    }
       	    
       // &&&&&&&&&&&&&&&&&&&&& Queue Page &&&&&&&&&&&&&&&&&&& 
        
       	 public void clickQueue() throws IOException
    	    {
    	     ConfigReader.loadConfig();
      	     String URL = ConfigReader.getQueueUrl();
      	     driver.get(URL);
    	    }
    	    
    	    public void clickImplementationOfQueueInPython()
    	    {
    	    	implementationOfQueueInPython.click();
    	    }
    	    
    	    public void clickImplementationUsingCollectionsDeque()
    	    {
    	    	implementationUsingCollectionsDeque.click();
    	    }
    	    
    	    public void clickImplementationUsingArray()
    	    {
    	    	implementationUsingArray.click();
    	    }
    	    
    	    public void clickQueueOperations()
    	    {
    	    	queueOperations.click();
    	    }
    	    
    	    
       // &&&&&&&&&&&&&&&&&&&&& Graph Page &&&&&&&&&&&&&&&&&&& 
        
    	    public void clickGraphPage() throws IOException
    	    {
    	     ConfigReader.loadConfig();
      	     String URL = ConfigReader.getGraphUrl();
      	     driver.get(URL);
    	    }

    	    public void clickGraph()
    	    {
    	    	graph.click();
    	    }
    	    
    	    public void clickGraphRepresentations()
    	    {
    	    	graphRepresentations.click();
    	    }
    	    
       // &&&&&&&&&&&&&&&&&&&&& Tree Page &&&&&&&&&&&&&&&&&&& 
        
    	    public void clickTree() throws IOException
    	    {
    	     ConfigReader.loadConfig();
      	     String URL = ConfigReader.getTreeUrl();
      	     driver.get(URL);
    	    }
    	    
    	    public void clickOverviewOfTrees()
    	    {
    	    	overviewOfTrees.click();
    	    }
    	    
    	    public void clickTerminologies()
    	    {
    	    	terminologies.click();
    	    }
    	    
    	    public void clickTypesOfTrees()
    	    {
    	    	typesOfTrees.click();
    	    }
    	    
    	    public void clickTreeTraversals()
    	    {
    	    	treeTraversals.click();
    	    }
    	    
    	    public void clickTraversalsIllustration()
    	    {
    	    	traversalsIllustration.click();
    	    }
    	    
    	    public void clickBinaryTrees()
    	    {
    	    	binaryTrees.click();
    	    }
    	    
    	    public void clickTypesOfBinaryTrees()
    	    {
    	    	typesOfBinaryTrees.click();
    	    }
    	    
    	    public void clickImplementationInPython()
    	    {
    	    	implementationInPython.click();
    	    }
    	    public void clickBinaryTreeTraversals()
    	    {
    	    	binaryTreeTraversals.click();
    	    }
    	    
    	    public void clickImplementationOfBinaryTrees()
    	    {
    	    	implementationOfBinaryTrees.click();
    	    }
    	    
    	    public void clickApplicationsOfBinaryTrees()
    	    {
    	    	applicationsOfBinaryTrees.click();
    	    }
    	    
    	    public void clickBinarySearchTrees()
    	    {
    	    	binarySearchTrees.click();
    	    }
    	    public void clickImplementationOfBST()
    	    {
    	    	implementationOfBST.click();
    	    }
}
