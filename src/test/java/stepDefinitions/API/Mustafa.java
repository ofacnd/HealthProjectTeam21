package stepDefinitions.API;

import base_Url.MedunnaUrl;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.UserPojo;
import test_data.UserTestData;


import java.util.Map;

import static utilities.Authentication.generateToken;


public class Mustafa extends MedunnaUrl {

    UserTestData userTestData = new UserTestData();
    Map<String, Object> expectedTestData;
    Response response;

    @Given(": Kullanici API yardimi ile kayitli kisiler olusturur")
    public void kullanici_api_yardimi_ile_kayitli_kisiler_olusturur() {

        expectedTestData = userTestData.setUpTestData();

        setup();//MedunnaUrl Class'indaki method oncelikli calismadigi icin call yaptim.
        spec.pathParam("first", "/register");

        response = RestAssured.given()
                .contentType(ContentType.JSON)
                .spec(spec)
                .header("Authorization", "Bearer " + generateToken())
                .body(expectedTestData)
                .when()
                .post("/{first}");

        response.then().assertThat().statusCode(201);

        response.prettyPrint();
    }

    @Given(": Kullanici olusturulan kullanicilari API testi ile dogrular")
    public void kullanici_olusturulan_kullanicilari_api_testi_ile_dogrular() {

        UserPojo actuelData = new UserPojo();
        actuelData = response.as(UserPojo.class);
        System.out.println("actuel data: " + actuelData);

        Assert.assertEquals(expectedTestData.get("firstName"), actuelData.getFirstName());
        Assert.assertEquals(expectedTestData.get("lastName"), actuelData.getLastName());
        Assert.assertEquals(expectedTestData.get("ssn"), actuelData.getSsn());
        Assert.assertEquals(expectedTestData.get("email"), actuelData.getEmail());
        Assert.assertEquals(expectedTestData.get("activated"), actuelData.isActivated());
        Assert.assertEquals(expectedTestData.get("createdBy"), actuelData.getCreatedBy());
    }
}
