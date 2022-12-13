package stepDefinitions.API;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import static utilities.Authentication.generateToken;

public class Basak15 {
    List<String> hastaList;
    Response response;
    @Given("{string} bilgilerini alir")
    public void bilgileriniAlir(String str) {
        String url = "https://medunna.com/api/"+str;
        response = given().headers("Authorization", "Bearer " + generateToken())
                .when()
                .get(url);
        JsonPath jsonPath=response.jsonPath();
        hastaList=jsonPath.getList("findAll{it.id}.id");
        System.out.println(hastaList);
    }

    @Then("Admin hasta bilgilerini Api Testi ile dogrular")
    public void adminHastaBilgileriniApiTestiIleDogrular() {
        assertEquals(200,response.statusCode());
        assertTrue(hastaList.toString().contains("4863"));

    }
}

