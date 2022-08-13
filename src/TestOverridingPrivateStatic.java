public class TestOverridingPrivateStatic extends TestSuperClass {
    public static void main(String[] args) {
        System.out.println("i am in main");
        coolStatic("J");
//        coolPrivate("J");
    }

    private void coolPrivate(String coolPrivate) {
        System.out.println("coolPrivateChild");
    }

    static void coolStatic(String coolStatic) {
        System.out.println("coolStaticChild");
    }
}
