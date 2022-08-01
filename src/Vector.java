public class Vector {
    public static void main(String[] args) {
        java.util.Vector<Integer> v = new java.util.Vector<>();
        v.add(1);
        System.out.println("Size just after one element " + v.size());
        System.out.println("capacity just after adding  one element " + v.capacity());
        for (int i = 0; i < 5; i++) {
            v.add(i);
        }
        for (Integer integer : v) {
            System.out.println(integer);
        }

        System.out.println("Size after all elements " + v.size());
        System.out.println("capacity after adding all element " + v.capacity());
    }
}