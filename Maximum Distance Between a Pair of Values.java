class Solution {
    public int maxDistance(int[] nums1, int[] nums2 ) {
        int x = nums1.length;
        int y = nums2.length;

        int i = 0;
        int j = 0;
        int result = 0;

        while( i < x && j < y ){
            if(nums1[i] > nums2[j]){//nums1[i] <= nums2[j] condition fails so trying smaller values of i now in nums1
                i++;
            }
            else{
                //j++;
              //calculating max distance of indexes of the  nums1[i] < nums2[j]
                 result = Math.max(result , j - i);
              //incremented j for further max elements if not found till now
                j++;
            }
        }
        return result;
        
    }
}
