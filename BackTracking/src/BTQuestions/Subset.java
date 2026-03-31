package BTQuestions;

public class Subset {

    public static void subset(String str, String ans,int i){

        //base case
        if(i == str.length()){
            System.out.println(ans);
            return;
        }

        // Recursion
        // Yes choice
        subset(str, ans + str.charAt(i), i + 1);

        //No Choice
        subset(str, ans, i + 1);
    }

    public static void main(String[] args) {

        String str = "abc";
        String ans = "";
        int i = 0;

        subset(str, ans, i);
    }
}
