class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ts = new HashMap<>();
       // int n = nums.length;
        for(int i = 0 ; i<nums.length ; i++){
            int difference = target - nums[i];

            if(ts.containsKey(difference)){
                int index = ts.get(difference);
                return new int[]{index, i};
            }
            ts.put(nums[i] , i);

        }
        return new int[]{-1,-1};
        

    }
}
