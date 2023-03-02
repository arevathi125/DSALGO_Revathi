package utilities;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import crossBrowser.DriverFactory;

public class ElementsUtils {

	public static WebDriver driver = DriverFactory.getdriver();
	String Excelpath = ConfigReader.getexcelfilepath();
	String code;
	String result;

	public void WaitForElement(WebElement element, Duration timeOutInSeconds) {
		WebDriverWait wait=new WebDriverWait(driver,timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public String getCodefromExcel(int sheetNumber, int rownumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData(Excelpath,1);
		code = testdata.get(rownumber).get("python_Code");
	    return code;
}
	
	public String getCodefromExcel(String sheetName, int rownumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData(Excelpath,"pythonCode");
		code = testdata.get(rownumber).get("python_Code");
		result = testdata.get(rownumber).get("Result");
		return code;
	}

	public void enterCode(String code, WebElement element) {
		Actions action=new Actions(driver);
		action.sendKeys(element, code).perform();
	}

//	public void enterCodePractice(String code, WebElement element) {
//		new Actions(driver).keyDown(Keys.COMMAND).sendKeys("a").sendKeys(Keys.DELETE).keyUp(Keys.COMMAND).perform();
//		String[] str1 = code.split("\n");
//		for (int i = 0; i < str1.length; i++) {
//			if (str1[i].equalsIgnoreCase("\\b")) {
//				element.sendKeys(Keys.BACK_SPACE);
//			} else {
//				element.sendKeys(str1[i]);
//				element.sendKeys(Keys.RETURN);
//			}
//		}
//
//	}
//
//	public String getResultfromExcel(Integer sheetNumber, int rownumber) throws InvalidFormatException, IOException {
//		ExcelReader reader = new ExcelReader();
//		List<Map<String, String>> testdata = reader.getData(Excelpath, sheetNumber);
//		result = testdata.get(rownumber).get("Result");
//		Loggerload.info("Expected result from Excel sheetname " + sheetNumber + " and " + rownumber + " : " + result);
//		return result;
//	}
//	public String getResultfromExcel(String sheetName, int rownumber) throws InvalidFormatException, IOException {
//		ExcelReader reader = new ExcelReader();
//		List<Map<String, String>> testdata = reader.getData(Excelpath, sheetName);
//		result = testdata.get(rownumber).get("Result");
//		Loggerload.info("Expected result from Excel sheetname " + sheetName + " and " + rownumber + " : " + result);
//		return result;
//	}
}
