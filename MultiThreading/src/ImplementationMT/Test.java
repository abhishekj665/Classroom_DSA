package ImplementationMT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class Test {

    public static void shiftArray(int[] nums, int k){
        int n = nums.length;
        k = k % n;
        int[] elements = new int[k];
        for(int i = 0; i < k; i++){
            elements[i] = nums[i];
        }
        for(int i = 0; i < nums.length - k; i++){
            nums[i] = nums[i + k];
        }
        int idx = 0;
        for(int i = nums.length - k; i > nums.length; i++){
            System.out.println(elements[idx]);
            nums[i] = elements[idx++];
        }
        System.out.println(Arrays.toString(elements));;
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) throws InterruptedException {
        shiftArray(new int[]{1,2,3,4,5}, 2);
    }
}
