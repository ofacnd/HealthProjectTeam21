package stepDefinitions.API;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.User;

import test_data.email;
import utilities.ConfigReader;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class Mine {
    User user;
    email email;

    Response response;
    RequestSpecification spec;


    @Given("Kullanici {string} icin \"BaseUrl\"e gider")
    public void k3_kullanici_icin_k3base_url_e_gider(String str) {
        String url = "https://medunna.com/api/users/" + str;
        response = given().headers("Authorization", "Bearer " + generateToken())
                .when()
                .get(url);
        //spec=new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty(url)).build();
    }
    @Then("Kullanici Status {string} alir")
    public void k3_kullanici_status_alir(String statusCode) {
        assertEquals(Integer.parseInt(statusCode), response.getStatusCode());
    }

    @Then("Kullanici yaniti {string} yapar")
    public void k3_kullanici_yaniti_yapar(String verify) {


        Map<String, Object> actualData=response.as(HashMap.class);

      assertEquals(ConfigReader.getProperty("login"),actualData.get("login"));
      assertEquals(ConfigReader.getProperty("firstNamim"),actualData.get("firstName"));
      assertEquals(ConfigReader.getProperty("emailim"),actualData.get("email"));
      assertEquals(ConfigReader.getProperty("ssnm"),actualData.get("ssn"));



    }
}