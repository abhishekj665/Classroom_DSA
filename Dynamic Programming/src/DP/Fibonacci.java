package DP;

import java.math.BigInteger;

public class Fibonacci {

    public static BigInteger fib(int n, BigInteger[] dp){
        if(n <= 1){
            return BigInteger.valueOf(n);
        }

        if(dp[n] != null){
            return dp[n];
        }

        BigInteger result = fib(n - 1, dp).add(fib(n - 2, dp));
        dp[n] = result;
        return result;
    }

    public static void main(String[] args) {
        int n = 100;

        BigInteger[] dp = new BigInteger[n + 1];

        for(int i = 0; i <= n; i++){
            dp[i] = null;
        }

        System.out.println(fib(n, dp));
    }
}
