package TreeMap;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeM {

    public static void main(String[] args) {

        TreeMap<String, Integer> lh = new TreeMap<>();

        lh.put("India", 150);
        lh.put("China", 140);
        lh.put("UK", 40);

        // Key Order Maintain in insertion and retrieve data

        System.out.println(lh);
    }
}

