package Classroom;

import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a student level :");
        int x = sc.nextInt();

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int[] dif = new int[n];

        for(int i = 0; i < n ; i++){
            dif[i] = sc.nextInt();
        }



        int skip = 0;

        int getAns = 0;

        for (int i = 0; i < dif.length; i++) {
            if(dif[i] <= x){
                getAns++;
            } else if (x > dif[i] ) {
                skip++;
                if(skip > 1){
                    break;
                }
            }
        }

        System.out.println(getAns);

    }
}
