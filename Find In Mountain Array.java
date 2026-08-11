class Solution {
    public int peakIndexInMountainArray(MountainArray mountainArr) {
        int n = mountainArr.length();
        int start = 0;
        int end = n - 1;

        while(start<end){
            int mid = start + (end - start)/2;
            if(mountainArr.get(mid) > mountainArr.get(mid + 1)){ // We are on the decreasing side
                                                    
                end = mid;// Peak can be mid or somewhere to the left
            }else{
                // We are on the increasing side
                // Peak must be to the right
                start = mid + 1;
            }
        }
        return start;
        
    }
    public int binarySearch( MountainArray mountainArr , int start , int end , int target){
       // int mid;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(mountainArr.get(mid) == target){
                return mid;
            }
            else if(mountainArr.get(mid) > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public int reversebinarySearch( MountainArray mountainArr , int start , int end , int target){
       
        while(start <= end){
           int  mid = start + (end - start)/2;

            if(mountainArr.get(mid) == target){
                return mid;
            }
            else if(mountainArr.get(mid) > target){
                start = mid  + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int peakIndex = peakIndexInMountainArray(mountainArr);
        int index = binarySearch(mountainArr , 0 , peakIndex , target);
        if( index != -1){
            return index;

        }
        index = reversebinarySearch(mountainArr , peakIndex + 1 , n - 1 , target);

        return index;
    }
}
