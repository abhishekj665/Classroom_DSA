package Questions;

import java.util.*;

public class InterLeave {

    public static void interLeave(Queue<Integer> q){
        Queue<Integer> q1 = new LinkedList<>();

        int size = q.size();

        for(int i = 0; i < size/2; i++){
            q1.add(q.remove());
        }

        for(int i = 0; i < size/2; i++){
            q.add(q1.remove());
            int num = q.remove();
            q.add(num);
        }

        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            q.add(i);
        }

        interLeave(q);
    }
}
