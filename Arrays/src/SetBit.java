public class SetBit {

    // Problem Statement - Given a number N, we have to count each set bit which is one for the number

    public static int countSetBit(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) == 1){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBit(7));
    }
}
