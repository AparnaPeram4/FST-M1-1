import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class GitHub_Activity {

	String sshKey = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDDhiRVM0gZI+1mCSJ8lYz9H9mMg6FGCY3i/b7lQLaiCpT3gE0XeMpEc469Vv1kYbKEeYXXDhMiPIkS+n6TOb0GJAh+qhf4pTAc3gxNzAaQ7lAqZzaC/A4ycC0FQO52S6mPRszMMphNrqm+FnwgQ5etu5bzQ1dUn0n4aEfln6VkcpO2UObBKXoAYaJzJ+Jg/e5nRqUfQlGXmreEZ4VXOXlNmWZTTX2vylpfDjo7XZ3OlgCJmpM9HiM3odY5ThKCET65RH4DNjRiZOfrQ0SSlYadNcPR6i794dizz0vZ+Fw8Hq/gY+Obj9Ea98tMVKia8T/3VcFkhDCN5Hyg5MXdigI1gMor2kCiI5hWXgSjTJPestIpjT5oXkd/61I2h2wv8mkHGhpIB5tsjjSJLeew+JdBYoNkNwoY8781XdnMwGVmx8TGsgEX7sIOyR+YAVo/7jCSsxC829Mj7JDpxeAeIwXdY0EbzQp4BuOwzoY92KDJaGhCmZOOszo2EWcdGxBRCys=";
	int id;
	// Declare request & Response specification
	RequestSpecification requestSpec;
	ResponseSpecification responseSpec;

	@BeforeClass
	public void setUp() {

		// Create request specification
		requestSpec = new RequestSpecBuilder()
				.addHeader("Authorization", "token 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")
				.setContentType(ContentType.JSON).setBaseUri("https://api.github.com").build();
		responseSpec = new ResponseSpecBuilder()

				// Check response content type
				.expectContentType("application/json")
				// Build response specification
				.build();

	}

	@Test(priority = 1)

	public void PostRequest() {

		String reqBody = "{ \"title\": \"TestAPIKey\",  \"key\": \"ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDDhiRVM0gZI+1mCSJ8lYz9H9mMg6FGCY3i/b7lQLaiCpT3gE0XeMpEc469Vv1kYbKEeYXXDhMiPIkS+n6TOb0GJAh+qhf4pTAc3gxNzAaQ7lAqZzaC/A4ycC0FQO52S6mPRszMMphNrqm+FnwgQ5etu5bzQ1dUn0n4aEfln6VkcpO2UObBKXoAYaJzJ+Jg/e5nRqUfQlGXmreEZ4VXOXlNmWZTTX2vylpfDjo7XZ3OlgCJmpM9HiM3odY5ThKCET65RH4DNjRiZOfrQ0SSlYadNcPR6i794dizz0vZ+Fw8Hq/gY+Obj9Ea98tMVKia8T/3VcFkhDCN5Hyg5MXdigI1gMor2kCiI5hWXgSjTJPestIpjT5oXkd/61I2h2wv8mkHGhpIB5tsjjSJLeew+JdBYoNkNwoY8781XdnMwGVmx8TGsgEX7sIOyR+YAVo/7jCSsxC829Mj7JDpxeAeIwXdY0EbzQp4BuOwzoY92KDJaGhCmZOOszo2EWcdGxBRCys=\" }";

		Response response = given().spec(requestSpec).body(reqBody).post("/user/keys");
		// Assertion with response specification
		response.then().spec(responseSpec);

		// Print response
		String body = response.getBody().asPrettyString();
		System.out.println(body);
		id = response.then().extract().path("id");
		System.out.println("Id: " + id);
		Assert.assertEquals(response.getStatusCode(), 201);

	}

	@Test(priority = 2)
	public void GetRequest() {

		Response response = given().spec(requestSpec).get("/user/keys");
		System.out.println(response.getBody().asPrettyString());
		Reporter.log(response.getBody().asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
	}

	@Test(priority = 3)
	public void DeleteRequest() {

		Response response = given().spec(requestSpec).pathParam("keyId", id).delete("/user/keys/{keyId}");
		Reporter.log(response.getBody().asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 204);
		
	}
}