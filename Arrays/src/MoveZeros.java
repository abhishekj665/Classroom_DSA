
import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {
        int[] arr = {1,2,3,0, 0, 6, 7, 7};

        int i = 0;

        for(int j = 0; j < arr.length; j++){
            if(arr[j] != 0){
                arr[i++] = arr[j];
            }
        }

        while(i < arr.length){
            arr[i] = 0;
            i++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
