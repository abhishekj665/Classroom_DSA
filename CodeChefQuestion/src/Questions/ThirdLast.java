package Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class ThirdLast {

    public static char getThirdLast(String s){

        int count = 0;

        ArrayList<Character> list =
                new ArrayList<>(Arrays.asList('a','e','i','o','u'));

        for(int i = s.length() - 1; i >= 0; i--){

            char ch = s.charAt(i);

            if(!list.contains(ch)){

                count++;

                if(count == 3){
                    return ch;
                }
            }
        }

        return ' ';
    }


    public static void main(String[] args) {
        String s = "avgfdnbdkjbbfoejhwbbefl";

        System.out.println(getThirdLast(s));
    }
}
