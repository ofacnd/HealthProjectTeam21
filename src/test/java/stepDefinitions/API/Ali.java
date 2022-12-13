package stepDefinitions.API;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Message;


import static base_Url.MedunnaUrl2.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import static utilities.Authentication2.generateToken;

public class Ali {
    Response response;
    Message expectedDataPost;
    Message expectedDataPut;


    @Given("Kullanci mesaj bilgilerini alir")
    public void kullanciMesajBilgileriniAlir() {
        spec.pathParams("bir", "api", "iki", "c-messages");
        response = given().headers("Authorization", "Bearer " + generateToken()
                , "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).spec(spec).contentType(ContentType.JSON).when().get("/{bir}/{iki}");
        //response.prettyPrint();
    }

    @Then("Kullanici mesaj bilgilerinin alindigini Api Testi ile dogrular")
    public void kullaniciMesajBilgilerininAlindiginiApiTestiIleDogrular() {
        assertEquals(200,response.statusCode());

    }

    @Given("Kullanci post ile mesaj olusturur")
    public void kullanciPostIleMesajOlusturur() {

        spec.pathParams("bir", "api", "iki", "c-messages");
        expectedDataPost=new Message("wwwwwwssqwqqqq@gmail.com",null,"qssqq","`qdsqdq","dassdasd");
        response = given().headers("Authorization", "Bearer " + generateToken()
                , "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).spec(spec).contentType(ContentType.JSON).body(expectedDataPost).when().post("/{bir}/{iki}");

    }

    @Then("Kullanici post islemi ile Api Testini dogrular")
    public void kullaniciPostIslemiIleApiTestiniDogrular() {
        Message actualData = response.as(Message.class);
        assertEquals(actualData.getEmail(),expectedDataPost.getEmail());
        assertEquals(actualData.getName(), expectedDataPost.getName());
        assertEquals(actualData.getSubject(), expectedDataPost.getSubject());
    }
    @Given("Kullanci put ile mesaj guncellenir")
    public void kullanciPutIleMesajGuncellenir() {
        spec.pathParams("bir", "api", "iki", "c-messages");
        expectedDataPut=new Message("ydydydydbpbp@gmail.com",390764,"bpbpbp","`qdsqdq","dassdasd");
        response = given().headers("Authorization", "Bearer " + generateToken()
                , "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).spec(spec).contentType(ContentType.JSON).body(expectedDataPut).when().put("/{bir}/{iki}");

    }

    @Then("Kullanici put islemi ile Api Testini dogrular")
    public void kullaniciPutIslemiIleApiTestiniDogrular() {
        response.prettyPrint();
        Message actualData = response.as(Message.class);
        assertEquals(actualData.getEmail(),expectedDataPut.getEmail());
        assertEquals(actualData.getName(), expectedDataPut.getName());
        assertEquals(actualData.getSubject(), expectedDataPut.getSubject());
    }

    @Given("Kullanci delete islemi mesaji siler ve Api ile dogrular")
    public void kullanciDeleteIslemiIleIlgiliNumaraliMesajiSilerVeApiIleDogrular() {
        spec.pathParams("bir", "api", "iki", "c-messages","thrd",390764);

        response = given().headers("Authorization", "Bearer " + generateToken()
                , "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).spec(spec).contentType(ContentType.JSON).when().delete("/{bir}/{iki}/{thrd}");
        response.prettyPrint();
        assertEquals(204,response.statusCode());
    }
}
