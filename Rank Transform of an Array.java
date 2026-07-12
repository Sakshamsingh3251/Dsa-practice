class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] x = new int[n];
       // Arrays.sort(arr);
       for(int i = 0 ; i < n ; i++){
        x[i] = arr[i];
       }
       Arrays.sort(x);
       HashMap<Integer,Integer> map = new HashMap<>();
    //    int rank = -1;
    int rank = 1;
    for(int i = 0 ; i < n ;i++){
        if(!map.containsKey(x[i])){
            map.put(x[i] , rank);
            rank++;
        }
    }
    for(int i = 0 ; i < n ; i++ ){
        arr[i] =map.get(arr[i]);
    }
    return arr;
    

        
    }
}
