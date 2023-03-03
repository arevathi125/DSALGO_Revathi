package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import crossBrowser.DriverFactory;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import utilities.ConfigReader;
import utilities.Loggerload;

public class Hooks {

	private static final String IMAGE_PATH = null;
	private static WebDriver driver;
	private static DriverFactory driverfactory;
	//private static Logger logger = (Logger) LogManager.getLogger();
	//private static final Logger logger= (Logger) LogManager.getLogger(Loggerload.class);
	//public static Logger logger;
	static Scenario scenario;
	
	@BeforeAll
	public static void setup() throws IOException {		
 //******** adding logger ( instantiating logger)******************
				//Get browser Type from config file
		        Loggerload.info("Loading Config file");
				ConfigReader.loadConfig();				
				String browser = ConfigReader.getBrowserType();
				
				//Initialize driver from driver factory
				driverfactory = new DriverFactory();
				driver = driverfactory.initializeDrivers(browser);
				Loggerload.info("Initializing driver for : "+browser);			
	}
		
	@Before
	public void scenario(Scenario scenario) {
		Loggerload.info("===============================================================================================");
		Loggerload.info(scenario.getSourceTagNames() +" : "+scenario.getName());
		Loggerload.info("-----------------------------------------------------------------------------------------------");
		
	}

	@AfterStep
	public void afterstep(Scenario scenario) {
		if (scenario.isFailed()) {
			Loggerload.error("Steps Failed");
			Loggerload.error("Steps Failed , Taking Screenshot");                  //***************************
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);    //***************************
			scenario.attach(screenshot, "image/png", "My screenshot");     //***************************
			Allure.addAttachment("Myscreenshot",      //***************************
			new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));     //***************************		
		}
	}
	
//	@AfterStep
//	public void afterstep(Scenario scenario) {
//		List<String> list = (List<String>) scenario.getSourceTagNames();
//		//list.
//		Loggerload.info("Scenario Name"+list.get(1));
//		if(list.get(1).equals("@TS_register_02")) {
//		//if (scenario.isFailed()) {
//			Loggerload.error("Steps Failed");
//			Loggerload.error("Steps Failed , Taking Screenshot");                  //***************************
//			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);    //***************************
//			scenario.attach(screenshot, "image/png", "My screenshot");     //***************************
//			Allure.addAttachment("Myscreenshot",      //***************************
//			new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
//		}//***************************		
//		//}
			//scenario.
	//}
	

	@AfterAll
	public static void after() {
		//logger.info("Closing Driver");
		driverfactory.closeallDriver();
	}	
}
