//nums[i] + rev(nums[j] == nums[j] + rev(nums[i])
//using regrouping method to solve this problem
class Solution {

    int M = 1000000007;

    // Function to reverse a number
    int rev(int num) {
        int ans = 0;

        while (num > 0) {
            ans = ans * 10 + num % 10;
            num /= 10;
        }

        return ans;
    }

    public int countNicePairs(int[] nums) {
        int n = nums.length;

        HashMap<Integer, Integer> mp = new HashMap<>();

        // nums[i] = nums[i] - rev(nums[i])
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] - rev(nums[i]);
        }

        long result = 0;

        for (int i = 0; i < n; i++) {
            result = (result + mp.getOrDefault(nums[i], 0)) % M;

            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }

        return (int) result;
    }
}
