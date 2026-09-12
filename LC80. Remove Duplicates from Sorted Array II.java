class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int n = nums.length;
        for(int num : nums){
            if( i < 2 || num != nums[i-2]){
                nums[i++] = num;
            }

        }
        return i ;//ye count rkh rha hai modified array me
        
    }
}
//duplicate check ke liye tisra element same nhi hona chahiye to
//nums[i-2] == nums[i] then duplicate
//nums = [1,1,1,2,2,3]
//        i   j        this should be the positions of the pointers then increment by 1 
// if i is at 4 then the previous counter must be i - 4
//when we find a duplicate we put nothing in the updated array at the last remaining places of the updated array we put _ , just put the satisfied elements in the array and give there count uzing index , not need to understand underscore
