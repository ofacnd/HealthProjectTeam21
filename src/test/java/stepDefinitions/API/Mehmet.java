package stepDefinitions.API;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import static base_Url.MedunnaUrl2.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static utilities.Authentication.generateToken;

public class Mehmet {
    Response response;
    @Given("user sends a get request for appointment data")
    public void userSendsAGetRequestForAppointmentData() {
        spec.pathParams("first", "api", "second", "appointments");
        response = given().headers("Authorization", "Bearer " + generateToken()
                , "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).spec(spec).contentType(ContentType.JSON).when().get("/{first}/{second}");
        //response.prettyPrint();
    }


    @And("user gets the appointment data and validates")
    public void userGetsTheAppointmentDataAndValidates() {

        Assert.assertEquals(200,response.getStatusCode());


    }

    @Given("user sends a get request id for appointment data")
    public void userSendsAGetRequestIdForAppointmentData() {

        spec.pathParams("first", "api", "second", "appointments","third",385882);
        response = given().headers("Authorization", "Bearer " + generateToken()
                , "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).spec(spec).contentType(ContentType.JSON).when().get("/{first}/{second}/{third}");
        response.prettyPrint();

        Assert.assertEquals(200,response.getStatusCode());


    }

    @And("user gets the appointment data and first name,last name,email validates")
    public void userGetsTheAppointmentDataAndFirstNameLastNameEmailValidates() {
        response.then().assertThat().
                body("patient.firstName",equalTo("hasta")).
                body("patient.lastName",equalTo("kemal")).
                body("patient.email",equalTo("hastakemal12@gmail.com"));

    }
}
