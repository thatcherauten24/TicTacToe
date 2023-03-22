import java.util.Scanner;
public class TicTacToeConsole {

    private static int[][] parsePlayerInput(String coordinates) {

    }

    public static void main(String[] args) {
        String board =
        "     a       b       c   \n         |       |       \n1        |       |       \n  _______|_______|_______\n         |       |       \n2        |       |       \n  _______|_______|_______\n3        |       |       \n         |       |       \n         |       |       ";
        System.out.println(board);

        // System.out.println("     a       b       c   ");
        // System.out.println("         |       |       ");
        // System.out.println("1        |       |       ");
        // System.out.println("  _______|_______|_______");
        // System.out.println("         |       |       ");
        // System.out.println("2        |       |       ");
        // System.out.println("  _______|_______|_______");
        // System.out.println("         |       |       ");
        // System.out.println("3        |       |       ");
        // System.out.println("         |       |       ");

        Scanner s = new Scanner(System.in);
        TicTacToeBoard theBoard = new TicTacToeBoard();

        int currentPlayer = 1;
        while (theBoard.getGameStatus() == 0) {
            if (currentPlayer == 1) {
                System.out.println("Player 1, please enter your move in the format shown above (a1, c2, etc)");
                String player1Move = s.nextLine();
            } else { //currentPlayer = 2
                System.out.println("Player 2, please enter your move in the format shown above (a1, c2, etc)");
                String player2Move = s.nextLine();
            }
            



        }

        if (theBoard.getGameStatus() == 1) {
            System.out.println("Congratulations Player 1! You have successfully won this game of Tic Tac Toe!");
        }

        else if (theBoard.getGameStatus() == 2) {
            System.out.println("Congratulations Player 2! You have successfully won this game of Tic Tac Toe!");
        }

        else if (theBoard.getGameStatus() == -1) {
            System.out.println("Uh Oh! It looks like there is a tie!");
        }
        
        s.close();
    }
}