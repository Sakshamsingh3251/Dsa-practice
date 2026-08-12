class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int start = 0;
        int end = m*n - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(matrix[mid/n][mid%n] > target){
                end = mid - 1;
            }
            else if (matrix[mid/n][mid%n] < target ){
                start = mid + 1;
            }
            else{
                return true;
            }
        }
        return false;

    }
}
// using a approach to find index of a 1D array element in 2D array{matrix} while using binary search

// if mid = 8 , if matrix it is at matrix[2][0]
// so to find that element in 2D matrix we do:-
// matrix[mid/n][mid%n] 
