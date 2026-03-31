import java.util.Arrays;
import java.util.HashMap;

public class ReverseString {



    public static void reverseWords(String s) {

        String[] arr = s.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            String str = arr[i];
            map.put(str, map.getOrDefault(str, 0) + 1);
        }




    }

    public static void main(String[] args) {
        String s = "what we think we become";

        reverseWords(s);
    }
}
