class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        int resultantindex = 0;
        while(left <= right){
            while(left < right && nums[left] == nums[left+1]) left++;//condition to skip the duplicates coming moving to left side
            while(right > left && nums[right] == nums[right - 1]) right--;//condition to skip the duplicates coming moving to right side

            int mid = left + (right - left)/2;
            if(nums[mid] < nums[resultantindex]){
                resultantindex = mid;
            }
            if(nums[mid] > nums[right]){
                //matlb ki pakka roatated hai ye
                left = mid + 1;//chotte side dundho kyuki udhar hi smallest hoga ab
            }
            else{
                right = mid - 1;
            }


        }
        return nums[resultantindex];
    }
}
