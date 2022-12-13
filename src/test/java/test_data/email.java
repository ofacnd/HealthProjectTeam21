package test_data;

import java.util.HashMap;
import java.util.Map;

public class email {
    public Map<String, Object> expectedDataMap(Integer id, String email) {

        Map<String, Object> expectedDataMap = new HashMap<>();

        if (id != null) {
            expectedDataMap.put("id", id);
        }

        if (email != null) {
            expectedDataMap.put("email", email);
        }
        return expectedDataMap;
    }
}

