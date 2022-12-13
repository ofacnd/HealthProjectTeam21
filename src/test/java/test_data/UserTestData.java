package test_data;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;

public class UserTestData {

//    {
//        "activated": true,
//            "authorities": [
//        "string"
//  ],
//        "createdBy": "string",
//            "createdDate": "2022-12-04T20:24:25.425Z",
//            "email": "string",
//            "firstName": "string",
//            "id": 0,
//            "imageUrl": "string",
//            "langKey": "string",
//            "lastModifiedBy": "string",
//            "lastModifiedDate": "2022-12-04T20:24:25.425Z",
//            "lastName": "string",
//            "login": "string",
//            "password": "string",
//            "ssn": "string"
//    }

    public static Map<String,Object>expectedDataforDB;//Database testinde methodu tekrar cagirmamak icin expectedData
                                                      //farkli bir map'e atandi.Hem kullanici olustururken hem de
                                                      //database testi icin call yapsak her ikisinde de farkli degerler
                                                      //uretecegi icin karsilastirma yapamayacaktik.
    public Map<String, Object> setUpTestData() {

        Faker faker = new Faker();

        String[] authorities = {""};

        Map<String, Object> expectedData = new HashMap<>();
        expectedData.put("activated", false);
        expectedData.put("authorities", authorities);
        expectedData.put("createdBy", "team83admin");
        expectedData.put("createdDate", "2022-12-04T20:24:25.425Z");
        expectedData.put("email", faker.internet().emailAddress());
        expectedData.put("firstName", faker.name().firstName());
        expectedData.put("id", 0);
        expectedData.put("imageUrl", "string");
        expectedData.put("langKey", "string");
        expectedData.put("lastModifiedBy", "string");
        expectedData.put("lastModifiedDate", "2022-12-04T20:24:25.425Z");
        expectedData.put("lastName", faker.name().lastName());
        expectedData.put("login", faker.name().firstName());
        expectedData.put("password", faker.internet().password());
        expectedData.put("ssn", faker.numerify("###-##-####"));

        expectedDataforDB = expectedData;

        return expectedData;
    }
}
