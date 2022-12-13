package stepDefinitions.API;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Appointments;
import utilities.Authentication;

import static io.restassured.RestAssured.given;

public class Hatice extends Authentication {
    Appointments expectedData,actualData;
    Response response;


    @Given("Kullanici {string} nolu randevuya Get Request yapar")
    public void kullaniciNoluRandevuyaGetRequestYapar(String id) {

        response = given().header("Authorization", "Bearer " + generateToken())
                .when().get("https://medunna.com/api/appointments/" + id);
    }

    @Then("Kullanici {string} id nolu ve kullanici isimli randevu objesi olusturur")
    public void kullaniciIdNoluVeKullaniciIsimliRandevuObjesiOlusturur(String id) {

        int id_donustur= Integer.parseInt(id);
        expectedData = new Appointments("hastabasak",id_donustur);

    }

    @And("Kullanici bilgileri dogrular")
    public void kullaniciBilgileriDogrular() {

        actualData = response.as(Appointments.class);

        Assert.assertEquals(expectedData.getCreatedBy(),actualData.getCreatedBy());
        Assert.assertEquals(expectedData.getId(),actualData.getId());
        response.then().assertThat().statusCode(200);
    }
}
