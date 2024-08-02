package EveryDayCode;

public class RemoveDuplicate {
    public static String removeDuplicates(String input) {
        boolean[] seen = new boolean[256]; // ASCII characters
        char[] inputChars = input.toCharArray();
        StringBuilder output = new StringBuilder();

        for (char c : inputChars) {
            if (!seen[c]) {
                seen[c] = true;
                output.append(c);
            }
        }

        return output.toString();
    }
}
