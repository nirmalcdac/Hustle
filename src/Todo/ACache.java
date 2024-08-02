package Todo;

import java.util.HashMap;
import java.util.Map;

public class ACache {
    int size = 100;
    Map<String, String> map = new HashMap<>();

    public String getVal(String key) {
        if (map.size() == 0) {
            return null;
        } else {
            return map.getOrDefault(key, null);
        }
    }

    public String putVal(String key, String val) {
        if (map.size() < size) {
            String str = map.get(key);
            map.put(key, val);
            return str;
        } else {
            return "Map is full";
        }

    }
}
