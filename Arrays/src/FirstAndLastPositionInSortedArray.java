import java.util.Arrays;

public class FirstAndLastPositionInSortedArray {

    /* Problem Statement - We have given an integer array and target element, we have to find first and last occurrence of
        target element;
    */

    public static int[] findOccurrence(int[] nums, int target){
        int firstOccur = findFirstOccur(nums, target); // firstly find first occurrence separately
        int lastOccur = findLastOccur(nums, target); // then second occurrence

        return new int[]{firstOccur, lastOccur};

    }

    private static int findFirstOccur(int[] nums, int target){
        int first = -1;
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] == target){
                first = mid; // if element found we have to check that is any element occurred before this element if exist then it will be our first occurrence.
                right = mid - 1;
            }

            if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return first;
    }

    private static int findLastOccur(int[] nums, int target){
        int last = -1;
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] == target){
                last = mid; // for last occurrence as well we have to find in right side so that if any element exist in right side of the array it will be our last occurrence
                left = mid + 1;
            }

            if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return last;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int[] ans = findOccurrence(nums, 8);
        System.out.println(Arrays.toString(ans));
    }
}
