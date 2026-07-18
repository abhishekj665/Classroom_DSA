package DP;

public class TargetSum {

    public static void main(String[] args) {
        int[] nums = {4, 2, 7, 1, 3};
        int target = 7;

        int[][] dp = new int[nums.length + 1][nums.length + 1];

        for(int i = 0; i < nums.length + 1; i++){
            dp[i][0] = 0;
        }

        for(int j = 0; j < nums.length + 1; j++){
            dp[0][j] = 0;
        }

        for(int i = 1; i <= dp.length; i++){
            for(int j = 1; j <= dp[0].length; j++){
                int num = nums[i - 1];
                int max = nums[i];
            }
        }
    }
}
