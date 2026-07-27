import java.util.*;

public class GenerateBinaryString {

    /*
    Problem Statement - We have to generate all combination of binary string without consecutive 1's of n length
     */

    public static List<String> generateString(int n){
        List<String> list = new ArrayList<>();
        generate("", n, list );
        return list;
    }

    private static void generate(String curr, int n, List<String> list){
        if(curr.length() == n){
            list.add(curr);
            return;
        }

        generate(curr + "0", n, list);

        if(curr.isEmpty() || curr.charAt(curr.length() - 1) != '1'){
            generate(curr + "1", n, list);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        List<String> list = generateString(5);
        System.out.println(list.toString());

    }
}
