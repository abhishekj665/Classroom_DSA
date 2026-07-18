public class BitManipulation {

    public static void main(String[] args) {
        int num = 7;
        int target = 15;
        int ans = num ^ target;
        int count = 0;
        while(ans > 0){
            ans = ans & (ans - 1);
            count++;
        }
        System.out.println(count);
    }
}
