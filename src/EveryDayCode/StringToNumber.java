package EveryDayCode;

public class StringToNumber {
    static int getNumber(String str) {
        int number = 0;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            number = number * 10 + charArray[i] - '0';
        }
        return number;
    }
}
