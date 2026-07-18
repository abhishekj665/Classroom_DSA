package Classroom;

import java.util.Arrays;

public class Question3 {

    static boolean find (int[] arr){
        Arrays.sort(arr);

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] == arr[i + 1]){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,5};

        System.out.println(find(arr));

    }
}
