package services;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;

import java.util.Arrays;

import org.apache.http.HttpStatus;
import org.junit.Test;


public class BookTests
{
	private static String ENDPOINT_GET_Customer_By_ID = "https://www.CustomerOnboardingApplication.com/customers";

	@Test
	public void testGetByISBN(){
		String isbn = "isbn:IN3546";

		given().
		param("q", ID).
		when().
		get(ENDPOINT_GET_Customer_By_ID)
		.then().
		statusCode(HttpStatus.SC_OK).
		body(	"Validations", equalTo("login details"),
				"Views", equalTo(2),
				"SubViews", equalTo(5),
				"Workflow", equalTo("Manager Approval"),
			
	}
}
