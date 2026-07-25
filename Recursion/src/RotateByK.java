import java.util.Arrays;

public class RotateByK {

    public static void rotateByK(int[] nums, int k){
        k %= nums.length;

        int[] rotateElement = new int[k];

        int idx = 0;

        for(int i = nums.length - k; i < nums.length; i++){
            rotateElement[idx++] = nums[i];
        }

        for (int i = nums.length - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        for(int i = 0; i < rotateElement.length; i++){
            nums[i] = rotateElement[i];
        }
    }

    public static void rotateWithK(int[] nums, int k){
        k %= nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int[] nums2 = {-1,-100,3,99};
        rotateByK(nums, 3);
        rotateWithK(nums2, 2);
        System.out.println( Arrays.toString(nums));;
        System.out.println(Arrays.toString(nums2));
    }
}
