

public class Print {

    public static void printNum(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);

        printNum(n - 1);
    }

    public static void print1ToN(int num){
        if(num == 0){
            return;
        }

        print1ToN(num - 1);

        System.out.println(num);

    }

    public static void printNTime(String s, int n){
        if(n == 0){
            return;
        }

        System.out.println(s);

        printNTime(s, n - 1);
    }

    public static void main(String[] args) {
        printNum(5);
        print1ToN(5);
        printNTime("Abhishek", 5);
    }
}
