package commonfunctions;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.Status;

import base.Base;

public class Listeners extends Base implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Execution Start.Name of the test cases is: "+result.getName());
		
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Congrats..Your Test Case is Passed: "+result.getName());
		
		logger=extent.createTest(result.getName());
		
		logger.log(Status.PASS, "Pass");
	
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Ops..Your Test Case is Failed : "+result.getName());
		logger=extent.createTest(result.getName());
		logger.log(Status.FAIL, result.getThrowable());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Warning..Your Test Case is Skipped: "+result.getName());
		logger=extent.createTest(result.getName());
		logger.log(Status.SKIP,"Skip");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		System.out.println("Your Test Execution is begining.");
		extent.setSystemInfo("OS", "Windows7");
		
	}

	public void onFinish(ITestContext context) {
		extent.flush();
		
	}

	

}
