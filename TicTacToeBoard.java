import javax.sql.rowset.spi.SyncResolver;

public class TicTacToeBoard {
    private boolean [][] board = new boolean [][]{
    {true, true, true}, 
    {true, true, true}, 
    {true, true, true}
    };
    private int [][] board2 = new int [][]{
        {0,0,0},
        {0,0,0},
        {0,0,0}
    };
    public boolean isValidMove(int r, int c){
        if(r <= 3 && c <= 3 && r >= 1 && c >= 1){
            r --;
            c --;
            if(board[r][c] == true){
                board[r][c] = false;
                return true;
            }
        }
        return false;
        }

    public void makeMove(int r, int c, int player){
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
            return 1;
        }
        else if(board2[0][0] == 2 && board2[0][1] == 2 && board2[0][2] == 2
        || board2[1][0] == 2 && board2[1][1] == 2 && board2[1][2] == 2
        || board2[2][0] == 2 && board2[2][1] == 2 && board2[2][2] == 2
        || board2[0][0] == 2 && board2[1][0] == 2 && board2[2][0] == 2
        || board2[0][1] == 2 && board2[1][1] == 2 && board2[2][1] == 2
        || board2[0][2] == 2 && board2[1][2] == 2 && board2[2][2] == 2
        || board2[0][0] == 2 && board2[1][1] == 2 && board2[2][2] == 2
        || board2[0][2] == 2 && board2[1][1] == 2 && board2[2][0] == 1){
            return 2;
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
            return 0;
        }
        return -1;
    }

    public int getCellContents(int r, int c){
        return board2[r][c];
    }

    public String toString(){
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