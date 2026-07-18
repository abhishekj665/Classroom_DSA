import java.util.ArrayList;

public class Questions {

    public static void main(String[] args) {
        int[] st = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};

        ArrayList<Integer> ans = new ArrayList<>();

        int maxAct = 1;
        ans.add(end[0]);

        int lastEnd = end[0];

        for(int i = 1; i < st.length; i++){
            if(st[i] >= lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println(maxAct);

        int total = 0;

        for (Integer an : ans) {
            total += an;
        }

        System.out.println(total);
    }
}
