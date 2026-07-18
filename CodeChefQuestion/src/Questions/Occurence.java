package Questions;

import java.util.HashMap;

public class Occurence {

    public static void findOccurrence(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for(int key : map.keySet()){
            System.out.println(key + " appears " + map.get(key) + " times !");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,6,7,2,6,3,5,6,8,8,6,5,3,2,1};

        findOccurrence(arr);
    }
}
