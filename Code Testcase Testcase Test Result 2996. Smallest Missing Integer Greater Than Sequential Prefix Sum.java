class Solution {
    public int missingInteger(int[] nums) {
        //prefix[j] = prefix[j - 1] - prefix[j];
      //  Map<Integer,Integer> map = new HashMap<>();
      int n = nums.length;
      HashSet<Integer> set = new HashSet<>();
      
      for(int no : nums){
        set.add(no);
      }
      int sequential = nums[0];
      for(int j = 1 ; j < n ; j++){
        if(nums[j] == nums[j-1] + 1){
            sequential += nums[j];
        }else{
            break;
        }
      }
      while(set.contains(sequential)){
        sequential++;
      }
      return sequential;
        
    }
}
