public class DivisibleByNum {

    static boolean isDivisible(int num){
        int b = num % 10;
        int a = num / 10;

        if(num < 0){
            num = - num;
        }




        if(num == 0 || num == 7){
            return true;
        }

        if(num < 0){
            return false;
        }

        return isDivisible((a - (2 * b)));
    }

    public static void main(String[] args) {
        int num = 336;
        System.out.println(isDivisible(num));


    }
}
