package Implementation;

import java.util.*;

public class DequeB {
     static class Stack{
         Deque<Integer> d = new LinkedList<>();

         public void push(int data){
             d.addLast(data);
         }

         public int pop(){
             return d.removeLast();
         }

         public int peek(){
             return d.getLast();
         }
     }

    public static void main(String[] args) {
        Stack s = new Stack();

        for (int i = 1; i <= 5; i++) {
            s.push(i);
        }
     }
}
