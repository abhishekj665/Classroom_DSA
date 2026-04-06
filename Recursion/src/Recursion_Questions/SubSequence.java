package Recursion_Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSequence {

    public static void getSubsequence(int[] arr, ArrayList<Integer> list, int idx, int n,int s, int target){
        if(idx == n){
            if(s == target){
                System.out.println(list);
            }
            return;
        }


        list.add(arr[idx]);
        s += arr[idx];
        getSubsequence(arr, list,idx + 1, n, s, target);
        list.remove(list.size() - 1);
        s -= arr[idx];
        getSubsequence(arr, list, idx + 1, n, s,target);




    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};

        ArrayList<Integer> list = new ArrayList<>();

        getSubsequence(arr,list, 0, arr.length, 0, 3);
    }
}
