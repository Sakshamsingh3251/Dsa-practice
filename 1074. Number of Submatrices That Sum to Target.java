class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // calculating preefix sum

        for(int row = 0; row < rows ; row++){
            for(int col = 1 ; col < cols ; col++){
                matrix[row][col] += matrix[row][col-1];

            }
        }
        //to find the number of subarrays sum equals to k
        int result = 0;
        for(int startcol = 0 ; startcol < cols ;…
                for(int row = 0; row < rows ; row++){
                    sum += matrix[row][currcol] - (startcol > 0 ? matrix[row][startcol - 1 ] : 0);

                    if(map.containsKey(sum - target)) {// k hi target hai

                    // now same code as LC 560

                    result += map.get(sum - target);
                    }
                    map.put(sum , map.getOrDefault(sum , 0)+1);
                }


            }
        }
        return result;
        
    }
}
