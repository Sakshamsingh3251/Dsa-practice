class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
  //if absolute(i - j )<= k then ok continue j++ until we find the duplicate, also add distinct elements to the set
  //but if  absolute(i - j )<= k is not then we will shrink the window from left (i++) also remove nums[i](remove it from the set)
  //now continue to move the window according to the k and add distinct element to the set  
     int n = nums.length;
     HashSet<Integer> set = new HashSet<>();
     int i = 0;
     int j = 0;
     while(j < n){
        //means j will run till the last element of the array
        if(Math.abs(i - j ) > k ){
            //shrinking case:
            set.remove(nums[i]);
            i++;

        }
        if(set.contains(nums[j])){
            return true;
        }
        set.add(nums[j]);
        j++;

     }
     return false;
  
    }
}
