package Questions;

public class SquareRoot {

    public static int squareRoot(int num){
        int st = 1;
        int end = num;
        int ans = 0;

        while(st < end){
            int mid = st + (end - st)/2;

            long sq = mid * mid;

            if(sq == num){
                return mid;
            }else if(sq < num){
                ans = mid;
                st = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int num = 28;
        System.out.println(squareRoot(num));
    }
}
