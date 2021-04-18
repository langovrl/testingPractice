package report;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testBase.tb;

public class Testlistner extends tb implements ITestListener{

	public void onTestStart(ITestResult result) { 
	}

	public void onTestSuccess(ITestResult result) { 
	}

	public void onTestFailure(ITestResult result) { 
		tb testbase = new tb();
		test.addScreenCaptureFromPath(testbase.getScreenShot());
	}

	public void onTestSkipped(ITestResult result) { 
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) { 
	}

	public void onTestFailedWithTimeout(ITestResult result) { 
	}

	public void onStart(ITestContext context) { 
	}

	public void onFinish(ITestContext context) { 
	}
	
	

}
