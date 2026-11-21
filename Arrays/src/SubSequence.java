import java.util.*;

public class SubSequence {

    /*
    Problem Statement - We have given a array contains integer element and k as parameter, we have to find largest even sum with k elements;

    Approach - Greedy Approach

    Firstly sort the all array elements
    then iterate from n - k to n for the k largest element while adding into the sum;

    Case 1 --> if sum is even return it.

    Case 2 --> if sum if odd

                then we need to change the smallest selected even or odd number with unselected even or odd number
                cause for the largest sum we have to reduce least number from the sum
    */

    public static long getLargestSumWithK(int[] nums, int k){
        // Step 1 --> firstly sort the array

        Arrays.sort(nums);

        // Step 2 --> Initialise minimumSelectedEven and Odd with Max value and maximum Unselected Value with max.

        int minSelectedEven = Integer.MAX_VALUE;
        int minSelectedOdd = Integer.MAX_VALUE;
        int maxUnselectedEven = Integer.MIN_VALUE;
        int maxUnselectedOdd = Integer.MIN_VALUE;

        long sum = 0;

        // Step 3 --> iterate from n - k to n to get all largest element from the end

        int n = nums.length;

        for(int i = n - k; i < n; i++){
            sum += nums[i];

            // check minSelectedElement for Even and Odd

            if(nums[i] % 2 == 0){
                minSelectedEven = Math.min(minSelectedEven, nums[i]);
            }else{
                minSelectedOdd = Math.min(minSelectedOdd, nums[i]);
            }
        }

        // check if sum is even return it

        if(sum % 2 == 0) return sum;

        long option1 = -1;
        long option2 = -1;

        // Now iterate from 0 to n - k for maxUnselected element of odd and even

        for(int i = 0; i < n - k; i++){
            if(nums[i] % 2 == 0){
                maxUnselectedEven = Math.max(maxUnselectedEven, nums[i]);
            }else{
                maxUnselectedOdd = Math.max(maxUnselectedOdd, nums[i]);
            }
        }

        if (minSelectedOdd != Integer.MAX_VALUE &&
                maxUnselectedEven != Integer.MIN_VALUE) {

            option1 = sum - minSelectedOdd + maxUnselectedEven;
        }

        // Remove even, add odd
        if (minSelectedEven != Integer.MAX_VALUE &&
                maxUnselectedOdd != Integer.MIN_VALUE) {

            option2 = sum - minSelectedEven + maxUnselectedOdd;
        }

        return Math.max(option1, option2);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,5,3,6,7};
        System.out.println(getLargestSumWithK(nums, 3));
    }
}
