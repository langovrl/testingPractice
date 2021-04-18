package report;

import java.util.List;
import java.util.Map;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.xml.XmlSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import testBase.tb;

public class ExtentTestNGReporterListner extends tb implements IReporter {
 

	private void init() {
		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir") + "//" + "spark.html");
		spark.config().setDocumentTitle("Extent Practice - Created by Vaibhav");
		spark.config().setReportName("Extent Practice Report");
		extent.attachReporter(spark);
		extent.setReportUsesManualConfiguration(true);

	}

	private void buildTestNodes(IResultMap tests, Status status) {
	 
		if (tests.size() > 0) {
			for (ITestResult result : tests.getAllResults()) {
				test = extent.createTest(result.getMethod().getMethodName());

				for (String group : result.getMethod().getGroups())
					test.assignCategory(group);
				if (result.getThrowable() != null) {
					test.log(status, result.getThrowable());
				} else {
					test.log(status, " Test " + status.toString().toLowerCase() + "ed");
				} 
				test.getModel().setStartTime(getTime(result.getStartMillis()));
				test.getModel().setEndTime(getTime(result.getEndMillis()));
				
			}
		}
	}

	private Date getTime(long millis) {
		Calendar calender = Calendar.getInstance();
		calender.setTimeInMillis(millis);
		return calender.getTime();
	}

	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		init();

		for (ISuite suite : suites) {
			Map<String, ISuiteResult> result = suite.getResults();

			for (ISuiteResult r : result.values()) {
				ITestContext context = r.getTestContext();
				buildTestNodes(context.getFailedTests(), Status.FAIL);
				buildTestNodes(context.getPassedTests(), Status.PASS);
				buildTestNodes(context.getSkippedTests(), Status.SKIP);
				
			}
		}
		
		for (String s : Reporter.getOutput()) {
			extent.addTestRunnerOutput(s);
		}
		
		extent.flush();
		
	}

}
