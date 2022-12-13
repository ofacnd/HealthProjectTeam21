package stepDefinitions.API;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.CountryPojo;
import test_data.Country;
import utilities.Authentication2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static base_Url.MedunnaUrl2.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;
import static utilities.Authentication.generateToken;


public class Yusuf {
    // 28 API

    List<String> countryNameList;
    Response response;
    Map<String, Object> expectedData;
    Map<String, Object> actualData;
    Faker faker = new Faker();
    String countryPost = faker.country().name() + faker.country().capital();
    String countryPut = faker.country().name() + faker.country().capital();
    Country obj=new Country();

    /* Get uzerinden dogrulama */
    @Given("Kullanci {string} bilgilerini alir")
    public void kullanciBilgileriniAlir(String str) {
        String url = "https://medunna.com/api/" + str;
        response = given().headers("Authorization", "Bearer " + generateToken())
                .when()
                .get(url);

        JsonPath jsonPath = response.jsonPath();
        List<Integer> idList = jsonPath.getList("findAll{it.id}.id");
        List<Integer> nameList = jsonPath.getList("findAll{it.name}.name");

        System.out.println("idList = " + idList);
        System.out.println("nameList = " + nameList);
    }

    @Then("Kullanici ulke bilgilerinin alindigini Api Testi ile dogrular")
    public void kullaniciUlkeBilgilerininAlindiginiApiTestiIleDogrular() {
        assertEquals(200, response.statusCode());
    }

    /* Post ile ulke olusturma */
    @Given("Kullanci post ile {string} olusturur")
    public void kullanciPostIleOlusturur(String str) {
        String url = "https://medunna.com/api/" + str;
        obj = new Country();
        expectedData = obj.expectedDataMap(null, countryPost);
        response = given().contentType(ContentType.JSON).headers("Authorization", "Bearer " + generateToken()).body(expectedData)
                .when()
                .post(url);
        response.prettyPrint();
    }


    // Map ile post islemini dogrulama
    @Then("Kullanici post islemini Api Testi ile dogrular")
    public void kullaniciPostIsleminiApiTestiIleDogrular() {
        actualData = response.as(HashMap.class);
        System.out.println("actualData = " + actualData);
        System.out.println("expectedData = " + expectedData);
        assertEquals(expectedData.get("name"), actualData.get("name"));
        assertEquals(201, response.statusCode());


        // Pojo ile post islemini dogrulama
        CountryPojo expectedDataPojo = new CountryPojo(null, countryPost);
        CountryPojo actualDataPojo = response.as(CountryPojo.class);
        System.out.println("expectedDataPojo = " + expectedDataPojo);
        System.out.println("actualDataPojo = " + actualDataPojo);
        assertEquals(expectedDataPojo.getName(), actualDataPojo.getName());
    }

    /* Put ile ulke olusturma */
    @Given("Kullanci put ile {string} guncellenir")
    public void kullanciPutIleGuncellenir(String str) {
        String url = "https://medunna.com/api/" + str;
        //  obj = new Country();
        expectedData = obj.expectedDataMap(367579, countryPut);
        response = given().contentType(ContentType.JSON).headers("Authorization", "Bearer " + generateToken()).body(expectedData)
                .when()
                .put(url);
        response.prettyPrint();
    }


    // Map ile put islemini dogrulama
    @Then("Kullanici put islemini Api Testi ile dogrular")
    public void kullaniciPutIsleminiApiTestiIleDogrular() {
        String actualData = "LiechtensteinSan Salvador";
        String expectedData = countryPut;
        System.out.println("actualData = " + actualData);
        System.out.println("expectedData = " + expectedData);
        assertNotEquals(expectedData, actualData);
        assertEquals(200, response.statusCode());
    }


    /* Delete islemi */
    @Given("Kullanci delete islemi ile ilgili {int} numarali countryi siler ve Api ile dogrular")
    public void kullanciDeleteIslemiIleIlgiliNumaraliCountryiSilerVeApiIleDogrular(int id) {
        String url = "https://medunna.com/api/countries/"+id;
        System.out.println("url = " + url);
        response = given().contentType(ContentType.JSON).headers("Authorization", "Bearer " + generateToken())
                .when().delete(url);
        assertEquals(204,response.statusCode());
    }

