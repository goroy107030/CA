package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Base {
	
	//The Below Instances are for Reporting
	public ExtentReports extent;
	public ExtentHtmlReporter reporter;
	public ExtentTest logger;
	
	//The Below Instances are for Rest Assured
	public Response response;
	public RequestSpecification request;
	public String resbody;
	
	
	public Base() {		
		reporter=new ExtentHtmlReporter(".\\Report\\TestResult.html");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		
	}

}
