class Solution {
    public boolean canTransform(int[] source, int[] target) {
        long sourcesum = 0;
        long targetsum = 0;

        for(int i = 0 ; i < source.length ; i++){
            sourcesum += source[i];
            targetsum += target[i];
        }
        return sourcesum == targetsum;
        
    }
}
// value = a, b   sum before update = a + b 
//  a' = a + b - delta   b' = delta  
// sum after update = a' + b' = a + b - delta + delta = a + b 
//hence koi change nhi hua before aur after me
// to bas isse check kar skte hai ki kya dono array ke elements ka sum same hai kya
//  0 1 2   source = [0, 2, 4]   target = [0, 2, 4]   i = 0   j = 2   delta = 4   source[j] = 4   source[i] = 1 + 3 - 4 = 0
