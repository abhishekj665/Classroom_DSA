import java.util.Arrays;

public class Questions {

    public static int getSum(int[] arr){
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }

        return sum;
    }

    public static void getMaxAndMin(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int[] ans = new int[2];

        for(int i = 0; i < arr.length; i++){;
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }

        ans[0] = min;
        ans[1] = max;

        System.out.println(Arrays.toString(ans));
    }


    public static int getAverage(int[] arr){

        int sum = 0;

        for(int i : arr){
            sum += i;
        }

        return sum / arr.length;
    }

    public  static int getOccurrence(int[] arr, int num){
        int count = 0;
        for(int i : arr){
            if(i == num){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,4,5};

        System.out.println(getSum(arr));

        getMaxAndMin(arr);

        System.out.println(getAverage(arr));

        System.out.println(getOccurrence(arr, 7));


    }
}
