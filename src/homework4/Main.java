package homework4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>(32);
        HashMap<String, Integer> map3 = new HashMap<>(64, 0.5f);

        Map<String, Integer> source = new HashMap<>();
        source.put("a", 1);
        Map<String, Integer> map4 = new HashMap<>(source);
        System.out.println(map4);

        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("a", 1);
        myMap.put("b", 2);
        myMap.put("c", 3);

        System.out.println(myMap.get("a"));
        System.out.println(myMap.getOrDefault("b", 52));
        System.out.println(myMap.getOrDefault("m", 52));
        System.out.println(myMap.containsKey("c"));
        System.out.println(myMap.containsKey("m"));
        System.out.println(myMap.containsValue(1));
        System.out.println(myMap.containsValue(52));
        System.out.println(myMap.size());
        System.out.println(myMap.isEmpty());


    }
}
