class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isincreasing = true;
        boolean isdecreasing = true;
        for(int i = 1; i < nums.length ; i++){
            if(nums[i-1] > nums[i]){
                isincreasing = false;
            }
            if(nums[i-1] < nums[i] ){
                isdecreasing = false;

            }
        }
        if(isincreasing || isdecreasing){
            return true;
        }
        else{
            return false;
        }
        
    }
}
