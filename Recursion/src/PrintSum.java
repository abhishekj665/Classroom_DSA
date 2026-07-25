import java.util.Scanner;

public class PrintSum {

    public static int getSum(int n){
        if(n == 1){
            return n;
        }

        return n + getSum(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");

        int n = sc.nextInt();

        System.out.println(getSum(n));

    }
}
