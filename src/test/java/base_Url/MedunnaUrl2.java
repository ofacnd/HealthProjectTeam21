package base_Url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
public class MedunnaUrl2 {
    public static RequestSpecification spec;
    public static void medunnaSetup(){
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
    }
}