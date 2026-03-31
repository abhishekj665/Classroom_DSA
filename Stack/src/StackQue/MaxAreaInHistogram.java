package StackQue;

import java.util.Stack;

public class MaxAreaInHistogram {

    public static int maxField(int[] arr){
        int maxArea = 0;
        int[] nextR = new int[arr.length];
        int[] nextL = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        for(int i = arr.length - 1; i >= 0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextR[i] = arr.length;
            }else{
                nextR[i] = s.peek();
            }

            s.push(i);
        }

        s = new Stack<>();

        for(int i = 0; i < arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextL[i] = -1;
            }else{
                nextL[i] = s.peek();
            }

            s.push(i);
        }

        for(int i = 0; i < arr.length; i++){
            int height = arr[i];
            int width = nextR[i] - nextL[i] - 1;

            int currArea = height * width;

            maxArea = Math.max(maxArea, currArea);
        }

        return maxArea;

    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};

        System.out.println(maxField(arr));
    }
}
