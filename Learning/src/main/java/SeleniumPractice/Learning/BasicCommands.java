package SeleniumPractice.Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicCommands extends TestBase{

	
	public static void action()  throws InterruptedException { 
	   driver.get("https://www.guru99.com/first-webdriver-script.html");	
	   WebElement Testingdropdown = driver.findElement(By.xpath(("//span[contains(text(), 'Testing')]")));
	   Testingdropdown.click();
	   WebElement manualtest = driver.findElement(By.xpath(("//ul[@class='g-active g-dropdown g-dropdown-center g-fade']//*[contains(text(),'Manual Testing')]")));
	   Thread.sleep(4000);
	   manualtest.click();
	   
	}
	
	public static void actionTwo()  throws InterruptedException { 
	   driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");	
	   WebElement Testingdropdown = driver.findElement(By.xpath(("//*[text()='Radio Button Demo']//parent::div[@class='panel panel-default'] //input[@value='Male']")));
	   Testingdropdown.click();
	   WebElement manualtest = driver.findElement(By.xpath(("//button[text()='Get Checked value']")));
	   Thread.sleep(4000);
	   manualtest.click();
	   WebElement manualtest1 = driver.findElement(By.xpath(("//*[text()='Group Radio Buttons Demo']//parent::div[@class='panel panel-default'] //input[@value='Male']")));
	   Thread.sleep(4000);
	   manualtest1.click();

	   WebElement manualtest2 = driver.findElement(By.xpath(("//*[text()='Group Radio Buttons Demo']//parent::div[@class='panel panel-default'] //input[@value='5 - 15']")));
	   Thread.sleep(4000);
	   manualtest2.click();

	   WebElement manualtest3 = driver.findElement(By.xpath(("//*[text()='Group Radio Buttons Demo']//parent::div[@class='panel panel-default'] //button[contains(text(), 'Get values')]")));
	   Thread.sleep(4000);
	   manualtest3.click();
	   WebElement element = driver.findElement(By.xpath("//*[text()='Group Radio Buttons Demo']//parent::div[@class='panel panel-default'] //button[contains(text(), 'Get values')]"));
	   
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	   Thread.sleep(500); 
	   String text1 = driver.findElement(By.xpath(("//*[text()='Radio Button Demo']//parent::div[@class='panel panel-default']"))).getText();
	   boolean b = text1.contains("Radio button 'Male' is checked");
	   String text2 = driver.findElement(By.xpath(("//*[text()='Group Radio Buttons Demo']//parent::div[@class='panel panel-default']"))).getText();
	   boolean c = text2.contains("Sex : Male");
	   boolean d = text2.contains("Age group: 5 - 15");
	   if(b==true) {
		   System.out.println("Male radio button selected ");
	   } 
	   //System.out.println(text2);
	   if(c==true && d==true){
		   
		   System.out.println("Sex : Male && Age group: 5 - 15");
	   }
	   
	   driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	   Select drp = new Select(driver.findElement(By.id("select-demo")));
	   drp.selectByValue("Monday"); 
	   Select drp1 = new Select(driver.findElement(By.id("multi-select")));
//	   driver.findElement(By.xpath("//*[@value='California']")).click();
//	   driver.findElement(By.xpath("//*[@value='Ohio']")).click();
//	   drp1.selectByValue("California"); 
	   Thread.sleep(2000);
//	   drp1.selectByVisibleText("California");
//	   Thread.sleep(2000);
//	   drp1.selectByVisibleText("Ohio");  
//	   Thread.sleep(2000);

	   drp1.selectByIndex(1);
	   Thread.sleep(2000);
	   drp1.selectByIndex(3);  
	   Thread.sleep(2000);
	   driver.findElement(By.id("printAll")).click();
	   
	}
	public static void main(String[] args) throws InterruptedException {
		TestBase tb = new TestBase();
//		tb.launchBrowser();
//		action();
//		Thread.sleep(5000);
//		driver.quit();
//		tb.launchBrowser();
//		actionTwo();
		System.out.println(System.getProperty("user.dir"));
		//driver.quit();
	}
	

}
