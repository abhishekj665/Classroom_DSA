package DP;

public class ClimbingStairs {

    public static int ways(int n, int[] steps){
        if(n == 1 || n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }

        if(steps[n] != -1){
            return steps[n];
        }

        steps[n] = ways(n - 1, steps) + ways(n - 2, steps);

        return steps[n];

    }

    public static void main(String[] args) {
        int n = 3;

        int[] steps = new int[n + 1];

        for(int i = 0; i <= n; i++){
            steps[i] = -1;
        }

        System.out.println(ways(n, steps));
    }
}
