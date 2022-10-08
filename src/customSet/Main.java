package customSet;

import java.util.*;

import static customSet.SetTest.*;

public class Main {
    public static void main(String[] args) {
        String str = "Engineering";
        SortedMap<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.substring(i, i + 1))) {
                map.get(str.substring(i, i + 1));
                map.replace(str.substring(i, i + 1), map.get(str.substring(i, i + 1)) + 1);
            } else {
                map.put(str.substring(i, i + 1), 1);
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> mapping : entrySet) {
            System.out.println("Key : " + mapping.getKey() + "  value : " + mapping.getValue());
        }
        Set<Node> nodes = new HashSet<>();
        nodes.add(new Node("name", "id1"));
        Iterator<Node> iterator = nodes.iterator();
        Node n;
        while (iterator.hasNext()) {
            n = iterator.next();
            System.out.println(n.name + " " + n.id);
        }
    }
}
//        Key : E  value : 1
//        Key : e  value : 2
//        Key : g  value : 2
//        Key : i  value : 2
//        Key : n  value : 3
//        Key : r  value : 1