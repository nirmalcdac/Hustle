package EveryDayCode;

public class CustomStackDriver {
    public static void main(String[] args) {
        CustomStack cs = new CustomStack();
        cs.push("a");
        cs.push("b");
        cs.push("c");
        cs.push("d");
        cs.pop();
        System.out.println(cs.peek());
        System.out.println(cs.peek());
    }
}
