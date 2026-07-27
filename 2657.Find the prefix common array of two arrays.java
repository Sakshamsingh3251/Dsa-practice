class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] res = new int[A.length];
        Set<Integer> aset = new HashSet<>();
        Set<Integer> bset = new HashSet<>();
        int count = 0;
        for(int i = 0 ; i < res.length ; i++){
            aset.add(A[i]);
            bset.add(B[i]);
            if(A[i] == B[i]){
                count++;
            }
            else{
                if(aset.contains(B[i])){

                    count++;
                }
                if(bset.contains(A[i])){
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }
}
