import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayBy90Degree {

    public static int[][] rotate(int[][] arr, int[][] ans){


        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                ans[i][j] = arr[arr.length - j - 1][i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        int[][] ans = new int[arr.length][arr[0].length];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++ ){
                arr[i][j] = sc.nextInt();
            }
        }

        rotate(arr, ans);

        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[0].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
