package Questions;


import java.util.PriorityQueue;


public class MInRope {

    public static int minCost(int[] arr, int n){
        PriorityQueue<Integer> q = new PriorityQueue<>();

        int result = 0;

        for(int i = 0; i < n; i++){
            q.add(arr[i]);
        }

        while(q.size() > 1){
            int first = q.poll();
            if(q.isEmpty()){
                return first;
            }
            int second = q.poll();

            result += (first + second);

            q.add(first + second);

        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,6};

        System.out.println(minCost(arr, arr.length));
    }
}
