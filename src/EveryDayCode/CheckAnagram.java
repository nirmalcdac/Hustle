package EveryDayCode;

import java.util.ArrayList;
import java.util.List;

public class CheckAnagram {
    public static void main(String[] args) {
        String string = "cbaebabacd";
        String pattern = "abc";
        List<Integer> list = new ArrayList<>();
        checkForAnagram(string, pattern, list);
        System.out.println(list);
    }

    private static void checkForAnagram(String string, String pattern, List<Integer> list) {
        for (int i = 0; i < string.length() - pattern.length(); i++) {
            String substring = string.substring(i, i + pattern.length());
            int count = 0;
            for (int j = 0; j < pattern.length(); j++) {
                int k = j + 1;
                if (substring.contains(pattern.substring(j, k))) {
                    count++;
                }
            }
            if (count == pattern.length()) {
                list.add(i);
            }
//            Line 16 to 25 can be replaced by line number 28 to 32, and it will improve speed also,
//            but it's more like hardcode and not scalable
//            if (substring.contains(pattern.substring(0, 1))
//                    && substring.contains(pattern.substring(1, 2))
//                    && substring.contains(pattern.substring(2, 3))) {
//                list.add(i);
//            }
        }
    }
}