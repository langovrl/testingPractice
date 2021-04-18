package testBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.google.common.io.Files;

 
public class tb {

	public static WebDriver driverr;
	public static Logger log;
	private static boolean root=false;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	
	public static Logger getLogger(Class cls) {
		if(root) {
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure(System.getProperty("user.dir")+"/src\\main\\bhanuHybridFramework\\config\\log4j.properties");
		root = true;
		return Logger.getLogger(cls);
	}
	
	public String getScreenShot() {
		Logger log = getLogger(tb.class);
		log.info("Taking Screenshot");
		TakesScreenshot scrshot = (TakesScreenshot)driverr;
		File scrFile = scrshot.getScreenshotAs(OutputType.FILE);
		
		Calendar calender = Calendar.getInstance();
		SimpleDateFormat formator = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		String location = System.getProperty("user.dir")+"/src//main//bhanuHybridFramework//screenshots//";
		String actualImageName = location+"image_"+formator.format(calender.getTime())+".png";
		
		File destFile = new File(actualImageName);
		try {
			Files.copy(scrFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		return actualImageName;
	}
	
	public void getBrowser(String browser) {
		Logger log = getLogger(tb.class);
		log.info("Opening browser");
		if (System.getProperty("os.name").contains("Windows")) {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\One\\Downloads\\chromedriver.exe");
				driverr = new ChromeDriver();
				driverr.manage().window().maximize();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\One\\Downloads\\geckodriver.exe");
				driverr = new FirefoxDriver();
				driverr.manage().window().maximize();
			} else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", "C:\\Users\\One\\Downloads\\msedgedriver.exe");
				driverr = new FirefoxDriver();
				driverr.manage().window().maximize();
			}
		}
		
		else if (System.getProperty("os.name").contains("Mac")) {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\One\\Downloads\\chromedriver.exe");
				driverr = new ChromeDriver();
				driverr.manage().window().maximize();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\One\\Downloads\\geckodriver.exe");
				driverr = new FirefoxDriver();
				driverr.manage().window().maximize();
			} else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", "C:\\Users\\One\\Downloads\\msedgedriver.exe");
				driverr = new FirefoxDriver();
				driverr.manage().window().maximize();
			}
		}
		
		else if (System.getProperty("os.name").contains("linux")) {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\One\\Downloads\\chromedriver.exe");
				driverr = new ChromeDriver();
				driverr.manage().window().maximize();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\One\\Downloads\\geckodriver.exe");
				driverr = new FirefoxDriver();
				driverr.manage().window().maximize();
			} else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", "C:\\Users\\One\\Downloads\\msedgedriver.exe");
				driverr = new FirefoxDriver();
				driverr.manage().window().maximize();
			}
		}
		
	}
	
	
}
