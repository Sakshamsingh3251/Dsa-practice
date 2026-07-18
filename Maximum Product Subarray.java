class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int leftproduct = 1;
        int rightproduct = 1;
        int ans = nums[0];

        for(int i = 0 ; i < n ; i++){
            if (leftproduct == 0) {
                leftproduct = 1;
            
            } 
            if( rightproduct == 0){
                rightproduct = 1;
            }
            leftproduct *= nums[i];

            rightproduct *= nums[n - i - 1];

            ans = Math.max(ans , Math.max(leftproduct , rightproduct));
        }
        return ans;
    }
}
