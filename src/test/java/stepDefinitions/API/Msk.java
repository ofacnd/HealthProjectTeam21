package stepDefinitions.API;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.DrAppointmentsPojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static base_Url.MedunnaUrl2.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class Msk {
    List<String> staffFirstNameList;
    Response response;

    @Given("Admin Appointment bilgilerini alir")
    public void adminAppointmentBilgileriniAlir() {
        spec.pathParams("first", "api","second","appointments");
        response = given().headers("Authorization", "Bearer " + generateToken()).spec(spec).contentType(ContentType.JSON)
                .when()
                .get("/{first}/{second}");
        JsonPath jsonPath=response.jsonPath();
        //response.prettyPrint();

    }
    @Then("Admin Appointment bilgilerini Api Testi ile dogrular")
    public void adminAppointmentBilgileriniApiTestiIleDogrular() {
        assertEquals(200, response.statusCode());
    }

    @Given("Admin Appointment ID bilgilerini alir")
    public void adminAppointmentIDBilgileriniAlir() {
        spec.pathParams("first", "api","second","appointments","thirth",307590);
        response = given().headers("Authorization", "Bearer " + generateToken()).spec(spec).contentType(ContentType.JSON)
                .when()
                .get("/{first}/{second}/{thirth}");
        JsonPath jsonPath=response.jsonPath();
        //response.prettyPrint();
    }

    @Then("Admin Appointment ID bilgilerini Api Testi ile dogrular")
    public void adminAppointmentIDBilgileriniApiTestiIleDogrular() {
        //VALIDATION #1 >> assertThat
        DrAppointmentsPojo expectedData = new DrAppointmentsPojo(307590,"2022-12-14T00:00:00Z","2022-12-14T01:00:00Z","PENDING");
        response.then().assertThat().body("id",equalTo(expectedData.getId())).
                body("startDate",equalTo(expectedData.getStartDate())).
                body("endDate",equalTo(expectedData.getEndDate())).
                body("status",equalTo(expectedData.getStatus()));

        //VALIDATION #3 >> MAP
        Map<String,Object> actualData=response.as(HashMap.class);
        assertEquals(actualData.get("id"),(expectedData.getId()));
        assertEquals(actualData.get("startDate"),(expectedData.getStartDate()));
        assertEquals(actualData.get("endDate"),(expectedData.getEndDate()));
        assertEquals(actualData.get("status"),(expectedData.getStatus()));

        //VALIDATION #2 >> JSON
        JsonPath jsonPath=response.jsonPath();
        assertEquals( jsonPath.getInt("id"),(expectedData.getId()));
        assertEquals(jsonPath.getString("startDate"),(expectedData.getStartDate()));
        assertEquals(jsonPath.getString("endDate"),(expectedData.getEndDate()));
        assertEquals(jsonPath.getString("status"),(expectedData.getStatus()));
    }
}