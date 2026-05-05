class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int rightmax = arr[n-1];
        arr[n-1] = -1;
        for(int i = n-2;i>=0;i--){
            int current = arr[i];
            arr[i] = rightmax;

            if(current > rightmax){
                rightmax = current;
            }
        }
        return arr;
    }
}
