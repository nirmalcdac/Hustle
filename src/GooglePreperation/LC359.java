package GooglePreperation;

import java.util.HashMap;

public class LC359 {
    static HashMap<String, Integer> hm;

    public LC359() {
        hm = new HashMap<>();
    }

    public static boolean shouldPrintMessage(int timestamp, String message) {
        if (hm.containsKey(message)) {
            if (hm.get(message) <= timestamp) {
                hm.replace(message, timestamp + 10);
                return true;
            } else {
                return false;
            }
        } else {
            hm.put(message, timestamp + 10);
            return true;
        }
    }
}
