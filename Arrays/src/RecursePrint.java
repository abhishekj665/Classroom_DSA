public class RecursePrint {
    public static void printNum(int p, int q, int r){
        if(p > 1){
            printNum(p - r, q + 2, r + 2);
            System.out.println(q);
        }
    }

    public static void printRev(int num){
        if(num > 0){
            System.out.printf("Hello");
            printRev(num--);
        }

    }
    public static void main(String[] args) {
        System.out.println(1 << 2 + 3 << 4);
    }
}
