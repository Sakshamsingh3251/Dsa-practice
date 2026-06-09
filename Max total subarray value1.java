class Solution {
    public long maxTotalValue(int[] nums, int k) {

        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }

            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return (long) (max - min) * k;
    }
}
