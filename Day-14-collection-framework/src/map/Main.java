package map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // put use to add key and value to map
        // we can use HashMap from Map because HashMap implement from Map
        // containKey
        // containValue
        map.put("Apple", 10);
        map.put("Banana", 5);
        map.put("Apple", 15); // Overrides previous value for "Apple"
        map.clear();
        map.put("Mango", 10);
        System.out.println(map.get("Mango"));
        int re = map.get("Mango");
        System.out.println(re);
        System.out.println(map);

        HashMap<Integer,String> maps = new HashMap<>();
        maps.put(1, "This is a hashmap");
        String result = maps.get(1);
        System.out.println(result);

        HashMap<Integer, String> maps1 = new HashMap<>(Map.of(1,"First"));
    }
}
