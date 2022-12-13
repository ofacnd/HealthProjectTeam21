package stepDefinitions.API;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import com.google.gson.Gson;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.Test_Item;
import utilities.ConfigReader;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import static base_Url.MedunnaUrl2.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;
import static utilities.Authentication.generateToken;

public class Fatih {
    static Faker faker = new Faker();
    //  static String  fakerName  =  faker.name().fullName();
    // static String fakerDescription  =  faker.address().country();
    Test_Item expectedData;
    Test_Item actualData;
    Response response;

    //   >>>>    GET     <<<<<<

    @Given("Kullanci test item bilgilerini alir")
    public void kullanciTestItemBilgileriniAlir() {
        String url = "https://medunna.com/api/c-test-items";
        response = given().headers("Authorization", "Bearer " + generateToken())
                .when()
                .get(url);
        JsonPath jsonPath = response.jsonPath();

        List<Integer> idList = jsonPath.getList("findAll{it.id}.id");
        List<String> createdByList = jsonPath.getList("findAll{it.createdBy}.createdBy");
        List<Integer> nameList = jsonPath.getList("findAll{it.name}.name");

        System.out.println("idList = " + idList);
        System.out.println("createdByList = " + createdByList);
        System.out.println("nameList = " + nameList);
    }


    @Then("Kullanici test item bilgilerinin alindigini Api Testi ile dogrular")
    public void kullaniciTestItemBilgilerininAlindiginiApiTestiIleDogrular() {

        assertEquals(200, response.statusCode());

    }

    //   >>>>      P O S T       <<<<<<
    @Given("Kullanci post ile test item olusturur")
    public void kullanciPostIleTestItemOlusturur() {
        String url = "https://medunna.com/api/c-test-items";
        expectedData = new Test_Item(null, null, null, faker.name().fullName(), faker.address().country(), "236", "136", "1250");
        response = given().contentType(ContentType.JSON).headers("Authorization", "Bearer " + generateToken()).body(expectedData).when().post(url);
        response.prettyPrint();
    }

    @Then("Kullanici post islemini test item icin Api Testi ile dogrular")
    public void kullaniciPostIsleminiTestItemIcinApiTestiIleDogrular() throws IOException {

        actualData = response.as(Test_Item.class);
        System.out.println("expectedData = " + expectedData);
        System.out.println("actualData = " + actualData);

        //   Validation #1  >>  POJO ile
        assertEquals(201, response.getStatusCode());
        assertEquals(expectedData.getDefaultValMax(), actualData.getDefaultValMax());
        assertEquals(expectedData.getDescription(), actualData.getDescription());
        assertEquals(expectedData.getName(), actualData.getName());


        //   Validation #2  >>  Object Mapper
        ObjectMapper mapper = new ObjectMapper();
        Test_Item actualDataObjectMapper = mapper.readValue(response.asString(), Test_Item.class);
        assertEquals(expectedData.getDefaultValMax(), actualDataObjectMapper.getDefaultValMax());
        assertEquals(expectedData.getDescription(), actualDataObjectMapper.getDescription());
        assertEquals(expectedData.getName(), actualDataObjectMapper.getName());


        // Validation  #3  >>    GSON
        Gson gson = new Gson();
        Test_Item actualDataGson = gson.fromJson(response.asString(), Test_Item.class);
        assertEquals(expectedData.getDefaultValMax(), actualDataGson.getDefaultValMax());
        assertEquals(expectedData.getDescription(), actualDataGson.getDescription());
        assertEquals(expectedData.getName(), actualDataGson.getName());
    }

    //   >>>>      P U T     <<<<<<
    @Given("Kullanci put ile test item guncellenir")
    public void kullanciPutIleTestItemGuncellenir() {
        String url = "https://medunna.com/api/c-test-items";
        expectedData = new Test_Item(null, null, 367619, faker.name().fullName(), faker.address().country(), "654", "987", "1250");
        response = given().contentType(ContentType.JSON).headers("Authorization", "Bearer " + generateToken()).body(expectedData).when().put(url);
        response.prettyPrint();
    }

    @Then("Kullanici put islemini test item icin Api Testi ile dogrular")
    public void kullaniciPutIsleminiTestItemIcinApiTestiIleDogrular() {
        String price = "336";
        String defaultValMin = "720";

        assertEquals(200, response.getStatusCode());
        assertNotEquals(expectedData.getPrice(), price);
        assertNotEquals(expectedData.getDefaultValMin(), defaultValMin);
    }

