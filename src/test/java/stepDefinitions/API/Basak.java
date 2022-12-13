package stepDefinitions.API;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.ConfigReader;

import java.util.HashMap;
import java.util.List;

import static base_Url.MedunnaUrl2.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;
import static utilities.Authentication.generateToken;

public class Basak {
    List<String> staffFirstNameList;
    Response response;
    @Given("Admin staff bilgilerini alir")
    public void adminstaffBilgileriniAlir() {
        spec.pathParams("first", "api","second","staff");

        response = given().headers("Authorization", "Bearer " + generateToken()).spec(spec).contentType(ContentType.JSON)
                .when()
                .get("/{first}/{second}");
        JsonPath jsonPath=response.jsonPath();
        staffFirstNameList=jsonPath.getList("findAll{it.firstName}.firstName");
        System.out.println(staffFirstNameList);


    }

    @Then("Admin staff bilgilerini Api Testi ile dogrular")
    public void adminStaffBilgileriniApiTestiIleDogrular() {
        assertEquals(200,response.statusCode());
        response.prettyPrint();
        //Map<String,Object> actualData=response.as(HashMap.class);
        // System.out.println(actualData);

    }





    @Given("Admin staff ID bilgilerini alir")
    public void adminStaffBilgileriniAlir() {

        spec.pathParams("first", "api","second","staff","third",381882);

        response = given().headers("Authorization", "Bearer " + generateToken(), "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON).spec(spec).contentType(ContentType.JSON)
                .when()
                .get("/{first}/{second}/{third}");
    }

    @Then("Admin staff ID bilgilerini Api Testi ile dogrular")
    public void adminStaffIDBilgileriniApiTestiIleDogrular() {

        //VALIDATION #1 >> assertThat
        response.then().assertThat().body("firstName",equalTo(ConfigReader.getProperty("staffFirstName")));
        response.then().assertThat().body("lastName",equalTo(ConfigReader.getProperty("staffLastName")));
        response.then().assertThat().body("phone",equalTo(ConfigReader.getProperty("staffPhone")));
        response.prettyPrint();

        //VALIDATION #2 >> JSON

        JsonPath jsonPath=response.jsonPath();
        assertEquals( jsonPath.getString("firstName"),ConfigReader.getProperty("staffFirstName"));
        assertEquals( jsonPath.getString("lastName"),ConfigReader.getProperty("staffLastName"));
        assertEquals( jsonPath.getString("phone"),ConfigReader.getProperty("staffPhone"));

        //VALIDATION #3 >> MAP
        HashMap<String,Object> actualData=response.as(HashMap.class);
        assertEquals( actualData.get("firstName"),ConfigReader.getProperty("staffFirstName"));
        assertEquals( actualData.get("lastName"),ConfigReader.getProperty("staffLastName"));
        assertEquals( actualData.get("phone"),ConfigReader.getProperty("staffPhone"));


    }
}
