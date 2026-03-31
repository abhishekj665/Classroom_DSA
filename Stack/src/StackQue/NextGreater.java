package StackQue;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NextGreater {

    public static int[] nextGreater(int[] arr){

        Stack<Integer> s = new Stack<>();

        int[] nextGreater = new int[arr.length];

        for(int i = arr.length - 1; i >= 0; i--){

            while( !s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = arr[s.peek()];
            }

            s.push(i);
        }

        return nextGreater;

    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,4};

        System.out.println(Arrays.toString(nextGreater(arr)));

        ArrayList<Integer> a = new ArrayList<>();




    }
}
