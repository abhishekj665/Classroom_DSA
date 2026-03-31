import java.util.Arrays;

public class SubarrayDecreasing {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,3,2,1};
        int idx = 0;
        int st = 0;
        int maxLength = 1;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i + 1]){
                idx = i;
                st = i;
                while(idx < arr.length - 1 && arr[idx] > arr[idx + 1]){
                    maxLength++;
                    idx++;
                }
                break;
            }
        }

        System.out.println(maxLength);


    }
}
