package Questions;

public class moveZero {

    public static int getNum(int num, int m){
        int lastDivisorNum = num - num % m;
        int nextDivisorNum = lastDivisorNum + m;
        return Math.abs(num - lastDivisorNum ) < Math.abs(nextDivisorNum - num) ? lastDivisorNum : nextDivisorNum;
    }

    public static void main(String[] args) {
        System.out.println(getNum(67, 8));

    }
}
