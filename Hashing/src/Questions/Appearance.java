package Questions;


import java.util.HashMap;

public class Appearance {

    public static void main(String[] args) {
        int[] arr = {1,1,2,4,5,6,3,2,13,2,1,2,3};


        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) >= 3) {
                System.out.print(key + " ");
            }
        }


    }
}
