class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int smlindex = -1;
        int mincap = Integer.MAX_VALUE;

        for(int i = 0 ; i < capacity.length ; i++){
            if(capacity[i] >= itemSize && capacity[i] < mincap){
                mincap = capacity[i];
                smlindex = i;
            }
        }
        return smlindex;
    }
}
