import java.util.*;

class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost); 
        int total = 0;
        int itemNumber = 1;


        for (int i = cost.length - 1; i >= 0; i--) {

            
            if (itemNumber % 3 != 0) {
                total += cost[i];
            }

            itemNumber++;
        }

        return total;
    }
}
