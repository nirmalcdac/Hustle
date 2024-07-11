package GooglePreperation;

import java.util.HashMap;

public class LC359 {
    static HashMap<String, Integer> hashMap;

    public LC359() {
        hashMap = new HashMap<>();
    }

    public static boolean shouldPrintMessage(int timestamp, String message) {
        if (hashMap.containsKey(message)) {
            if (hashMap.get(message) <= timestamp) {
                hashMap.replace(message, timestamp + 10);
                return true;
            } else {
                return false;
            }
        } else {
            hashMap.put(message, timestamp + 10);
            return true;
        }
    }
}
