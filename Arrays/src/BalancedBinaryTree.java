public class BalancedBinaryTree {

    public static void main(String[] args) {
        String s = "101001";

        int maxLength = 0;
        int ones = 0;
        int zeros = 0;



        for(int i = 0; i < s.length(); i++){
           char ch = s.charAt(i);
           if(ch == '1'){
               ones++;
           }else{
               zeros++;
           }
        }

        System.out.println(maxLength);
    }
}
