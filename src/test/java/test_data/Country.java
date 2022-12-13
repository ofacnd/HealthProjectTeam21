package test_data;

import java.util.HashMap;
import java.util.Map;

public class Country {
    public Map<String, Object> expectedDataMap(Integer id, String name) {

        Map<String, Object> expectedDataMap = new HashMap<>();

        if (id != null) {
            expectedDataMap.put("id", id);
        }
        if (name != null) {
            expectedDataMap.put("name", name);
        }
        return expectedDataMap;
    }
}