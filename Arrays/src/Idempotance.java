import java.util.*;

public class Idempotance {

    static boolean rotateString(String s, String goal){
        if(s.length() != goal.length()){
            return false;
        }

        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++){
            char add = arr[i];
            String curr = s.substring(1, arr.length) + add;
            s = curr;
            System.out.println(curr);
            if(curr.equals(goal)){
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        rotateString(s, goal);

    }

}

