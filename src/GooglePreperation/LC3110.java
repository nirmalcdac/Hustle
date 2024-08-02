package GooglePreperation;

public class LC3110 {
    public static void main(String[] args) {
        System.out.println("i am coming Google");
        String string = "hello";
        System.out.println(getScoreOfString(string));
    }

    static int getScoreOfString(String string) {
        if (string.length() < 2) {
            return 0;
        } else {
            int score = 0;
            for (int i = 0; i + 1 < string.length(); i++) {
                score = score + Math.abs((int) string.charAt(i) - (int) string.charAt(i + 1));
            }
            return score;
        }
    }
}
