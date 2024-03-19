package DataStructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        // Implement map interfaces
        Map<Integer,String> hMap = new HashMap<>();
        mapUtil(hMap);

        // Using the tree map we can organize our data in order, in this case from smallest to biggest
        Map<Integer, String> haMap = new TreeMap<>();
        treeMap(haMap);
    }
    public static void mapUtil(Map<Integer, String> map) {
        map.put(101, "Bedard");
        map.put(502, "Matvei");
        map.put(22, "Alexander");
        map.put(315, "Kirill");
        map.put(750, "Nikita");

        // 2. Expose // access elements
        System.out.println("See all the keys: " + map.keySet());
        System.out.println("See all key-value pairs " + map);

        // 3. Iterating through map of key-value pairs
        for(int key : map.keySet()){
            System.out.println("KEY: " + key + " VALUE: " + map.get(key));
        }
    }

public static void treeMap(Map<Integer, String> map){

        map.put(101, "Bedard");
        map.put(502, "Matvei");
        map.put(22, "Alexander");
        map.put(315, "Kirill");
        map.put(750, "Nikita");

        // 2. Expose // access elements
        System.out.println("\n\nUsing Tree Map-----------------------------------------------------------------------");
        System.out.println("See all the keys : " + map.keySet());
        System.out.println("See all key-value pairs " + map);

    }
}
