class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int ans = -1;
        for(int i = 0;i < nums1.length ; i++){
            for(int j = 0;j < nums2.length ; j++){
                if(nums1[i] < nums2[j]){
                    break;
                }
                if(nums1[i] == nums2[j]){
                    ans = nums1[i];
                    break;
                }
            }
            if(ans != -1 ){
                break;
            }
        }
        return ans;
    }
}
