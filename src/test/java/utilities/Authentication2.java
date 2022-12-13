package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;

public class Authentication2 {
    public static String generateToken() {
        RequestSpecification spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        //Set the expected data / beklenen datayi ekle
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("username", "Team21");
        data.put("password", "Team21+");
        data.put("rememberMe", true);
        //Set the url
        spec.pathParams("ilk", "api", "iki", "authenticate");
        //Send the request and get the response / Request gonder  response elde et
        Response response = given().spec(spec).contentType(ContentType.JSON).body(data).when().post("/{ilk}/{iki}");
        // response.prettyPrint();
        JsonPath json = response.jsonPath();
        // System.out.println("token : " + json.getString("id_token")); // Tokenı yazdırması icin yorum satirini kaldirmak gerekli
        return json.getString("id_token");
    }
}