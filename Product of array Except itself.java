class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int ProductLeft = 1;
        int ProductRight = 1;

        for(int i = n-1;i>=0;i--){
            ans[i] = ProductRight;
            ProductRight = ProductRight*nums[i];
        }
        for(int i =0;i<n;i++){
            ans[i]=ans[i]*ProductLeft;
            ProductLeft = ProductLeft*nums[i];
        }
        return ans;
    }
}
