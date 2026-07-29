class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        int n = board.length;
        int m = board[0].length;
        for(int i = 0; i < n; i++){
            Set<Character> set = new LinkedHashSet<>();
            for(int j = 0; j < m; j++){
                if (board[i][j] == '.') continue;
                if(set.contains(board[i][j])){
                    return false;
                } else {
                    set.add(board[i][j]);
                }
            }
        } 

        for(int j = 0; j < m; j++){
            Set<Character> set = new LinkedHashSet<>();
            for(int i = 0; i < n; i++){
               if (board[i][j] == '.') continue;
               if(set.contains(board[i][j])){
                    return false;
                } else {
                    set.add(board[i][j]);
                }
            }
        }

        for(int i = 0; i < n; i+=3){
            for(int j = 0; j < m; j+=3){
                Set<Character> set = new HashSet<>();
                for(int ni = i; ni < i+3; ni++){
                    for(int nj = j; nj < j+3; nj++){
                        if (board[ni][nj] == '.') continue;
                        if(set.contains(board[ni][nj])){
                            return false; 
                        }else{
                                set.add(board[ni][nj]);
                            }
                    }
                }
            }
        }


        return true;
    }
}
