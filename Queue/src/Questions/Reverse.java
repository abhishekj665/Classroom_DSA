package Questions;

import java.util.*;

public class Reverse {

    public static void reverseQueue(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.add(q.remove());
        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }

        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= 5; i++) {
            q.add(i);
        }

        reverseQueue(q);

        Deque<Integer> d = new LinkedList<>();
    }
}
