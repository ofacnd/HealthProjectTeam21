package stepDefinitions.API;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.RoomPutMedunna;

import java.io.IOException;


import static base_Url.MedunnaUrl2.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;
import static utilities.Authentication2.generateToken;

public class Fatma {


    RoomPostBatch81 room = new RoomPostBatch81();
    RoomPutMedunna roomput = new RoomPutMedunna();
    Response response;
    static int putPrice;
    static int putroomNumber;

    @Given("Kullanici Get ile istegi gonderir.")
    public void kullaniciGetIleIstegiGonderir() {

        spec.pathParams("bir", "api", "iki", "rooms");//site token istedigi icin bu islemi yapiyoruz
        response = given().headers("Authorization", "Bearer " + generateToken()
                , "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).spec(spec).contentType(ContentType.JSON).when().get("/{bir}/{iki}");


    }

    @And("HTTP Durum kodu {int} omalidir.")
    public void httpDurumKoduOmalidir(int expected) {
        assertEquals(expected, response.getStatusCode());
    }

    @And("Yanit içerik turu {string} olmalidir.")
    public void yanitIcerikTuruOlmalidir(String expectedData) {
        assertEquals(expectedData, response.getContentType());
    }


    @Given("Kullanici Url'ye POST İstegi gonderir.")
    public void kullaniciUrlYePOSTistegiGonderir() {

        spec.pathParams("bir", "api", "iki", "rooms");
        //Room data olusturma
        room.setRoomNumber(374845);
        room.setRoomType("DELUXE");
        room.setDescription("Medunna 81 api model post request 234");
        room.setPrice(300);
        room.setStatus(true);
        response = given().headers("Authorization", "Bearer " + generateToken()
                , "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).spec(spec).contentType(ContentType.JSON).body(room).when().post("/{bir}/{iki}");


    }

    @Then("Kullanici dogrulama islemini yapar")
    public void kullaniciGerekliDatalariGirer() {
        response.then().assertThat().
                body("roomNumber", equalTo(room.getRoomNumber())).
                body("roomType", equalTo(room.getRoomType())).
                body("price", equalTo(room.getPrice())).
                body("status", equalTo(room.isStatus()));

        JsonPath jsonPath = response.jsonPath();
        assertEquals(jsonPath.getInt("roomNumber"), room.getRoomNumber());
        assertEquals(jsonPath.getString("roomType"), room.getRoomType());
        assertEquals(jsonPath.getInt("price"), room.getPrice());
        assertEquals(jsonPath.getBoolean("status"), room.isStatus());


    }

    @And("Status kodunun {int} oldugunu kontrol eder")
    public void statusKodununOldugunuKontrolEder(int expected) {
        assertEquals(expected, response.getStatusCode());
    }

    @Given("Kullanici Url'ye Put İstegi gonderir.")
    public void kullaniciUrlYePutistegiGonderir() {

        /*
        {
    "createdBy": "team21",
    "createdDate": "2022-12-08T18:15:07.353143Z",
    "id": 386083,
    "roomNumber": 668844,
    "roomType": "DELUXE",
    "status": true,
    "price": 700.00,
    "description": null
}
         */
        putPrice = 875;
        putroomNumber = 998765467;
        spec.pathParams("bir", "api", "iki", "rooms");
        roomput.setRoomNumber(putroomNumber);
        roomput.setRoomType("TWIN");
        roomput.setDescription("Medunna 81 api model put request 234");
        roomput.setId(386083);
        roomput.setStatus(true);
        roomput.setCreatedBy("Team21");
        roomput.setCreatedDate("2022-12-08T18:15:07.353143Z");
        roomput.setDescription("medunna healt proje odasi");
        roomput.setPrice(putPrice);
        response = given().headers("Authorization", "Bearer " + generateToken()
                , "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).spec(spec).contentType(ContentType.JSON).body(roomput).when().put("/{bir}/{iki}");


    }


    @And("Kullanici duzenledigi room bilgilerini dogrular")
    public void kullaniciDuzenledigiRoomBilgileriniDogrular() throws IOException {

        JsonPath actualData = response.jsonPath();
        actualData.prettyPrint();
        assertEquals(putPrice, actualData.getInt("price"));
        assertEquals(putroomNumber, actualData.getInt("roomNumber"));


    }

    @Given("Kullanici Url'ye Delete İstegi gonderir.")
    public void kullaniciUrlYeDeleteistegiGonderir() {

        spec.pathParams("bir", "api", "iki", "rooms", "uc", 386066);
        response = given().headers("Authorization", "Bearer " + generateToken()
                , "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).spec(spec).contentType(ContentType.JSON).when().delete("/{bir}/{iki}/{uc}");


    }


    @And("Kullanici ilgili room bilgilerinin silindigini dogrular.")
    public void kullaniciIlgiliRoomBilgilerininSilindiginiDogrular() {
        assertEquals(response.getStatusCode(), 204);
    }


}
