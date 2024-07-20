package GooglePreperation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC20 {
    public static void main(String[] args) {

    }

    public boolean isValidOne(String s) {
        Set<Character> hashSet = new HashSet<Character>();
        Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '}') {
                hashSet.remove('{');
            } else if (s.charAt(i) == ')') {
                hashSet.remove('(');
            } else if (s.charAt(i) == ']') {
                hashSet.remove('[');
            } else {
                hashSet.add(s.charAt(i));
            }
        }
        return hashSet.isEmpty();
    }

    public boolean isValidTwo(String s) {
        Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '}') {
                hashMap.remove('{');
            } else if (s.charAt(i) == ')') {
                hashMap.remove('(');
            } else if (s.charAt(i) == ']') {
                hashMap.remove('[');
            } else {
                if (hashMap.containsKey(s.charAt(i))) {
                    hashMap.put(s.charAt(i), (hashMap.get(s.charAt(i)) + 1));
                } else {
                    hashMap.put(s.charAt(i), 1);
                }
            }
        }
        return hashMap.isEmpty();
    }

    public boolean isValidThree(String s) {
        char c = 'A';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                c = s.charAt(i);
            } else if (s.charAt(i) == '}' && c == '{') {
                c = 'A';
            } else if (s.charAt(i) == ')' && c == '(') {
                c = 'A';
            } else if (s.charAt(i) == ']' && c == '[') {
                c = 'A';
            }
        }
        return c == 'A';
    }
}