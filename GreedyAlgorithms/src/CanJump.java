import java.lang.reflect.Array;
import java.util.*;

public class CanJump {

    public static boolean canJump(int[] nums){

        int maxPos = 0; // initial position

        for(int i = 0; i < nums.length; i++){
            if(i > maxPos){ // if i greater than current max position than it is  not possible to reach
                return false;
            }

            if(nums[i] + i > maxPos){  // whenever a jump + index > maxJump update the maxJump
                maxPos = nums[i] + i;
            }

            if(maxPos >= nums.length - 1){  // when maxJump reach to the final index
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }
}
