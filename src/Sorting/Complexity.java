package Sorting;

public class Complexity {
    public static void main(String[] args) {
        System.out.println("for (i = 0; i < n; i++)  -------- O(n)");
        System.out.println("for (i = 0; i < n; i = i + 2)  -------- O(n)");
        System.out.println("for (i = n; i > 1; i--)  -------- O(n)");
        System.out.println("for (i = 1; i < n; i = i * 2)  -------- O(log₂n)");
        System.out.println("for (i = 1; i < n; i = i * 3)  -------- O(log₃n)");
        System.out.println("for (i = n; i > 1; i = i / 2)  -------- O(log₂n)");

    }
}
