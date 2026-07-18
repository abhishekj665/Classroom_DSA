package LinkedHashMap;

import java.util.*;

public class LLHashM {

    public static void main(String[] args) {

        LinkedHashMap<String, Integer> lh = new LinkedHashMap<>();

        lh.put("India", 150);
        lh.put("China", 140);
        lh.put("UK", 40);

        // Key Order Maintain in insertion and retrieve data

        System.out.println(lh);
    }
}
