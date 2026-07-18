package Recursion_Questions;

import java.util.ArrayList;
import java.util.*;

public class SubsetSum {

    public static void getSubSetSum(int[] nums,int result, int idx, List<Integer> curr, List<List<Integer>> list){

        if(result == 0){
            list.add(curr);
            System.out.println(Arrays.toString(curr.toArray()));
            return;
        }

        if(idx == nums.length || result < 0){
            return;
        }


        curr.add(nums[idx]);
        getSubSetSum(nums, result - nums[idx], idx + 1, curr, list);
        curr.remove(curr.size() - 1);
        getSubSetSum(nums, result, idx + 1, curr, list);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int result = 5;

        List<List<Integer>> list = new ArrayList<>();

        getSubSetSum(arr, result, 0, new ArrayList<>(), list);

        System.out.println(Arrays.toString(list.toArray()));



    }
}
