public class Notorious {

    public static int[] getGroupInterval(char[] arr){
        int st = 0;
        int end = 0;
        int prevLength = 0;
        int idx = 0;
        int[] ans = new int[2];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'm'){
                st = i;
                idx = i;
                while(idx < arr.length && arr[idx] == 'm'){
                    end = idx;
                    idx++;
                }

                if((end - st + 1) > prevLength){
                    ans[0] = st;
                    ans[1] = end;
                    prevLength = end - st + 1;
                }

                i = idx - 1;

            }




        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "mmgggmmmm";

        int[] ans = getGroupInterval(s.toCharArray());

        for(int i : ans){
            System.out.println(i);
        }
    }
}
