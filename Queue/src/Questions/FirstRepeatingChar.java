package Questions;

import java.util.*;

public class FirstRepeatingChar {

    public static int firstNonRepeatingLetter(String str){
        Queue<Integer> q = new LinkedList<>();

        int[] freq = new int[26];

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            freq[ch - 'a']++;
            q.add(i);

            while(!q.isEmpty() && freq[str.charAt(q.peek()) - 'a'] > 1){
                q.remove();
            }


        }
        if(q.isEmpty()){
            return -1;
        }else{
            return q.peek();
        }


    }

    public static void main(String[] args) {
        String str = "aabccxb";

        System.out.println(firstNonRepeatingLetter(str));
    }
}
