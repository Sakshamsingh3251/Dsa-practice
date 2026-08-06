class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
         int n = nums.length;
         HashMap<Integer,Integer> map = new HashMap<>();
         map.put(0,-1);
         int sum = 0;

        for(int i = 0 ; i < n ; i++){
            sum += nums[i];
            int remainder = sum % k;

            if(map.containsKey(remainder)){
                if(i - map.get(remainder) >= 2){
                    return true;
                }
                
            }
            else{
                map.put(remainder,i);
            }

        }
        // Brute Force :- TC(O(n^2))
        // for(int i = 0 ; i < n ; i++){
        //     int sum = 0;
        //     for(int j = i ; j < n ; j++){
        //         sum += nums[j];

        //         if(j-i+1 >= 2 && sum % k == 0){
        //             return true;
        //         }
        //     }


        // }
        
         return false;
    }
}
