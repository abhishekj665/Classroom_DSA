package Classroom;

public class Question4 {

    static int addSome(int num){
        int n = num;
        int sum = 0;

        while(n > 0){
            int lastDigit = n % 10;
            n = n / 10;
            sum += lastDigit;
        }

        return sum;
    }

    public static void main(String[] args) {
        int num = 1234;

        System.out.println(addSome(num));
    }
}
