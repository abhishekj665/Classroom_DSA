import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class MaxOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter L : ");
        int L = sc.nextInt();

        System.out.print("Enter R : ");
        int R = sc.nextInt();

        System.out.print("Enter k : ");
        int k = sc.nextInt();
        int count = 0;

        ArrayList<Integer> odd = new ArrayList<>();

        for(int i = L; i <= R; i++){
            if(i % 2 != 0){
                odd.add(i);
                count++;
            }
        }

        if(k > count){
            System.out.println(0);;
        }else{
            System.out.println(odd.get(odd.size() - k));
        }
    }
}
