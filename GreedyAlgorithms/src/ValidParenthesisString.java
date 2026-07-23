public class ValidParenthesisString {

    /*
    Problem Statement - We have given a string contain of left , right parenthesis and the start, we have to find out that the string contains valid parenthesis or not
    Condition of valid parenthesis if
    Each left parenthesis have it's closing right parenthesis
    We can assume star as right or left parenthesis or string to neutralize parenthesis as required;
     */

    public static boolean isValidParenthesis(String s, int idx, int count){ // take three parameter for recursion String , index, and count
        // base case 1 - if count goes to below zero return false that mean closing braces count becomes more than opening braces so the parenthesis is not valid
        if(count < 0){
            return false;
        }
        // base case 2 - if index reach out of string length check that count if zero or not
        if(idx == s.length()){
            return count == 0;
        }

        // condition 1 - if opening braces increase count with 1 and idx also and send to recursive function;

        if(s.charAt(idx) == '('){
            return isValidParenthesis(s, idx + 1, count + 1);
        }else if(s.charAt(idx) == ')'){ // if closing braces count decreases and index increases
            return isValidParenthesis(s, idx + 1, count - 1);
        }else{ // if star then check for all three condition with recursive function such that
            return isValidParenthesis(s, idx + 1, count + 1) || isValidParenthesis(s, idx + 1, count - 1) || isValidParenthesis(s, idx + 1, count);
        }

    }

    // Optimal Approach by using range

    public static boolean isValidParenthesis(String s){
        int min = 0; // take two variable as range  of unmatched parenthesis
        int max = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){ // if open brace increase both range
                min++;
                max++;
            }else if(ch == ')'){
                min--;
                max--; // if closing brace decrease both range
            }else{
                min--;
                max++; // if star then two thing possible close or open brace so if close min decreases or if open max increases
            }

            if(min < 0) min = 0; // any point min decrease less than zero make it zero

            if(max < 0) return false; // if any point max become less than zero return false because at any point if max less than zero that mean there no close brace before this
        }

        return min == 0;
    }

    public static void main(String[] args) {
        String s = "(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())\"";

        System.out.println(isValidParenthesis(s, 0, 0));

        System.out.println(isValidParenthesis(s));


    }
}
