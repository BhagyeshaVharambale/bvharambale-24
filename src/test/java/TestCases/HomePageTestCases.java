package TestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePage;

public class HomePageTestCases extends BaseTestCase {
      
    HomePage hp ;
    
    @Test
    public void verifyTitle() {        
    	assertEquals(driver.getTitle(), "Google");    	
    }
    
    @Test
    public void verifysearchBox() throws InterruptedException {
    	hp = new HomePage(driver);
    	hp.getsearchBox().sendKeys("bhagyesha");
    	Thread.sleep(4000);
    }
    
    @Test
    public void verifySearchVoicebutton() throws InterruptedException {
    	hp = new HomePage(driver);
        hp.getSearchByVoice().click();
        Thread.sleep(4000);
    }
	 
}
