import java.util.Arrays;

public class RepeatingCharacter {

    public static void main(String[] args) {
       String s = "khjbkujyfuvybujikjluyhjbnkjbh";

       char[] ch = s.toCharArray();
        Arrays.sort(ch);

       int maxFreq = 0;

       int[] arr = new int[26];

       for(int i = 0; i < s.length(); i++ ){
           char c = s.charAt(i);
           int idx = c - 'a';
           arr[idx] += 1;
       }

       int idx = 0;

       for(int i = 0; i < arr.length; i++){
          if(maxFreq < arr[i]){
              maxFreq = arr[i];
              idx = i;
          }
       }

        System.out.println(ch[idx] + " " + maxFreq);

    }
}
