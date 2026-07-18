import java.util.*;

public class Sum3 {
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

        if (nums.length < 3) return new ArrayList<>();

        int i = 0;
        int j = 1;
        int k = 2;

        int s = nums.length;

        while (i < s && j < s && k < s) {
            if (i != j && i != k && j != k) {

                if ((nums[i] + nums[j] + nums[k]) == 0) {
                    List<Integer> newList = new ArrayList<>();
                    newList.add(i);
                    newList.add(j);
                    newList.add(k);



                    list.add(newList);



                }
                j++;
                i++;
                k++;
            }
        }

        return list;

    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};

        threeSum(nums);
    }
}
