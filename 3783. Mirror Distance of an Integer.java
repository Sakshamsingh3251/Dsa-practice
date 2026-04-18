class Solution {
    public int mirrorDistance(int n) {
        int i = 0;
        int reverseNum = 0;
        int N = n;
        while(n>0){
            reverseNum = ( reverseNum  * 10) + n%10;
            n = n/10;
            i++;
        }
        return Math.abs(reverseNum - N);

    }
}
