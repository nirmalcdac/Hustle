package EveryDayCode;
/*
Given an array of strings stars, group the anagrams together. You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
Example 1:
Input: stars = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:
Input: stars = [""]
Output: [[""]]
Example 3:
Input: stars = ["a"]
Output: [["a"]]
*/

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        // Use a HashMap to store the grouped anagrams
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // Convert the string to a char array and sort it to form the key
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            // Add the original string to the corresponding group in the map
            map.computeIfAbsent(sortedStr, _ -> new ArrayList<>()).add(str);
        }

        // Return the grouped anagrams as a list of lists
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        // Example 1
        String[] stars1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(stars1));

        // Example 2
        String[] stars2 = {""};
        System.out.println(groupAnagrams(stars2));

        // Example 3
        String[] stars3 = {"a"};
        System.out.println(groupAnagrams(stars3));
    }
}

