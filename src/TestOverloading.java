public class TestOverloading {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int x = twoSum(a, b);
        System.out.println(x);
    }

    private static int twoSum(int i, int i1) {
        return i + i1;
    }

    private static int twoSum(Integer i, Integer i1) {
        return i + i1;
    }

}
