package EveryDayCode;

public class TestGC {
    public static void main(String[] args) {
        TestGC t1 = new TestGC();
        TestGC t2 = new TestGC();
        t1 = null;
        t2 = null;
        System.gc();
    }

    public void finalise() {
        System.out.println("Garbage collection is here");
    }
}