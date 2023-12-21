package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
     
	WebDriver driver ;
	WebElement imagesButton ;
	WebElement gmailButton ;
	WebElement doodlelink ;
	WebElement searchBox ;
	WebElement searchByVoice ;
	

	public HomePage (WebDriver driver) {
		this.driver = driver ;
	}
	
	public WebElement getImagesButton() {
		setImagesButton();
		return imagesButton;
	}
	
	public void setImagesButton() {
		this.imagesButton = driver.findElement(By.xpath("//a[text()='Images']"));
	}
	
	public WebElement getGmailButton() {
		setGmailButton();
		return gmailButton;
	}
	
	public void setGmailButton() {
		this.gmailButton = driver.findElement(By.xpath("//a[text()='Gmail']"));
	}
	
	public WebElement getDoodlelink() {
		setDoodlelink();
		return doodlelink;
	}
	
	public void setDoodlelink() {
		this.doodlelink = driver.findElement(By.xpath("(//input[@class='RNmpXc'])[2]"));
	}
	
	public void navigateToImagesPage() {
		getImagesButton().click();
	}
	
	public void navigateToDoodlesPage() {
		getDoodlelink().click();
	}
	
	public void navigateToGmailPage() {
		getGmailButton().click();
	}

	public WebElement getsearchBox() {
		setsearchBox();
		return searchBox;
	}
	public void setsearchBox() {
		this.searchBox = driver.findElement(By.xpath("//textarea[@title='Search']"));
	}
	
	public WebElement getSearchByVoice() {
		setSearchByVoice();
		return searchByVoice;
	}

	public void setSearchByVoice() {
		this.searchByVoice = driver.findElement(By.xpath("//div[@aria-label='Search by voice']"));
	}
}
