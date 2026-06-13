class Solution {
    long findCost(int[] nums , int[] cost , int target){
        long result = 0;
        for(int i = 0 ; i < nums.length ; i++){
            result += (long)Math.abs(nums[i] - target)*cost[i];
        }
        return result;
    }
    public long minCost(int[] nums, int[] cost) {
        long answer = Long.MAX_VALUE;

        int left= nums[0];
        int right = nums[0];

        for(int i = 0 ; i < nums.length ; i++){
            left = Math.min(left , nums[i]);
            right = Math.max(right , nums[i]);

        }
        while(left <= right){
            int mid  = left + (right - left)/2;
            long cost1 = findCost(nums , cost , mid);
            long cost2 = findCost(nums , cost , mid+1);

            answer = Math.min(cost1 , cost2);

            if(cost2 > cost1){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return answer;
    }
}
