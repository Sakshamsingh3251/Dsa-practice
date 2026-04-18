class Solution {
    public int getreverse(int num){
        int rev = 0;
        while(num > 0){
            int rem = num % 10;
            rev = rev*10 + rem;
            num = num / 10;

        }
        return rev;

    }
    public int minMirrorPairDistance(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        //key = reversed number
        //value = index;
        int result = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            if(map.containsKey(nums[i])){
                result = Math.min(result , i - map.get(nums[i]));
            }
            map.put(getreverse(nums[i]) , i);
        }
        if(result == Integer.MAX_VALUE){
            return -1;
        }
        return result;
    }
}
