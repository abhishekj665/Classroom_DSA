package DP;

public class PredictTheWinner {

    /*
    Problem Statement - two player playing a game player one can pick intially from either start or end of the array element, both player can pick player optimally, we have to find that player1 win the game or not
     */

    public static boolean predictWinner(int[] nums){
        int n = nums.length;
        Integer[][] dp = new Integer[n][n];

        for(int i = 0; i < dp.length; i++){
            dp[i][i] = nums[i];
        }

        return search(nums, dp, 0, nums.length - 1) >= 0;


    }

    private static int search(int[] nums, Integer[][] dp, int i, int j){
        if(i == j){
            return nums[i];
        }

        if(dp[i][j] != null){
            return dp[i][j];
        }

        int pickLeft = nums[i] - search(nums, dp, i + 1, j);
        int pickRight = nums[j] - search(nums, dp, i, j - 1);

        dp[i][j] = Math.max(pickLeft, pickRight);

        return dp[i][j];
    }

    public static void main(String[] args) {
        int[] nums = {1,5,2};
        System.out.println(predictWinner(nums));;
    }
}
