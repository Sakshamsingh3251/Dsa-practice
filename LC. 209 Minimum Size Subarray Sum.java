class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int length = Integer.MAX_VALUE;
        int sum = 0;

        while(j<n){
            sum += nums[j];

            while(sum >= target){
                length = Math.min(length , j - i + 1);
                sum = sum - nums[i];
                i++;
            }
            j++;
        }
       if (length == Integer.MAX_VALUE) {
             return 0;
        } else {
           return length;
        }
        
    }
}