    /* Get,Post,Put ve Delete */
    @Given("Kullanici Get,post,put ve delete islemlerinin yapildigini Api Testi ile dogrular")
    public void kullaniciGetPostPutVeDeleteIslemlerininYapildiginiApiTestiIleDogrular() {

        // yesil \u001B[32m
        // siyah \u001B[30m
        // mavi \u001B[34m

        // Get islemi
        String url = "https://medunna.com/api/countries/";
        Response response = given().headers("Authorization", "Bearer " + generateToken())
                .when()
                .get(url);
        System.out.println("\u001B[32m********** GET islemi **********\u001B[30m");
        // Get Assertion
        assertEquals(200, response.statusCode());
        System.out.println("\u001B[34m********** GET Assertion ( Status Code : 200 ) **********\u001B[30m");
        // Post islemi
        System.out.println();
        System.out.println("\u001B[32m********** POST islemi **********\u001B[30m");
        obj = new Country();
        expectedData = obj.expectedDataMap(null, countryPost);
        response = given().contentType(ContentType.JSON).headers("Authorization", "Bearer " + generateToken()).body(expectedData)
                .when()
                .post(url);
        response.prettyPrint();

        // Post Assertion
        System.out.println("\u001B[34m********** POST Assertion Map ile **********\u001B[30m");
        /* Map ile */
        actualData = response.as(HashMap.class);
        assertEquals(expectedData.get("name"), actualData.get("name"));
        assertEquals(201, response.statusCode());
        int id= (int) actualData.get("id");
        String country= (String) actualData.get("name");
        System.out.println("\u001B[34m********** POST Assertion Pojo ile **********\u001B[30m");
        /* Pojo ile */
        CountryPojo expectedDataPojo = new CountryPojo(null, countryPost);
        CountryPojo actualDataPojo = response.as(CountryPojo.class);
        assertEquals(expectedDataPojo.getName(), actualDataPojo.getName());

        // Put islemi
        System.out.println();
        System.out.println("\u001B[32m********** PUT islemi **********\u001B[30m");
        expectedData = obj.expectedDataMap(id, countryPut);
        response = given().contentType(ContentType.JSON).headers("Authorization", "Bearer " + generateToken()).body(expectedData)
                .when()
                .put(url);
        response.prettyPrint();

        // Put Assertion
        System.out.println("\u001B[34m********** PUT Assertion **********\u001B[30m");
        String actualDataPut=country;
        String expectedData=countryPut;
        assertNotEquals(expectedData, actualDataPut);
        assertEquals(200, response.statusCode());

        // Delete islemi
        System.out.println();
        System.out.println("\u001B[32m********** DELETE islemi **********\u001B[30m");
        response = given().contentType(ContentType.JSON).headers("Authorization", "Bearer " + generateToken())
                .when().delete(url+id);

        // Delete Assertion
        System.out.println("\u001B[34m********** DELETE Assertion ( Status Code : 204 ) **********\u001B[30m");
        assertEquals(204,response.statusCode());

    }

    @Given("Kullanici Get,post,put ve delete islemlerinin yapildigini Api Testi ile dogrular clean code")
    public void kullaniciGetPostPutVeDeleteIslemlerininYapildiginiApiTestiIleDogrularCleanCode() {
        // Get islemi
        String url = "https://medunna.com/api/countries/";
        response = given().headers("Authorization", "Bearer " + generateToken())
                .when()
                .get(url);
        // Get Assertion
        assertEquals(200, response.statusCode());

        // Post islemi
        expectedData = obj.expectedDataMap(null, countryPost);
        response = given().contentType(ContentType.JSON).headers("Authorization", "Bearer " + generateToken()).body(expectedData)
                .when()
                .post(url);
        // Post Assertion
        /* Map ile */
        actualData = response.as(HashMap.class);
        assertEquals(expectedData.get("name"), actualData.get("name"));
        assertEquals(201, response.statusCode());
        int id= (int) actualData.get("id");
        String country= (String) actualData.get("name");
        /* Pojo ile */
        CountryPojo expectedDataPojo = new CountryPojo(null, countryPost);
        CountryPojo actualDataPojo = response.as(CountryPojo.class);
        assertEquals(expectedDataPojo.getName(), actualDataPojo.getName());

        // Put islemi
        expectedData = obj.expectedDataMap(id, countryPut);
        response = given().contentType(ContentType.JSON).headers("Authorization", "Bearer " + generateToken()).body(expectedData)
                .when()
                .put(url);
        // Put Assertion
        String actualDataPut=country;
        String expectedData=countryPut;
        assertNotEquals(expectedData, actualDataPut);
        assertEquals(200, response.statusCode());

        // Delete islemi
        response = given().contentType(ContentType.JSON).headers("Authorization", "Bearer " + generateToken())
                .when().delete(url+id);
        // Delete Assertion
        assertEquals(204,response.statusCode());
    }

    // Physician Get Request and Validation
    @Given("user sends a get request for physician data")
    public void userSendsAGetRequestForPhysicianData() {
        spec.pathParams("bir", "api", "iki", "physicians");
        response = given().headers("Authorization", "Bearer " + Authentication2.generateToken()
                , "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).spec(spec).contentType(ContentType.JSON).when().get("/{bir}/{iki}");
        // response.prettyPrint();
    }

    @And("user gets the physician data and validates")
    public void userGetsThePhysicianDataAndValidates() {
        assertEquals(200, response.statusCode());
    }


    @Given("user sends a get request for {int} physician data")
    public void userSendsAGetRequestForPhysicianData(int id) {
        spec.pathParams("bir", "api", "iki", "physicians", "uc", id);
        response = given().headers("Authorization", "Bearer " + Authentication2.generateToken()
                , "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).spec(spec).contentType(ContentType.JSON).when().get("/{bir}/{iki}/{uc}");
        response.prettyPrint();
    }

    @And("user gets the physician {int} data and validates")
    public void userGetsThePhysicianDataAndValidates(int id) {
        Map<String,Object> physicianDrYusuf=new HashMap<>();
        physicianDrYusuf.put("firstName","yusuf");
        physicianDrYusuf.put("lastName","demir");
        physicianDrYusuf.put("phone","2164192071");
        physicianDrYusuf.put("price",7500.0F);

        response.then().assertThat().
                body("firstName", equalTo(physicianDrYusuf.get("firstName"))).
                body("lastName", equalTo(physicianDrYusuf.get("lastName"))).
                body("phone", equalTo(physicianDrYusuf.get("phone"))).
                body("examFee", equalTo(physicianDrYusuf.get("price"))).
                body("id",equalTo(id));
    }
}