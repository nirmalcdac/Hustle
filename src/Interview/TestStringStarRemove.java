package Interview;

/* You are given a strings, which contains stars*.
In one operation, you can:
* Choose a star in s.
* Remove the closest non-star character to its left, as well as remove the star itself.
Return the string after all stars have been removed.
Note:
* The input will be generated such that the operation is always possible.
* It can be shown that the resulting string will always be unique.
Example 1:
Input: s = “space**walk*er”
Output: “spawaler”
Explanation: Performing the removals from left to right:
* */
public class TestStringStarRemove {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("space**walk*er");
        System.out.println(processString(stringBuilder));
    }

    private static String processString(StringBuilder stringBuilder) {
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == '*') {
                stringBuilder.delete(i - 1, i + 1);
                i = i - 2;
            }
        }
        return stringBuilder.toString();
    }
}