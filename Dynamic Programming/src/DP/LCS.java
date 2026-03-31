package DP;

public class LCS {

    public static int lcs(String str1, int n, String str2, int m, int[][] dp){
        if(n == 0 || m == 0){
            return dp[n][m] = 0;
        }

        if(dp[n][m] != -1){
            return dp[n][m];
        } else if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            dp[n][m] = lcs(str1, n - 1, str2, m - 1, dp) + 1;
            return dp[n][m];
        }else{
            int ans1 = lcs(str1, n , str2, m - 1, dp);
            int ans2 = lcs(str1, n - 1, str2, m, dp);
            return dp[n][m] = Math.max(ans2, ans1);
        }
    }

    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "aceb";

        int n = str1.length();
        int m = str2.length();

        int[][] dp = new int[n + 1][m + 1];

        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length ; j++){
                dp[i][j] = -1;
            }
        }

        System.out.println(lcs(str1, n, str2, m, dp));
    }
}
