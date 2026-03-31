public class mergeArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0;
        int j = 0;

        int[] ans = new int[m + n];

        int idx = 0;

        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                System.out.println(idx);
                ans[idx] = nums1[i];
                idx++;
                i++;
            }else{
                System.out.println(idx);
                ans[idx] = nums2[j];
                idx++;
                j++;
            }
        }

        while(i < m){
            ans[idx++] = nums1[i++];
        }

        while(j < n){
            ans[idx++] = nums2[j++];
        }

        for(int k = 0; k < ans.length; k++){
            nums1[k] = ans[k];
        }

    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        merge(nums1, 3, nums2, 3);
    }
}
