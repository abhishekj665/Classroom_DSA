
import java.util.*;

public class Hashing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int[] arr = {1, 2, 4, 2, 1,};

        int[] hash = new int[12];

        for(int i = 0; i < arr.length; i++){
            hash[arr[i]]  += 1;
        }

        System.out.print("Enter a number : ");

        int ans = sc.nextInt();

        System.out.println(hash[ans]);

        sc.close();


    }
}
