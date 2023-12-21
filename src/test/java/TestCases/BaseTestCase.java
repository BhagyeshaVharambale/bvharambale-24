package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import GoogleExample.Utility;

public class BaseTestCase {
	
	WebDriver driver ;
	
	@BeforeMethod(alwaysRun = true)
	public void initializeBrowser() {
		this.driver = Utility.getDriver();
		driver.get(Utility.readProperty("url"));
		driver.manage().window().maximize();
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDown(ITestResult result){
		if(ITestResult.FAILURE == result.getStatus()) {
			Utility.getScreenshot(driver, result.getName());
		}
		driver.quit();
	}
}
