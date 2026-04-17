package Recursion_Questions;
import java.util.*;

public class Permutation {

    public static void printPermutation(int[] nums,List<Integer> ds, List<List<Integer>> ans, boolean[] freq ){
        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
        }

        for(int i = 0; i < nums.length; i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(nums[i]);
                printPermutation(nums, ds, ans, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};

        List<List<Integer>> list = new ArrayList<>();

        List<Integer> ds = new ArrayList<>();

        printPermutation(arr, ds,list, new boolean[arr.length] );

        System.out.println(list);
    }
}
