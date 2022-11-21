package EveryDayCode;

import java.util.HashMap;
import java.util.Map;

public class TestMapBracketCombination {
    public static void main(String[] args) {
        String str = "{{[[}}((]]))";
        System.out.println(checkString(str));
    }

    private static Boolean checkString(String str) {
        if (str.length() % 2 != 0) {
            return false;
        } else {
            Map<Character, Integer> map = new HashMap<>();
            map.put('{', 0);
            map.put('}', 0);
            map.put('[', 0);
            map.put(']', 0);
            map.put('(', 0);
            map.put(')', 0);
            for (int i = 0; i < str.length(); i++) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() % 2 != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}