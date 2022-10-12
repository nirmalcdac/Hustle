package Interview;

public class TestMap {
    public static void main(String[] args) {
        String str = "abc";
        // (abc) a, ab, abc, b, bc, c
        // (aba) a, ab, aba, b, ba, a
        System.out.println(solution(str));
    }

    public static int solution(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            String subStr = "";
            for (int j = i; j < str.length(); j++) {
                subStr += str.charAt(j);
                count += countVowels(subStr);
            }
        }
        return count;
    }

    private static int countVowels(String subStr) {
        int count = 0;
        for (int i = 0; i < subStr.length(); i++) {
            switch (subStr.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u' -> count++;
            }
        }
        return count;
    }
}
