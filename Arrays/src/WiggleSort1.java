import java.util.Arrays;

public class WiggleSort1 {

    /*  Problem Statement -
        We have given integer unordered element of array we have to arrange the element in such format that nums[0] <= nums[1] >= nums[2] <= nums[3]...and so on
        intuition of the problem we can observe that every even index element should be less than or equal to it is adjacent element and odd index element should be greater than equal to it is adjacent element.
     */

    public static int[] wiggleSort(int[] nums){
        for(int i = 1; i < nums.length; i++){
            if((i % 2 == 0 && nums[i] > nums[i - 1]) || (i % 2 == 1 && nums[i] < nums[i - 1])){
                swap(nums, i, i - 1);
            }
        }

        return nums;
    }
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
