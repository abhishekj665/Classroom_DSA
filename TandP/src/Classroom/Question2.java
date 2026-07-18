package Classroom;

public class Question2 {

    static int findMissing(int[] arr){
        int target = 5;

        int st = 0;
        int end = arr.length - 1;

        while(st < end){

            int mid = st + (end - st)/2;


            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] > target){
                end = mid - 1;
            }else{
                st = mid + 1;
            }
        }

        return st;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7};

        System.out.println(findMissing(arr));

    }
}
