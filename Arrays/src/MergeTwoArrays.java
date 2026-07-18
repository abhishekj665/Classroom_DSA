import java.util.Arrays;

public class MergeTwoArrays {

    // Here we have a problem that we are given two sorted arrays and we have to merge them and find out the median of these sorted arrays
    public static void getMedian(int[] arr){
        int length = arr.length;
        if(length > 0 && length % 2 == 0){
            System.out.println("The median of the arrays are : " + arr[(length / 2) - 1] + " and " + arr[length / 2]);
        }else{
            System.out.println("The median of the arrays is : " + arr[length / 2]);
        }
    }

    public static int[] mergeArray(int[] arr1, int[] arr2){
        int[] mergeArray = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int idx = 0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] > arr2[j]){
                mergeArray[idx++] = arr2[j++];
            }else{
                mergeArray[idx++] = arr1[i++];
            }
        }

        while(i < arr1.length){
            mergeArray[idx++] = arr1[i++];
        }

        while(j < arr2.length){
            mergeArray[idx++] = arr2[j++];
        }

        arr1 = Arrays.copyOf(mergeArray, mergeArray.length);

        return arr1;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,4,6, 7};
        int[] arr2 = {3,5};

        arr1 = mergeArray(arr1, arr2);

        getMedian(arr1);


    }
}
