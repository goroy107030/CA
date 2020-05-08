package testsuite;

import org.testng.annotations.Test;

import base.Base;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class SysTest extends Base{
	
	
	/*We will follow below structure to Test
 
	Given()
	When()
	then()
	assert()	 
 */
	
	@Test
	public void testScore() {
		
		given()
		.baseUri("http://restapi.demoqa.com/utilities/weather/city")
		.when()
		.get("/Kolkata")
		.then()
		.assertThat()
		
		.statusCode(200)
		
		.and()
		
		.body("City",equalTo("Kolkata"));
		
		
		
	/*		
		RequestSpecification request=given()
		.baseUri("http://restapi.demoqa.com/utilities/weather/city");
		
		request.when().get("/Pune").then().assertThat().body("City", equalTo("Pune"));
		System.out.println(request.get("/Pune").asString());
		*/
		
	}
	
	@Test
	public void test_Pune() {
		
		given().baseUri("http://restapi.demoqa.com/utilities/weather/city")
		.when().get("/Pune")
		.then().assertThat()
		.statusCode(200)
		.and()
		.body("City", equalTo("une"));
		
		
		
	}
	
	
	

}
