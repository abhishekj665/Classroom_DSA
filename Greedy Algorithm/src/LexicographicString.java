import java.util.Scanner;

import java.util.*;

public class LexicographicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        char[] res = new char[n];
        Arrays.fill(res, 'a');
        int remaining = k - n;


        for (int i = n - 1; i >= 0 && remaining > 0; i--) {
            int add = Math.min(25, remaining);
            res[i] = (char) (res[i] + add);
            remaining -= add;
        }

        System.out.println("Smallest string: " + new String(res));
    }
}
