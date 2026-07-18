package HashSet;

import java.util.*;

public class HSet {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(8);
        set.add(6);

        LinkedHashSet<Integer>lset = new LinkedHashSet<>();

        for(int i : set){
            lset.add(i);
        }

        System.out.println(set);

        System.out.println(lset);

        TreeSet<Integer> treeSet = new TreeSet<>();

        for(int i = 9; i > 0; i--){
            treeSet.add(i);
        }

        System.out.println(treeSet);
    }
}
