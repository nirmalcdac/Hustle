package EveryDayCode;

public class TestTry {
    public static void main(String[] args) {
        try {
            System.exit(0);
        } finally {
            System.out.println("finally");
        }
    }
}
