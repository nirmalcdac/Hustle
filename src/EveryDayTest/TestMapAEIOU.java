package EveryDayTest;

import java.util.HashMap;
import java.util.Map;

public class TestMapAEIOU {
    public static void main(String[] args) {
//        System.out.println("test");
//        Write a complete java method to get count of vowels from a given string.
//        ip: "We are in interview."
//        op: {a:1, e:4 i:3, o:0, u:0}
        String str = "We are in interview.";
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 0);
        map.put("e", 0);
        map.put("i", 0);
        map.put("o", 0);
        map.put("u", 0);
        getNumberOfVowels(map, str);
    }

    private static void getNumberOfVowels(Map<String, Integer> map, String str) {
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u' ->
                        map.put(String.valueOf(str.charAt(i)), map.get(String.valueOf(str.charAt(i))) + 1);
            }
        }
        System.out.println(map.get("e"));
        map.forEach((key, value) -> System.out.println("" + key + "=" + value));
    }
}