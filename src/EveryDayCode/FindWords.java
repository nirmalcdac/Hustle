package EveryDayCode;

/*
Write a Program to find the largest and smallest word in a string.
In this program, we need to find the smallest and the largest word present in the string:
I am Nirmal Sharma and I am an Indian
*/
public class FindWords {

    public static void findLargestAndSmallestWord(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input string is empty or null.");
            return;
        }

        String[] words = input.split("\\s+");
        String smallestWord = words[0];
        String largestWord = words[0];

        for (String word : words) {
            if (word.length() < smallestWord.length()) {
                smallestWord = word;
            }
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }

        System.out.println("Smallest word: " + smallestWord);
        System.out.println("Largest word: " + largestWord);
    }

    public static void main(String[] args) {
        String input = "I am Nirmal Sharma and I am an Indian";
        findLargestAndSmallestWord(input);
    }
}
