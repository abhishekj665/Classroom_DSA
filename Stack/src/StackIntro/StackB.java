package StackIntro;

import java.util.ArrayList;

public class StackB {

    static class Stack{

        static ArrayList<Integer> list = new ArrayList<>();

        public  static boolean isEmpty(){
            return list.isEmpty();
        }

        // push -->
        public static void push(int data){
            list.add(data);
        }

        // pop -->
        public int pop(){

            if(isEmpty()){
                return -1;
            }

            int top = list.getLast();
            list.remove(list.getLast());

            return top;
        }

        // peek -->
        public  static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.getLast();
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

        System.out.println("Stack is empty : " + s.isEmpty());
    }
}
