class Solution {
    public int arrangeCoins(int n) {
        int left = 0;
        int right = n;

        while(left<=right){
            int mid = (left + right)/2;
            long current = (long)mid *(mid+1)/2;

            if(current == n){
                return mid;
            }else if(current < n){
                left = mid+1;
            }else{
                right = mid - 1;
            }
        }
        return right;
    }
}
