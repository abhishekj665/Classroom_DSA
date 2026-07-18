public class BalancedSubstring {

    public static void main(String[] args) {
        String str = "LLRRLR";
        int substringCount = 0;

        int L = 0;
        int R = 0;

        for(int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);
            if(curr == 'L'){
                L++;
            }else{
                R++;
            }

            if(L == R){
                substringCount++;
            }
        }

        System.out.println(substringCount);
    }
}
