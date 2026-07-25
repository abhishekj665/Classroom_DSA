package Recursion_Questions;

import java.util.Arrays;

public class BasicRecursion {

    public static void printNTime(String s, int n){
        if(n == 0){
            return;
        }

        System.out.println(s);

        printNTime(s, n - 1);
    }

    public static void printOneToN(int n, int curr){
        if(n < curr){
            return;
        }
        System.out.println(curr);

        printOneToN(n , curr + 1);


    }

    public static int firstNSum(int n){
        if(n == 0){
            return 0;
        }

        return n + firstNSum(n - 1);
    }

    public static void reverseArray(int[] arr, int right, int left){
        if(left > right){
            return;
        }

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverseArray(arr, right - 1, left + 1);

    }

    public static boolean isPalindrome(String s, int left, int right){
        if(left > right){
            return true;
        }

        if(s.toLowerCase().charAt(left) != s.toLowerCase().charAt(right)){
            return false;
        }

        return isPalindrome(s, left + 1, right - 1);
    }

    public static int fibo(int n){
        if(n <= 1){
            return 1;
        }

        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        String name = "Naman";

//        printNTime(name , 5);
//
//        printOneToN(5, 1);
//        System.out.println(firstNSum(5));

        int[] arr = {1,2,3,4,5};

        reverseArray(arr, arr.length - 1, 0);

        System.out.println(Arrays.toString(arr));

        System.out.println(isPalindrome(name, 0, name.length() - 1));

        System.out.println(fibo(5));
    }
}
