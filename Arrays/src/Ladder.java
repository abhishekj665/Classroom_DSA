import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ladder {

    // We have to find all the element which is perfect greater than all element to their right side and also the last right side element always a ladder element because it rightmost element no one element after that

    public static void findLadder(int[] arr, List<Integer> list){
        int ladder = arr[arr.length - 1];
        list.add(ladder);

        for(int i = arr.length - 2; i > 0; i--){
            if(arr[i] > ladder){
                list.add(arr[i]);
                ladder = arr[i];
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] arr = {1, 2, 5, 3, 1, 2};

        findLadder(arr, list);

        System.out.println(Arrays.toString(list.toArray()));
    }
}
