package DP;

public class LCSubstring {

    public static void main(String[] args) {

        String str1 = "ABCDE";
        String str2 = "ABCDE";

        int n = 5;
        int m = 5;

        int[][] dp = new int[n + 1][m + 1];

        for(int i = 0; i < dp.length; i++){
            dp[i][0] = 0;
        }

        for(int i = 0; i < dp[0].length; i++){
            dp[0][i] = 0;
        }

        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(str1.charAt(i - 1) == str2.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else{
                    dp[i][j] = 0;
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
