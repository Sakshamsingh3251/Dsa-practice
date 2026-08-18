class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int currunsatisfied = 0;
        int maxunsatisfied = 0;

        for(int i = 0 ; i < minutes ; i++){
            if(grumpy[i] == 1){
                currunsatisfied += customers[i];
            }
        }
        maxunsatisfied = currunsatisfied;

        int i = 0;
        int j = minutes;

        while( j < n){
        if (grumpy[j] == 1) {
        currunsatisfied += customers[j];
        }
        if (grumpy[i] == 1) {
        currunsatisfied -= customers[i];
        }
        if (currunsatisfied > maxunsatisfied) {
        maxunsatisfied = Math.max(maxunsatisfied,currunsatisfied);
        }

        i++;
        j++;
            
        }
        int totalsatisfied = maxunsatisfied;
        for(int k = 0 ; k < n ; k++){
        if(grumpy[k] == 0)
        totalsatisfied += customers[k];
        }
        return totalsatisfied;

    }
}
