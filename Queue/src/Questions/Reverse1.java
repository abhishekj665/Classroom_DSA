package Questions;

import java.util.*;

public class Reverse1 {

    public static void reverse(Queue<Integer> q){
        int size = q.size();

        for(int i = 0; i < size - 1; i++){
            q.add(q.remove());
        }

        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= 5; i++){
            q.add(i);
        }

        reverse(q);
    }
}
