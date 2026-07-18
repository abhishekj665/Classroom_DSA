import java.util.Arrays;

public class ShallowAndDeepCopy {

    public static Integer[] copyArray(Integer[] arr){
        Integer[] newArray = arr.clone();
        return newArray;

    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};

        Integer[] newArray =  copyArray(arr);

        System.out.println(Arrays.toString(newArray));

        arr[1] = 5;

        System.out.println(Arrays.toString(newArray));
    }
}
