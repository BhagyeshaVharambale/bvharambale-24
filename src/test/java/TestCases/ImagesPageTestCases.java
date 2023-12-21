package TestCases;

import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

import Pages.ImagesPage;

public class ImagesPageTestCases extends BaseTestCase {
     
	ImagesPage ip ;
	
	@Test
	public void verifyImageBox() throws InterruptedException {
		ip = new ImagesPage(driver);
		ip.getTextbox().sendKeys("ganesha");
		Thread.sleep(3000);
	}
	
	@Test
	public void verifyUrl() {
		assertNotEquals(driver.getCurrentUrl(), "https://www.google.co.in/");
	}
	
}
