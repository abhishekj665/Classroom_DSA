import java.util.*;

public class Merge {
    public static List<Long> mergeAdjacent(int[] nums) {

        List<Long> list = new ArrayList<>();

        int st = 0;
        int next = st + 1;

        while (next < nums.length) {
            if (nums[st] == nums[next]) {
                nums[st] += nums[next];
                nums[next] = 0;
                next += 1;
            } else {
                st++;
                next++;
            }

            System.out.println(next);

        }

        for (int i = 0; i < nums.length; i++) {
            list.add((long) nums[i]);
        }

        return list;

    }

    public static void main(String[] args) {
        int[] nums = {3,1,1,2};

        System.out.println(mergeAdjacent(nums));


    }
}
