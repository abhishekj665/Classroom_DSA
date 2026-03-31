public class StrictSubarray {

    public static int getSubarray(int[] arr){
        int ans = 1;
        int maxLength = 1;


        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i + 1]){
                maxLength += 1;

            }else{
                maxLength = 1;
            }

            ans = Math.max(ans, maxLength);
        }

        return ans;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4};
        int[] arr2 = {2,3,5,5,6,7,8};

        System.out.println(getSubarray(arr));
    }
}
