package stepDefinition;
 
import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.web.automationpractice.LoginPage;

import SeleniumPractice.Learning.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testBase.tb;



public class LoginCucumberTests extends tb{

	@Given("I have login field on the website")
	public void i_have_login_field_on_the_website() {
	    // Write code here that turns the phrase above into concrete actions

		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir") + "//" + "sparkle.html");
		spark.config().setDocumentTitle("Sport Clip POC Test DocumentTitle - Created by Vaibhav");
		spark.config().setReportName("Extemt Practice Report");
		extent.attachReporter(spark);
		extent.setReportUsesManualConfiguration(true);
		
		getBrowser("firefox");
		
		driverr.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
	}

	@When("I enter the credential")
	public void i_enter_the_credential() throws IOException {
	    // Write code here that turns the phrase above into concrete actions

		test = extent.createTest("Invalid Login");
		TestBase tbb = new TestBase();
		LoginPage LP = new LoginPage(driverr);
		LP.loginToApplication(tbb.getLogin(1)[0],tbb.getLogin(1)[1]);
 
		
	}

	@Then("Logout btn should not be displayed")
	public void logout_btn_should_not_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions

		LoginPage LP = new LoginPage(driverr);
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

	@Then("Finish the scenario")
	public void Finish_Scenario(ITestResult result) throws IOException {
		extent.flush();
		

        if(result.getStatus() == ITestResult.FAILURE)
        {
            String screenShotPath = getScreenShot(); 
            test.log(Status.FAIL, result.getThrowable()); 
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
        } 
	}
	
}
