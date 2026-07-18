public class MaxConsecutiveFreqChar {

    public static void main(String[] args) {
        String s = "hibjholkkkkkkhjhuuuikjlk";

        char[] ch = s.toCharArray();

        int idx = 0;
        int maxLength = 1;
        char ans = 0;

        for(int i = 0; i < ch.length; i++){
            idx = i;
            int currLength = 0;
            char curr = ch[i];
            while(idx < ch.length && ch[idx] == ch[i]){
                currLength += 1;
                curr = ch[idx];
                idx++;
            }
            i = idx - 1;
           if(maxLength < currLength){
               maxLength = currLength;
               ans = curr;
           }
        }

        System.out.println(ans + " " + maxLength);


    }
}
