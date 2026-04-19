class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] LeftMax = new int[n];
        int[] RightMax = new int[n];

        LeftMax[0] = nums[0];
        
        for(int i = 1 ; i < n ; i++ ){
            LeftMax[i] = Math.max(nums[i], LeftMax[i-1]);
        }
        RightMax[n-1] = nums[n-1];
        for(int i = n -2 ; i >= 0 ; i--){
            RightMax[i] = Math.min(nums[i], RightMax[i+1]);
        }
        for(int i =0 ; i<n;i++){
            if(LeftMax[i] - RightMax[i] <= k){
            return i;
        }
        

        }
        return -1;
       
    }
}
