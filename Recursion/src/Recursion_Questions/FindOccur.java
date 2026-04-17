package Recursion_Questions;

public class FindOccur {

    public static void printOccur(int[] arr, int idx, int target){
        if(idx == arr.length){
            return;
        }

        if(arr[idx] == target){
            System.out.print(idx + " ");
        }

        printOccur(arr, idx + 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {2,2,3,4,2,4,2,4,2,6,2};

        printOccur(arr, 0, 2);

    }
}
