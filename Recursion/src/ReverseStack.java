import java.util.*;

public class ReverseStack {

    /*
    Problem Statement - We have to reverse a given with recursion.
     */

    public static void reverseStack(Stack<Integer> s){
        reverse(s);
    }

    private static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }

        int element = s.pop();
        reverse(s);
        insertAtBottom(s, element);
    }

    private static void insertAtBottom(Stack<Integer> s, int element){
        if(s.isEmpty()){
            s.push(element);
            return;
        }

        int top = s.pop();
        insertAtBottom(s, element);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        for(int i = 1; i <= 5; i++){
            s.push(i);
        }

        reverseStack(s);

        System.out.println(s.toString());
    }
}
