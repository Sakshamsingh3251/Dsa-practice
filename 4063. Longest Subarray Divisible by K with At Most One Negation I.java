//given nums = [3 , 4 , 1 , 2]
// k = 3
// sum = 4 + 1  + 2 = 7 (taking any subarray)
//now 7 % 3 != 0 , so not a valid subarray
//if we negate any element in that subarray suppose 
// 2 -> -2
// new sum = 4 + 1 - 2 = 3
// 3 % 3 = 0 , hence valid subarray
// Intution:-
// if Sum = s;
// element = x -> -x
// newsum = s - 2x ( because x is already added to odd sum and one time for negation 7 - 2(2) == 3)
//now if newsum % k = 0
//       (s - 2x) % k = 0
//that is :- [[s % k = 2x % k]] (main idea)
// means if the remainder of subarray is equals to remainder of negation element 
// then it is a valid subarray.....
class Solution {
    public int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;

        for ( int left = 0 ; left < n ; left++){
            long sum = 0;
            boolean[] remainder = new boolean[k];
            for (int right = left ; right < n ; right++){
                sum += nums[right];

                int negation = (((2*nums[right]) % k ) + k) % k;//for negative values + k % k;
                remainder[negation] = true;

                int subarraysumRem = (int)((sum % k) + k) % k;
                if(subarraysumRem == 0 || remainder[subarraysumRem]){
                    ans = Math.max(ans , right - left + 1);
                }


                
            }
        }
        return ans;
        
    }
}
