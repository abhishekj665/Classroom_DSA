package BTQuestions;

public class Permutation {

    public static void permutation(String str, String ans, int i){

        if(i == str.length()){
            System.out.println(ans);
            return;
        }

        permutation(str, ans + str.charAt(i), i + 1);
        permutation(str, ans  , i + 1 );
        permutation(str, ans + str.charAt(i), i + 1);

    }

    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        int i = 0;

        permutation(str, ans, i);
    }
}
