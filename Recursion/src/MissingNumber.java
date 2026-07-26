public class MissingNumber {

    public static int getMissingNumber(int[] nums){
        int n = nums.length;
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        int totalSum = 0;

        for(int i = 0; i <= n; i++){
            totalSum += i;
        }

        return totalSum - sum;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5,6,7,8,9, 10, 11, 12, 14, 15};
        System.out.println(getMissingNumber(nums));;
    }
}
