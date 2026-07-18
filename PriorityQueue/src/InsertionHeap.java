import java.util.ArrayList;
import java.util.Arrays;

import java.util.ArrayList;

public class InsertionHeap {

    static class Heap {
        static ArrayList<Integer> list = new ArrayList<>();

        public static void add(int data){
            list.add(data);
            int x = list.size() - 1; // child index
            int par = (x - 1)/2;     // parent index

            while(x > 0 && list.get(x) < list.get(par)){
                int temp = list.get(x);
                list.set(x, list.get(par));
                list.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        public static void getHeap(){
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        int[] arr = {5,4,3,2,1};

        for (int i = 0; i < arr.length; i++) {
            h.add(arr[i]);
        }

        h.getHeap(); // Output: 1 2 3 5 4
    }
}
