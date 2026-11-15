import java.util.*;

public class Solution {
    public static List<Integer> removeDuplicates(List<Integer> arr) {
        int originalSize = arr.size();
        Collections.sort(arr);

        int idx = 1;
        for (int i = 1; i < arr.size(); i++) {
            if (!arr.get(i).equals(arr.get(i - 1))) {
                arr.set(idx, arr.get(i));
                idx++;
            }
        }
        for (int i = idx; i < originalSize; i++) {
            arr.set(i, 0);
        }
        return arr;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4));
        System.out.println(removeDuplicates(list));

    }
}