package GooglePreperation;

import java.util.*;

public class LC20 {
    public static void main(String[] args) {

    }

    public boolean isValidOne(String s) {
        Set<Character> hashSet = new HashSet<>();
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
        Map<Character, Integer> hashMap = new HashMap<>();
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

    public boolean isValidFinal(String s) {
        Stack<Character> charStack = new Stack<>();
        int count = 0;
        boolean flag = !s.isEmpty() && s.length() != 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                charStack.push(s.charAt(i));
                count++;
            } else if (s.charAt(i) == '}' && !charStack.isEmpty() && charStack.peek() == '{') {
                charStack.pop();
                count--;
            } else if (s.charAt(i) == ')' && !charStack.isEmpty() && charStack.peek() == '(') {
                charStack.pop();
                count--;
            } else if (s.charAt(i) == ']' && !charStack.isEmpty() && charStack.peek() == '[') {
                charStack.pop();
                count--;
            } else {
                flag = false;
            }
        }
        if (count > 0) {
            flag = false;
        }
        return flag;
    }
}