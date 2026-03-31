public class ReverseArray {

    static void reverseArray(int[] arr, int st, int end){
        if(st >= end){
            return;
        }

        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;

        reverseArray(arr, st + 1, end - 1);
    }

    static boolean isPalindrome(String s, int st, int end){

        if(st >= end){
            return true;
        }
        if(s.charAt(st) != s.charAt(end)){
            return false;
        }

        return isPalindrome(s, st + 1, end - 1);
    }

    public static void main(String[] args) {
     int[] arr = {1, 2, 3, 4, 5};

     String s = "Abhishek";

        reverseArray(arr, 0, arr.length - 1);

        for(int i : arr){
            System.out.print(i + " ");
        }

        System.out.println(isPalindrome(s, 0, s.length() - 1));
    }
}
