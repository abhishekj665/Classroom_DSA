public class MaxWater {

    // The problem statement is that we have given height of the end of the like poll, we have to find out maximum contain water place between any two end

    public static int getMaxWater(int[] height){
        int maxWater = 0;
        int i = 0;
        int j = height.length - 1;

        while(i < j){
            int ht = Math.min(height[i], height[j]);
            int wd = j - i;
            maxWater = Math.max(maxWater, ht * wd);
            if(height[j] < height[i]){
                j--;
            }else{
                i++;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(getMaxWater(height));
    }
}
