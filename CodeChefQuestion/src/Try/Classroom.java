package Try;

import java.util.*;

public class Classroom {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = n&1;
        System.out.println(ans);


    }

    public static void printArray(int[] arr, int a){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] + 1;
        }

        a = a + 1;

        System.out.println(Arrays.toString(arr));
        System.out.println(a);
    }
}