    //   >>>>      D E L E T E     <<<<<<
    @Given("Kullanci delete islemi ile ilgili {int} numarali test itemi siler ve Api ile dogrular")
    public void kullanciDeleteIslemiIleIlgiliNumaraliTestItemiSilerVeApiIleDogrular(int id) {

        String url = "https://medunna.com/api/c-test-items/" + id;
        response = given().contentType(ContentType.JSON).headers("Authorization", "Bearer " + generateToken()).when().delete(url);
        response.prettyPrint();
        assertEquals(204, response.getStatusCode());


    }

    //              > > > > >    US_009     GET     < < < < < < <
    @Given("Kullanici hasta bilgilerini alir")
    public void kullaniciHastaBilgileriniAlir() {
        spec.pathParams("first", "api", "second", "patients", "third", 304172);
        response = given().headers("Authorization", "Bearer " + generateToken()).
                spec(spec).
                contentType(ContentType.JSON).
                when().get("/{first}/{second}/{third}");
    }


    @Then("Kullanici hasta bilgilerinin alindigini Api Testi ile dogrular")
    public void kullaniciHastaBilgilerininAlindiginiApiTestiIleDogrular() {

        response.prettyPrint();

        //Validation #1  >>    assertThat()
        response.then().assertThat().statusCode(200).
                body("firstName", equalTo(ConfigReader.getProperty("patientFirstName")),
                        "lastName", equalTo(ConfigReader.getProperty("patientLastName")),
                        "email", equalTo(ConfigReader.getProperty("patientEmail")));

        //Validation #2  >>    jsonPath
        JsonPath jsonPath = response.jsonPath();
        assertEquals(jsonPath.getString("firstName"), ConfigReader.getProperty("patientFirstName"));
        assertEquals(jsonPath.getString("lastName"), ConfigReader.getProperty("patientLastName"));
        assertEquals(jsonPath.getString("email"), ConfigReader.getProperty("patientEmail"));

        //Validation #3  >>    Maps
        HashMap<String, Object> actualData = response.as(HashMap.class);
        assertEquals(actualData.get("firstName"), ConfigReader.getProperty("patientFirstName"));
        assertEquals(actualData.get("lastName"), ConfigReader.getProperty("patientLastName"));
        assertEquals(actualData.get("email"), ConfigReader.getProperty("patientEmail"));
    }

    @Given("Kullanici Test Item Uzerinde Get,post,put ve delete islemlerinin yapildigini Api Testi ile dogrular")
    public void kullaniciTestItemUzerindeGetPostPutVeDeleteIslemlerininYapildiginiApiTestiIleDogrular() {

        //   US_17 Komple Test  >>  Sirali tum testlerin olusuturlmasi.
        String url = "https://medunna.com/api/c-test-items/";   //Web sitesine erisiyoruz.
        response = given().headers("Authorization", "Bearer " + generateToken())   //  Burada siteden yetki alip veri tabanina erisiyoruz.
                .when()
                .get(url);
        assertEquals(200, response.getStatusCode());  // Girisi dogruluyoruz. Verilerere erisebildigimizi StatusCod`un 200 oldugunu dogruluyoruz.
        //  POST>>  bu noktada faker ile yeni veriler gonderildi (name ve description)
        expectedData = new Test_Item(null, null, null, faker.name().fullName(), faker.address().country(), "236", "136", "1250");
        response = given().contentType(ContentType.JSON).headers("Authorization", "Bearer " + generateToken()).body(expectedData).when().post(url);

        //  POST islemi sonrasi olusturulan yeni veriler alindi;
        actualData = response.as(Test_Item.class);
        int id = actualData.getId();     //   PUT islemi icin gecerli id kayit edildi. Bir asagidaki adimda kullanildi.
        assertEquals(201, response.getStatusCode());  //   201 kodu ile POST islemi dogrulandi.
        expectedData = new Test_Item(null, null, id, faker.name().fullName(), faker.address().country(), "654", "987", "1250");


        //Erisilen verinin guncellemesi icin erisim izni alindi.
        response = given().contentType(ContentType.JSON).headers("Authorization", "Bearer " + generateToken()).body(expectedData).when().put(url);

        //   PUT islemi sonrasi dogrulama yapildi.
        assertEquals(200, response.getStatusCode());
        // System.out.println("expectedData = " + expectedData);
        // System.out.println("actualData = " + actualData);
        assertNotEquals(expectedData.getName(), actualData.getName());
        assertNotEquals(expectedData.getDescription(), actualData.getDescription());

// DELETE
        response.prettyPrint();
        response = given().contentType(ContentType.JSON).headers("Authorization", "Bearer " + generateToken()).when().delete(url+id);
        assertEquals(204, response.getStatusCode());

    }
}
