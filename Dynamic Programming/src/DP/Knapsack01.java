package DP;

public class Knapsack01 {

    public static void main(String[] args) {
        int[] val = {15, 14, 10, 45, 30};
        int[] wt = {2, 5, 1, 3, 4};
        int n = 5;
        int capacity = 7;

        int[][] dp = new int[n + 1][capacity + 1];

        for(int i = 0; i < n + 1; i++){
            dp[i][0] = 0;
        }

        for(int j = 0; j < capacity + 1; j++){
            dp[0][j] = 0;
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= capacity; j++){
                int value = val[i - 1];
                int weight = wt[i - 1];
                if(weight <= j){
                    dp[i][j] = Math.max(value + dp[i - 1][j - weight], dp[i - 1][j]);
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

    }
}
