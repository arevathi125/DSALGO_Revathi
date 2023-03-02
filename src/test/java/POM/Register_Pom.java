package POM;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crossBrowser.DriverFactory;
import io.cucumber.datatable.DataTable;
import utilities.ConfigReader;
import utilities.Loggerload;

public class Register_Pom {
	
    public static WebDriver driver = DriverFactory.getdriver();
    By registerBut = By.linkText ("Register");
    By user_Name = By.name("username");
    By password1 = By.name("password1");
    By confirmPassword1 = By.name("password2");
    By registeredMsg = By.xpath("//body/div[2]");
    By errorMsg = By.xpath("//*[@class='alert alert-primary']");
//    @FindBy (xpath="//input[@name='username']") WebElement user_Name;
//	@FindBy(name="password1") WebElement pass_word;
//	@FindBy(name="password2") WebElement confirm_pwd;	
//	@FindBy (xpath="//*[@class='alert alert-primary']") WebElement errorMsg;
    By registerSubmitButton = By.xpath("//input[@value='Register']");
    @FindBy (linkText = "Sign in") WebElement signIn;
    
    public Register_Pom()
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void getRegisterPage() throws IOException
    {
    	ConfigReader.loadConfig();
    	String URL = ConfigReader.getHomePage();
    	driver.get(URL);
    }
    
    public void clickRegisterLink()
    {
    	driver.findElement(registerBut).click();
    }
    
    public void clickSubmitRegister()
    {
    	driver.findElement(registerSubmitButton).click();
    }
    
    public String getEmptyFieldErrorMsgUser()
    {
    	String userEmpty = driver.findElement(user_Name).getAttribute("validationMessage");
    	return userEmpty;
    	//return user_Name.getAttribute("validationMessage");
    }
    
    public String getEmptyFieldErrorMsgPawd()
    {
    	String passwordEmpty = driver.findElement(password1).getAttribute("validationMessage");
        return passwordEmpty;
    	//return pass_word.getAttribute("validationMessage");
    }
    

    public String getEmptyFieldErrorMsgconfirmPawd()
    {
    	String confirmPasswordEmpty = driver.findElement(confirmPassword1).getAttribute("validationMessage");
        return confirmPasswordEmpty;
    	//return confirm_pwd.getAttribute("validationMessage");
    }
    
        	
        public void enetrUserName(DataTable dataTable) {
        		List<Map<String, String>> userDetail = dataTable.asMaps(String.class, String.class);	
        		for (Map<String, String> mapData : userDetail) {
        			String userName = mapData.get("username");
        			Loggerload.info("The user enter username as : " + userName);
        			driver.findElement(user_Name).sendKeys(userName);
        		}
        	}
        	
        	public void enterPassword(DataTable dataTable) {
        		List<Map<String, String>> userDetail = dataTable.asMaps(String.class, String.class);
        		for (Map<String, String> mapData : userDetail) {
        			String passwd = mapData.get("password");
        			Loggerload.info("The user enter password as : " + passwd);
        			driver.findElement(password1).sendKeys(passwd);
        		}
        	}

        	public void enterConfirmPassword(DataTable dataTable) {
        		List<Map<String, String>> userDetail = dataTable.asMaps(String.class, String.class);
        		for (Map<String, String> mapData : userDetail) {
        			String cfmpwd = mapData.get("confirm_password");
        			Loggerload.info("The user enter confirm password as : " + cfmpwd);
        			driver.findElement(confirmPassword1).sendKeys(cfmpwd);
        		}
        	}	
        	
       // Data Driven Using Examples for Register 08
        	
        public void register_link(String username,String password,String confirm_password)
        {
        	driver.findElement(registerBut).click();
        	driver.findElement(user_Name).sendKeys(username);
        	driver.findElement(password1).sendKeys(password);
        	driver.findElement(confirmPassword1).sendKeys(confirm_password);
        	driver.findElement(registerSubmitButton).click();
        }
    
    public void getErrormsg()
    {
    	String Error_Message = driver.findElement(errorMsg).getText();
    	Loggerload.info("Error Message is : " +Error_Message);
    }
    
    public void getSignIn()
    {
    	signIn.click();
    }
    public String registerPage()
    {
    	String title = driver.getTitle();
    	return title;
    }
    public void screenShot() throws IOException {    
        TakesScreenshot screenshot =( TakesScreenshot) driver; 
        File sourceFile=screenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("C:\\Users\\areva\\My Workspace\\My_Project\\screenshot\\sample.png");
       // File destinationFile = new File("C:\\Users\\areva\\My Workspace\\My_Project\\screenshot");
        FileHandler.copy(sourceFile, destinationFile);
        }
}
