package upskill.amazon.api.restAssured;

import java.io.File;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class ApiTestingRestAssuredSteps {
	@Given("^Create new employee record$")
	public void create_new_employee_record() throws Throwable {
		File payload = new File(System.getProperty("user.dir") + "/src/test/resource/ApiPayloads/NewEmployee.json");
		
		RequestSpecification request = RestAssured.given();
		request.header("username", "jamesbond");
		request.header("password", "GB007");
		request.header("content-Type", "application/json");
		request.header("bear_token", "149hftahoen87ghy77");
		request.body(payload);
		Response resp = RestAssured.post("https://dummy.restapiexample.com/api/v1/create");
		int statusCode = resp.getStatusCode();
		String responseBody = resp.asString();
		Assert.assertEquals(200, statusCode);
		System.out.println("Status Code :" + statusCode);
		System.out.println("Response Body :" + responseBody);		
	}
	@Given("^Update employee record$")
	public void update_employee_record() throws Throwable {
		File payload = new File(System.getProperty("user.dir") + "/src/test/resource/ApiPayloads/UpdatedEmployee.json");
		RequestSpecification request = RestAssured.given();
		request.header("username", "jamesbond");
		request.header("password", "GB007");
		request.header("content-Type", "application/json");
		request.header("bear_token", "149hftahoen87ghy77");
		request.body(payload);	
		Response resp = RestAssured.put("https://dummy.restapiexample.com/api/v1/update/7");
		int statusCode = resp.getStatusCode();
		String responseBody = resp.asString();
		Assert.assertEquals(200, statusCode);
		System.out.println("Status Code :" + statusCode);
		System.out.println("Response Body :" + responseBody);
	}
	@When("^Get all employee data$")
	public void get_all_employee_data() throws Throwable {
		Response resp = RestAssured.get("https://dummy.restapiexample.com/api/v1/employees");
		int statusCode = resp.getStatusCode();
		String responseBody = resp.asString();
		Assert.assertEquals(200, statusCode);
		System.out.println("Status Code :" + statusCode);
		System.out.println("Response Body :" + responseBody);
	}
	@Then("^Delete employee record$")
	public void delete_employee_record() throws Throwable {
		Response resp = RestAssured.delete("https://dummy.restapiexample.com/api/v1/delete/17");
		int statusCode = resp.getStatusCode();
		String responseBody = resp.asString();
		Assert.assertEquals(200, statusCode);
		System.out.println("Status Code :" + statusCode);
		System.out.println("Response Body :" + responseBody);
	}
	@Then("^Get single employee data by id$")
	public void get_single_employee_data_by_id() throws Throwable {
		Response resp = RestAssured.get("https://dummy.restapiexample.com/api/v1/employee/20");
		int statusCode = resp.getStatusCode();
		String responseBody = resp.asString();
		Assert.assertEquals(200, statusCode);
		System.out.println("Status Code :" + statusCode);
		System.out.println("Response Body :" + responseBody);
	}

	

}
