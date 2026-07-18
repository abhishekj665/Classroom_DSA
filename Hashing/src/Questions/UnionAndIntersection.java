package Questions;


import java.util.HashSet;

public class UnionAndIntersection {

    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};

        HashSet<Integer> inter = new HashSet<>();

        HashSet<Integer> set = new HashSet<>();

        for (int k : arr1) {
            set.add(k);
        }
        for (int j : arr2) {
            if (set.contains(j)) {
                inter.add(j);
            }

            set.add(j);
        }

        System.out.println(set);
        System.out.println(inter);
    }
}
