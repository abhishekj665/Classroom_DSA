public class minStep {

    public static void main(String[] args) {
        int[] arr = {10,50,20,30,10,20};
        int k = 3;

        int[][] dp = new int[arr.length][k];

        for(int i = 0; i < arr.length; i++){
            dp[i][0] = 1;
        }

        for(int i = 0; i < k; i++){
            dp[0][i] = 1;
        }

        for(int i = 2; i < dp.length; i++){
            int minCost = 0;
            for(int j = 1; j < dp[0].length; j++){
                if(dp[i][j] != 1){
                    dp[i][j] = Math.min(dp[i - 1][j - 1],dp[i - 1][j] );
                }else{

                }
            }
        }
    }
}
