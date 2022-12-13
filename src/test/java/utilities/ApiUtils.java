package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class ApiUtils {


// girilen endpoint in get request ini yapan method
    public static Response getRequest(String endpoint ){

        Response response = given().headers(
                "Authorization",
                "Bearer " + generateToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get(endpoint);
        return  response;

    }
    public static Response getRequestdoktor(String token, String endpoint) {
        Response response = given().headers(
                "Authorization",
                "Bearer " + token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get(endpoint);
        return response;
    }


    //yeni data olusturma post request ile : Room icin sadece ornek olarak kullanabilirsiniz
 //  public static Response postRequest(String endpoint, Room1Post data){

 //      Response response = given().headers(
 //                      "Authorization",
 //                      "Bearer " + generateToken(),
 //                      "Content-Type",
 //                      ContentType.JSON,
 //                      "Accept",
 //                      ContentType.JSON)
 //              .body(data).contentType(ContentType.JSON).when().post(endpoint);
 //      return  response;

 //  }

 //  public static Response putRequest( String endpoint, Registrant registrant){

 //      Response response = given().headers(
 //              "Authorization",
 //              "Bearer " + generateToken(),
 //              "Content-Type",
 //              ContentType.JSON,
 //              "Accept",
 //              ContentType.JSON).contentType(ContentType.JSON).body(registrant).when().put(endpoint);


 //      return  response;

 //  }

    public static Response deleteRequest(String token, String endpoint){

        Response response = given().headers(
                "Authorization",
                "Bearer " + token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().delete(endpoint);


        return  response;

    }


}