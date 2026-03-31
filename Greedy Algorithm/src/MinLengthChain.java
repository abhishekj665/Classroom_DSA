import java.util.Arrays;
import java.util.Comparator;

public class MinLengthChain {

    public static int minLength(int[][] length){

        Arrays.sort(length, Comparator.comparing(o -> o[1]));

        int ans = 1;
        int lastLength = length[0][1];

        for(int i = 1; i < length.length; i++){
            if(length[i][0] >= lastLength ){
                ans++;
                lastLength = length[i][1];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] length = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        System.out.println(minLength(length));
    }
}
