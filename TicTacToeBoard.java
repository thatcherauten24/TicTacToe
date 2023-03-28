public class TicTacToeBoard {
    private int [][] board2 = new int [][]{
        {0,0,0},
        {0,0,0},
        {0,0,0}
    };
    public boolean isValidMove(int r, int c){
        // see if move is possible
        if(r <= 3 && c <= 3 && r >= 1 && c >= 1){
            r --;
            c --;
            if(board2[r][c] == 0){
                return true;
            }
        }
        return false;
        }

    public void makeMove(int r, int c, int player){
        // makes the move
        r --;
        c --;
        board2[r][c] = player;
    }

    public int getGameStatus(){
        if(board2[0][0] == 1 && board2[0][1] == 1 && board2[0][2] == 1
        || board2[1][0] == 1 && board2[1][1] == 1 && board2[1][2] == 1
        || board2[2][0] == 1 && board2[2][1] == 1 && board2[2][2] == 1
        || board2[0][0] == 1 && board2[1][0] == 1 && board2[2][0] == 1
        || board2[0][1] == 1 && board2[1][1] == 1 && board2[2][1] == 1
        || board2[0][2] == 1 && board2[1][2] == 1 && board2[2][2] == 1
        || board2[0][0] == 1 && board2[1][1] == 1 && board2[2][2] == 1
        || board2[0][2] == 1 && board2[1][1] == 1 && board2[2][0] == 1){
            return 1;//player 1 wins
        }
        else if(board2[0][0] == 2 && board2[0][1] == 2 && board2[0][2] == 2
        || board2[1][0] == 2 && board2[1][1] == 2 && board2[1][2] == 2
        || board2[2][0] == 2 && board2[2][1] == 2 && board2[2][2] == 2
        || board2[0][0] == 2 && board2[1][0] == 2 && board2[2][0] == 2
        || board2[0][1] == 2 && board2[1][1] == 2 && board2[2][1] == 2
        || board2[0][2] == 2 && board2[1][2] == 2 && board2[2][2] == 2
        || board2[0][0] == 2 && board2[1][1] == 2 && board2[2][2] == 2
        || board2[0][2] == 2 && board2[1][1] == 2 && board2[2][0] == 1){
            return 2;//player 2 wins
        }
        else if(board2[0][0] == 0
        || board2[1][0] == 0
        || board2[2][0] == 0
        || board2[0][1] == 0
        || board2[1][1] == 0
        || board2[2][1] == 0
        || board2[0][2] == 0
        || board2[1][2] == 0
        || board2[2][2] == 0){
            return 0;//game still ongoing
        }
        return -1;//tie
    }

    public int getCellContents(int r, int c){
        // gets the cell contents
        r --;
        c --;
        return board2[r][c];
    }

    public String toString(){
        // makes a board
        String result = "";
        for(int r = 0; r < 3; r ++){
            if(r > 0){
                result += "--";
            }
            for(int c = 0; c < 3; c ++){
                result += board2[r][c];
                result += "|";
                if(c == 2){
                    result += "\n";
                }
            }
        }
        return result;
    }

}
