package test_data;

import java.util.HashMap;
import java.util.Map;

public class User {

    public Map<String, Object> expectedDataMap(Integer id, String uname) {

        Map<String, Object> expectedDataMap = new HashMap<>();

        if (id != null) {
            expectedDataMap.put("id", id);
        }

        if (uname != null) {
            expectedDataMap.put("uname", uname);
        }
        return expectedDataMap;
    }
}