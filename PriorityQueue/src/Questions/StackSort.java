package Questions;

import java.util.*;

public class StackSort {

    public static Stack<Integer> sortStack(Stack<Integer> s){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        while(!s.isEmpty()){
            pq.add(s.pop());
        }

        while(!pq.isEmpty()){
            s.push(pq.remove());
        }

        return s;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.add(7);
        s.add(4);
        s.add(3);
        s.add(9);
        s.add(1);

        System.out.println(sortStack(s));

    }
}
