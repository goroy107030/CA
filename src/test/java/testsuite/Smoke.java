package testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Smoke extends Base{
	public Response response;
	public RequestSpecification request;
	public String resbody;
	
	@BeforeMethod
	public void setup() {
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		request=RestAssured.given();
		
	}
	
	
	@Test
	public void testScore1() {
		
	response=request.get("/kolkata");
	resbody=response.getBody().asString();
	System.out.println(resbody);
	String[] x=resbody.split(",");
	for(int i=0;i<x.length;i++) {
		System.out.println(x[i]);	
	}
	int y=response.getStatusCode();
	System.out.println(y);
	String z=response.getStatusLine();
	System.out.println(z);
	
		
	}
	
	@AfterMethod
	public void trailing() {
		System.out.println("One Method Completed");
	}


}
