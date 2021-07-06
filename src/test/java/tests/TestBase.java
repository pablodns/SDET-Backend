package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class TestBase {

	static String s;
	
	public static void main(String[] args) {
	}
	
	@BeforeMethod
	public void setUp() {
		
	}
	
	@AfterMethod
	public void tearDown() {
		
	}
}
