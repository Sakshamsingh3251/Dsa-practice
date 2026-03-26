class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int first = nums[0];
        int second = nums[1];
        int  last = nums[n-1];
        int secondlast = nums[n-2];

        int result = (last * secondlast ) - (first * second);
         return result;

    }
   
}
