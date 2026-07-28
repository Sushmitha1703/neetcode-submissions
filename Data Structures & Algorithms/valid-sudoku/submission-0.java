class Solution {
    public boolean isValidSudoku(char[][] board) {
        // row check
        for(int i=0;i<9;i++){
            HashSet<Character> rowSet = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(!rowSet.add(board[i][j])){
                    return false;
                }
            }
        }
        // col check
        for(int j=0;j<9;j++){
            HashSet<Character> colSet = new HashSet<>();
            for(int i=0;i<9;i++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(!colSet.add(board[i][j])){
                    return false;
                }
            }
        }

        // box check
        for(int i=0;i<3;i++){
            for(int j =0;j<3;j++){
                HashSet<Character> boxSet = new HashSet<>();
                for(int startRow=i*3; startRow< i*3+3;startRow++){
                    for(int startCol=j*3; startCol< j*3+3;startCol++){
                        if(board[startRow][startCol]=='.'){
                            continue;
                        }
                        if(!boxSet.add(board[startRow][startCol])){
                            return false;
                        }
                    }
                }
            }
    }
    return true;
}
}