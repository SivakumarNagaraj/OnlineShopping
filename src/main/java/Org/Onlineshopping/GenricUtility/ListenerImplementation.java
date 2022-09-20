package Org.Onlineshopping.GenricUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementation implements ITestListener {

	ExtentReports extentReports;
	ExtentTest test;
                                                             
	@Override//BM
	public void onTestStart(ITestResult result) {
		test = extentReports.createTest(result.getMethod().getMethodName());
	}

	@Override//AM
	public void onTestSuccess(ITestResult result) {
		test.pass(result.getMethod().getMethodName()+"PASS");
	}

	@Override//AM
	public void onTestFailure(ITestResult result) {

		try {
			new ScreenShortUtility().ScreenShort(BaseClass.sdriver, BaseClass.sjavautility, result.getMethod().getMethodName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override//AM
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override//AM
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override//BT
	public void onStart(ITestContext context) {
		ExtentSparkReporter exteReporter=new ExtentSparkReporter("./ExtentReport/extentreport.html");
		exteReporter.config().setDocumentTitle("Testcase Reports");
		exteReporter.config().setReportName("Wayfair");
		exteReporter.config().setTheme(Theme.DARK);

		extentReports=new ExtentReports();
		extentReports.attachReporter(exteReporter);
		extentReports.setSystemInfo("Author", "Spidy");
		extentReports.setSystemInfo("OS", "Win11");
		extentReports.setSystemInfo("Browser", "Chrome");

	}

	@Override//AT
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
