package Questions;

import java.util.*;

public class DistinctValues {



    public static void main(String[] args) {

       int[] arr = {1,2,3,47,6,4,2,3};

       HashMap<Integer,Integer> map = new HashMap<>();

       for(int i = 0; i < arr.length; i++){
           if(!map.containsKey(arr[i])){
               map.put(arr[i], 1);
           }
       }

       for(int key : map.keySet()){
           if(map.get(key) <= 1){
               System.out.println(map.get(key));
           }
       }
    }
}
