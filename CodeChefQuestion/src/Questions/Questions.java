package Questions;

import java.util.HashMap;
import java.util.HashSet;

public class Questions {

    public static String convertString(String s){
        HashMap<Character, Integer> map  = new HashMap<>();

        String ans = new String();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) +  1);
        }

        for(char ch : map.keySet()){

            ans += ch;

            if(map.get(ch) > 1){
                ans += map.get(ch);
            }

        }

        s = ans;

        return s;


    }

    public static void main(String[] args) {
        String  s = "abbbbhhhkkkll";

        System.out.println(convertString(s));
    }
}
