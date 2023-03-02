package hooks;

import org.openqa.selenium.WebDriver;
import java.io.ByteArrayInputStream;
import java.io.IOException;
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

	@AfterAll
	public static void after() {
		//logger.info("Closing Driver");
		driverfactory.closeallDriver();
	}	
}
