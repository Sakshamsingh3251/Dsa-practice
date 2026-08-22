//similar to LC 530 , subarray sum equals to k 
// used the concept if prefixsum - goal exists in the map then get its frequency equals to no . subarrays
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
       // a prefix sum of 0 has appeared once (before array starts)
        map.put(0, 1);
        
        int prefixsum = 0;
        int result = 0;

        for (int num : nums) {
            prefixsum += num;
            int target =  prefixsum - goal;
            if (map.containsKey(target)) {
                result += map.get(target);
            }
            map.put(prefixsum, map.getOrDefault(prefixsum, 0) + 1);
        }

        return result;
    }
}
