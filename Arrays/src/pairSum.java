import java.util.Arrays;

public class pairSum {

    public static int getSum(int[] arr){
        Arrays.sort(arr);

        int ans = 0;

        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                ans += arr[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5,3,1,8,4,2,5};

        System.out.println(getSum(arr));;
    }
}
