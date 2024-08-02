package GooglePreperation;

public class LC1119Test {
    public static void main(String[] args) {
        LC1119 solution = new LC1119();

        // Test case 1: Empty string
        System.out.println("Test case 1: " + "".equals(solution.removeVowels("")));

        // Test case 2: String without vowels
        System.out.println("Test case 2: " + "bcdfgh".equals(solution.removeVowels("bcdfgh")));

        // Test case 3: String with only vowels
        System.out.println("Test case 3: " + "".equals(solution.removeVowels("aeiou")));

        // Test case 4: Mixed string with vowels and consonants
        System.out.println("Test case 4: " + "hll".equals(solution.removeVowels("hello")));

        // Test case 5: String with uppercase and lowercase vowels
        System.out.println("Test case 5: " + "Hll Wrld".equals(solution.removeVowels("Hello World")));

        // Test case 6: String with repeated characters
        System.out.println("Test case 6: " + "bcccddd".equals(solution.removeVowels("baeccciddd")));

        // Test case 7: Long string
        String longInput = "thisisaverylongstringwithmanyvowels";
        String longExpected = "thssvrylngstrngwthmnyvwls";
        System.out.println("Test case 7: " + longExpected.equals(solution.removeVowels(longInput)));

        // Test case 8: String with special characters and spaces
        System.out.println("Test case 8: " + "Ths s  tst!".equals(solution.removeVowels("This is a test!")));
    }
}
