package HashMap;

import java.util.HashMap;

public class HMap {


    public static void main(String[] args) {

        // Initializing
        HashMap<String, Integer> map = new HashMap<>();

        // Inserting
        map.put("India",150);
        map.put("China", 145);
        map.put("UK", 40);

        System.out.println(map.get("India"));

        System.out.println(map.containsKey("China"));

        System.out.println(map.containsKey("America"));

        System.out.println(map.containsValue(150));

        System.out.println(map);

        System.out.println(map.get("America"));

        System.out.println(map.size());

        // Remove
        //if exist
        System.out.println(map.remove("India"));
        // not exist
        System.out.println(map.remove("America"));

        map.clear();
        System.out.println(map.isEmpty());

        System.out.println(9 << 1);


    }
}
