public class BatteryConsumption {

    public static int batteryConsumes(int[] power, int k){
        int leftBatteryPower = k / 2;
        int rightBatteryPower = ( k + 1)/2;

        int left = 0;
        int right = power.length - 1;

        while(left <= right && leftBatteryPower > 0 || rightBatteryPower > 0){
             if(leftBatteryPower > 0 && power[left] <= leftBatteryPower){
                 leftBatteryPower -= power[left];
                 power[left] = 0;
                 left++;
             }else{
                 power[left] -= leftBatteryPower;
                 leftBatteryPower = 0;
             }

             if(rightBatteryPower > 0 && power[right] <= rightBatteryPower){
                 rightBatteryPower -= power[right];
                 power[right] = 0;
                 right--;
             }else{
                 power[right] -= rightBatteryPower;
                 rightBatteryPower = 0;
             }
        }

        int count = 0;

        for(int i = 0; i < power.length; i++){
            if(power[i] == 0){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,4,5,6,4};
        int k = 8;

        System.out.println(batteryConsumes(arr, k));

    }
}
