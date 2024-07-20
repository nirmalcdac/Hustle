package GooglePreperation;

public class LC1119 {
    public String removeVowels(String s) {
        int j = 0;
        if (s.isEmpty()) {
            return "";
        }
        char[] charA = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o'
                    && s.charAt(i) != 'u') {
                charA[j] = s.charAt(i);
                j++;
            }
        }
        return new String(charA, 0, j);
    }
}
