public class FirstToCompleteRides {


        public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                      int[] waterStartTime, int[] waterDuration) {

            int minLandFinish = Integer.MAX_VALUE;
            for (int i = 0; i < landStartTime.length; i++) {
                minLandFinish = Math.min(minLandFinish,
                        landStartTime[i] + landDuration[i]);
            }

            int ans = Integer.MAX_VALUE;


            for (int i = 0; i < waterStartTime.length; i++) {
                int finish = Math.max(minLandFinish, waterStartTime[i]) + waterDuration[i];
                ans = Math.min(ans, finish);
            }

            int minWaterFinish = Integer.MAX_VALUE;
            for (int i = 0; i < waterStartTime.length; i++) {
                minWaterFinish = Math.min(minWaterFinish,
                        waterStartTime[i] + waterDuration[i]);
            }


            for (int i = 0; i < landStartTime.length; i++) {
                int finish = Math.max(minWaterFinish, landStartTime[i]) + landDuration[i];
                ans = Math.min(ans, finish);
            }

            return ans;
        }



}
