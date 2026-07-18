package Questions;

import java.util.*;
import java.util.TreeMap;

public class NextGreater {

    public static void printNextGreater(int[] arr){

        if(arr.length == 0){
            System.out.println(-1);
        }

        for(int i = 0; i < arr.length; i++){
            int greater = -1;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    System.out.print(arr[j] + " ");
                    greater = arr[j];
                    break;
                }
            }
            if(greater == -1){
                System.out.print(-1 + " ");
            }

        }

    }

    public static void main(String[] args) {
        int[] arr = {5,7,1,7,6,0};

        printNextGreater(arr);
    }
}
