class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0;//denotes for  0 red
        int j = 0;//denotes for 1 white
        int k = n-1;// denotes for 2 blue

        while(j <= k){
            if(nums[j] == 1){
                j++;
            }else if(nums[j] == 2){
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                k--;
            }else{//only case remains where nums[j] has 0
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            i++;
            j++;

            }
        }
    }
}
