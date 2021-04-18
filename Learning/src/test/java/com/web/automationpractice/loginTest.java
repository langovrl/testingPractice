package com.web.automationpractice;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.web.automationpractice.LoginPage;

import SeleniumPractice.Learning.TestBase;
import testBase.tb; 

public class loginTest extends tb{
	
	@BeforeSuite
	public void init() {

		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir") + "//" + "sparkle.html");
		spark.config().setDocumentTitle("Sport Clip POC Test DocumentTitle - Created by Vaibhav");
		spark.config().setReportName("Extemt Practice Report");
		extent.attachReporter(spark);
		extent.setReportUsesManualConfiguration(true);
	}
	@AfterSuite
	public void end() {
		extent.flush();
	}
	@BeforeClass
	public void setup() throws InterruptedException{
		getBrowser("chrome");
	}
	
	@BeforeMethod
	public void load() { 
		driverr.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}
	@AfterMethod
    public void getResult(ITestResult result) throws IOException
    {
        if(result.getStatus() == ITestResult.FAILURE)
        {
            String screenShotPath = getScreenShot(); 
            test.log(Status.FAIL, result.getThrowable()); 
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
        } 
    }
 
	@Test 
	public void invalidLogin()throws IOException{

		test = extent.createTest("Invalid Login");
		TestBase tbb = new TestBase();
		LoginPage LP = new LoginPage(driverr);
		LP.loginToApplication(tbb.getLogin(1)[0],tbb.getLogin(1)[1]);
 
		try {
			Assert.assertEquals(LP.logoutButton.isDisplayed(), true);
		
		if (LP.logoutButton.isDisplayed()) {
			System.out.println("Login Success");
		}else {
			System.out.println("Login Failed");
		}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			Assert.fail();
		} 
        test.log(Status.PASS, "Test Passed");
	}
	
	@Test
	public void loginTesting() throws IOException, InterruptedException { 
		test = extent.createTest("Login Test");
		TestBase tbb = new TestBase();
		LoginPage LP = new LoginPage(driverr);
		LP.loginToApplication(tbb.getLogin(5)[0],tbb.getLogin(5)[1]);
 
		try {
			Assert.assertEquals(LP.logoutButton.isDisplayed(), true);
		
		if (LP.logoutButton.isDisplayed()) {
			System.out.println("Login Success");
		}else {
			System.out.println("Login Failed");
		}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		LP.addToCart();
        String screenShotPath = getScreenShot();  
        test.pass(MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
		LP.removeFromCart();
        String screenShotPa = getScreenShot();  
        test.pass(MediaEntityBuilder.createScreenCaptureFromPath(screenShotPa).build());
        test.log(Status.PASS, "Test Passed");
	}

	//@Test
	public void logoutTest() {
		LoginPage LP = new LoginPage(driverr);
		LP.logoutFromApplication();

		Assert.assertEquals(LP.loginButton.isDisplayed(), true);
		if (LP.loginButton.isDisplayed()) {
			System.out.println("Logout Success");
		}
	}
}
