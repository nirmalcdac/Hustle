import java.util.Map;

public class TestImmutableMap {
    public static void main(String[] args) throws UnsupportedOperationException {
        Map<Integer, String> map1 = Map.of(1, "A", 2, "B", 3, "C");
        //Below Line will give UnsupportedOperationException
        map1.put(4, "D");
    }
}
