package DP;

public class RodCut {

    public static void main(String[] args) {

        int n = 8;
        int[] prices = {1,5,8,9,10,17,17,20};
        int[] length = {1,2,3,4,5,6,7,8};


        int[][] dp = new int[prices.length + 1][n + 1];

        for(int i = 0; i < prices.length + 1; i++){
            dp[i][0] = 0;
        }

        for(int i = 0; i < n + 1; i++){
            dp[0][i] = 0;
        }

        for(int i = 1; i < prices.length + 1; i++){
            for(int j = 1; j < n + 1; j++){
                if(length[i - 1] <= j){
                    dp[i][j] = Math.max(prices[i - 1] + dp[i][j - length[i - 1]], dp[i - 1][j]);
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        for (int[] ints : dp) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

        System.out.println("Hello_" + "\n" + "World!");
    }
}
