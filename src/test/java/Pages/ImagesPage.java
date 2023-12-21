package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImagesPage {
    
	WebDriver driver ;
	WebElement textbox ;
	
	public ImagesPage(WebDriver driver) {
		this.driver = driver ;
	}

	public WebElement getTextbox() {
		setTextbox();
		return textbox;
	}

	public void setTextbox() {
		this.textbox = driver.findElement(By.cssSelector("#APjFqb"));
	}
	
	
	
}
