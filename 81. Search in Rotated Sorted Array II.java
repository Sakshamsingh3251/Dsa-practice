class Solution {
     int findpivot(int[] nums , int l , int r){
        while( l < r){
            //skipping duplicates from left and right;
            while(l < r && nums[l] == nums[l+1 ]){
                l++;
            }
             while(l < r && nums[r] == nums[r-1 ]){
                r--;
            }

            int mid  = l + (r-l)/2;
            if(nums[mid] > nums[r]){
                l = mid + 1;
            }else{
                r = mid ;
            }
        }
        return l;
    }

    public boolean binarySearch(int[] nums , int l , int r , int target){
        while(l <= r ){
            int mid = l + (r - l)/2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[mid] < target){
                l = mid + 1;

            }else{
                r = mid -1 ;
            }
        }
        return false;
    }

    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int pivot = findpivot(nums,0 , n-1 );

        if(binarySearch(nums , 0 , pivot -1 , target)){//left  side of pivot is sorted
            return true;
        }else{
            return binarySearch(nums, pivot , n -1 , target);// right side of pivot(sorted)
        }

    }
}
