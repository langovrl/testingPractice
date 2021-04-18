package SeleniumPractice.Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryPractice extends TestBase{
	
	public PageFactoryPractice(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[contains(text(), 'Testing')]")
	WebElement Testingdropdown;

	@FindBy(xpath="//ul[@class='g-active g-dropdown g-dropdown-center g-fade']//*[contains(text(),'Manual Testing')]")
	WebElement manualtest;

	
	public void act() throws InterruptedException { 
		   launchBrowser();
		   driver.get("https://www.guru99.com/first-webdriver-script.html");	 
		   Testingdropdown.click();
		   Thread.sleep(4000);
		   manualtest.click();
		   
		}
	public static void main(String[] args) throws InterruptedException {
		PageFactoryPractice pf = new PageFactoryPractice(driver);
		pf.act();
	}
}
