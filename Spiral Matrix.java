class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        if(matrix.length == 0){
            return result;
        }
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0;
        int down = m -1 ;
        int left = 0;
        int right = n - 1;

        int dir = 0;

        while(top <= down && left <= right){
            //left se right ke elements

            if(dir == 0){
                for(int i = left ; i <= right ; i++){
                    result.add(matrix[top][i]);
                }
                top++;
            }
            //top to bottom ke liye
            else if( dir == 1){
                for(int i = top ; i <= down ; i++){
                    result.add(matrix[i][right]);

                }
                right--;
                
            }
            //right to left ke liye
            else if( dir == 2){
                for(int i = right ; i >= left ; i--){
                    result.add(matrix[down][i]);
                }
                down--;
            }
            //down to top ke liye
            else if( dir == 3){
                for(int i = down ; i >= top ; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
            dir = (dir + 1) % 4;
        }
        return result;


    }
}
