package EveryDayTest;

public class TestPalindrom {
    public static void main(String[] args) {
//        String str = "baabaabaab";
//        String str = "abcd";
//        String str = "aba";
//        String str = "abracadabra";
        String str = "abba";
        System.out.println(checkPalindrome(str));
    }

    private static boolean checkPalindrome(String str) {
        boolean flag = true;
        int j = str.length() - 1;
        for (int i = 0; i < str.length() / 2; ) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                flag = false;
                break;
            }
            if (j - i <= 2) {
                break;
            }
        }
        return flag;
    }
}
