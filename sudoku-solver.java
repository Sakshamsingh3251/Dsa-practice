class Solution {

    // check kar rhe ki kya digit d valid hai board[row][col] me dalna
    public boolean isValid(char[][] board, int row, int col, char d) {

        // row aur column me check
        for (int i = 0; i < 9; i++) {

            //  column ka check
            if (board[i][col] == d) {
                return false;
            }

            //  row ka check
            if (board[row][i] == d) {
                return false;
            }
        }

        // isse ham check kar skte hai ki sudoku ki koun si 3x3 grid me khali box hai aur vha tak pahuche kaise kyuki sab 3 bata 3 bhag me diivided hai to row aur column ko 3 se divide phir 3 bar mul kyuki utne grids hai
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //ye check karne ke liye ki vha khali hai yha phle se row , col , ya 3x3 me phle se koi present hai
                //startrow + i isliye kiya kyuki hame next row par bhi skip karna hai same startCol + j to skip for next column
                if (board[startRow + i][startCol + j] == d) {
                    return false;
                }
            }
        }

        return true;
    }
    //ye fuction board me check alagane aur recusive + backtracking func ko call karne ke liye hai bas + iterate (row+column) ko
    public boolean solve(char[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                // agar khali box mila to
                if (board[i][j] == '.') {

                    // ek se leke sare 9 digits ko iterate kiya hai
                    for (char d = '1'; d <= '9'; d++) {

                        if (isValid(board, i, j, d)) {
                            //digit d ko board me dala
                            board[i][j] = d;

                            // solve(board) ko recursive call lagaya
                            if (solve(board)) {
                                return true;
                            }
                            // backtrack karna hai yha se agar nhi shi mila kuch to
                            board[i][j] = '.';
                        }
                    }

                    return false; //ye tab ke liye jab koi valid digit mila hi nhi dalne ke liye
                }
            }
        }

        return true; // agar sudoku solve karne ke liye sare exact digit mil gye
    }
    public void solveSudoku(char[][] board) {
        solve(board);
        //ye leetcode se bana inbuilt recursion call hai
    }
}
