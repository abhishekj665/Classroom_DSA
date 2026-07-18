package Questions;

import java.util.HashMap;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "race";
        String s2 = "cara";
        String s3 = "cara";

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

        for(int i = 0; i < s2.length(); i++){
            if(map.containsKey(s2.charAt(i))){
                map.put(s2.charAt(i),map.get(s2.charAt(i)) - 1);
            }
        }

        for(char i : map.keySet()){
            if(map.get(i) != 0){
                System.out.println(false);
                return;
            }
        }

        System.out.println("true");


    }
}
