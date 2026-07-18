package StackQue;

import java.util.LinkedList;
import java.util.*;

public class Implementation {

    static Queue<Integer> stack = new LinkedList<>();
    static class Stack{
        int data;

        public Stack(){};

        public static void push(int data){
            stack.add(data);
            int size = stack.size();

            for(int i = 0;i < size - 1; i++){
                stack.add(stack.poll());
            }

        }

        public static int pop(){
            if(stack.isEmpty()) return -1;
            int data =  stack.poll();
            return data;
        }

        public static boolean isEmpty(){
            return stack.isEmpty();
        }

    }


    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
