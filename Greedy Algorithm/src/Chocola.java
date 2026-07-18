import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Chocola {

    public static void main(String[] args) {

        int n = 4;
        int m = 6;

        Integer[] costHr = {2,1,3,1,4};
        Integer[] costVr = {4,1,2};

        Arrays.sort(costHr, Collections.reverseOrder());
        Arrays.sort(costVr, Collections.reverseOrder());

        int h = 0;
        int v = 0;
        int hp = 0, vp = 0;

        int totalCost = 0;

        while(h < costHr.length && v < costVr.length){
            if(costVr[v] <= costHr[h]){
                totalCost += (costHr[h] * vp );
                v++;
                vp++;
            }else{
                totalCost += (costVr[v] * hp);
                h++;
                hp++;
            }
        }

        while(h < costHr.length){
            totalCost += (costHr[h] * vp);
            h++;
            hp++;
        }

        while(v < costVr.length){
            totalCost += (costVr[v] * hp);
            v++;
            vp++;
        }

        System.out.println(totalCost);
    }
}
