package StackwithCF;

import java.util.*;

public class StackB {

    public static void bottomPush(Stack<Integer> s, int data){

        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();

        bottomPush(s, data);

        s.push(top);
    }

    public static String reverseString(String str){

        Stack<Character> s = new Stack<>();
        int idx = 0;

        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder newStr = new StringBuilder();

        while(!s.isEmpty()){
            char ch = s.pop();
            newStr.append(ch);
        }

        return newStr.toString();
    }

    public static void main(String[] args) {

//        Stack<Integer> s = new Stack<>();
//
//
//
//        s.push(1);
//        s.push(2);
//        s.push(3);
//
//        System.out.println(s.isEmpty());
//
//        bottomPush(s, 4);
//
//        while(!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();
//        }

         String s = "Abhishek";

        System.out.println(reverseString(s));


    }
}
