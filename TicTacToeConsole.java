import java.util.Scanner;
//import java.util.Arrays;
public class TicTacToeConsole {

    private static int[] parsePlayerInput(String charNum) {
        int row;
        int col;
        int[] coordinates = new int[2];

        if(charNum.substring(0,1).equals("a")) {
            col = 0;
            coordinates[1] = col;
        } else if (charNum.substring(0,1).equals("b")) {
            col = 1;
            coordinates[1] = col;
        } else if (charNum.substring(0,1).equals("c")) {
            col = 2;
            coordinates[1] = col;
        } else {
            col = -1;
            coordinates[1] = col;
        }

        
        if(charNum.substring(1,2).equals("1")) {
            row = 0;
            coordinates[0] = row;
        } else if (charNum.substring(1,2).equals("2")) {
            row = 1;
            coordinates[0] = row;
        } else if (charNum.substring(1,2).equals("3")) {
            row = 2;
            coordinates[0] = row;
        } else {
            row = -1;
            coordinates[0] = -1;
        }
        
        return coordinates;
    }

    private static void printNewBoard(int xCoordinate, int yCoordinate, int playerNum, String board){
        String newBoard;
        if (playerNum == 1) {
            if (xCoordinate == 0) {
                if (yCoordinate == 0) { //0,0
                    newBoard = board.substring(0, 57) + "X" + board.substring(58, board.length() - 1);
                } else if (yCoordinate == 1) { //0,1
                    newBoard = board.substring(0, 65) + "X" + board.substring(66, board.length() - 1);
                } else if (yCoordinate == 2) { //0,2
                    newBoard = board.substring(0, 73) + "X" + board.substring(74, board.length() - 1);
                } else { //0,-1
                    System.out.println("that is not a valid move");
                    newBoard = board;

                }
            } else if (xCoordinate == 1) {
                if (yCoordinate == 0) { //1,0
                    newBoard = board.substring(0, 135) + "X" + board.substring(136, board.length() - 1);
                } else if (yCoordinate == 1) { //1,1
                    newBoard = board.substring(0, 143) + "X" + board.substring(144, board.length() - 1);
                } else if (yCoordinate == 2) { //1,2
                    newBoard = board.substring(0, 151) + "X" + board.substring(152, board.length() - 1);
                } else { //1,-1
                    System.out.println("that is not a valid move");
                    newBoard = board;

                }

            } else if (xCoordinate == 2) {
                if (yCoordinate == 0) { //2,0
                    newBoard = board.substring(0, 213) + "X" + board.substring(214, board.length() - 1);
                } else if (yCoordinate == 1) { //2,1
                    newBoard = board.substring(0, 221) + "X" + board.substring(222, board.length() - 1);
                } else if (yCoordinate == 2) { //2,2
                    newBoard = board.substring(0, 229) + "X" + board.substring(230, board.length() - 1);
                } else { //2,-1
                    System.out.println("that is not a valid move");
                    newBoard = board;

                }

            } else { //-1
                System.out.println("that is not a valid move");
                newBoard = board;
            }
        } else if (playerNum == 2) {
            if (xCoordinate == 0) {
                if (yCoordinate == 0) { //0,0
                    newBoard = board.substring(0, 57) + "O" + board.substring(58, board.length() - 1);
                } else if (yCoordinate == 1) { //0,1
                    newBoard = board.substring(0, 65) + "O" + board.substring(66, board.length() - 1);
                } else if (yCoordinate == 2) { //0,2
                    newBoard = board.substring(0, 73) + "O" + board.substring(74, board.length() - 1);
                } else { //0,-1
                    System.out.println("that is not a valid move");
                    newBoard = board;

                }
            } else if (xCoordinate == 1) {
                if (yCoordinate == 0) { //1,0
                    newBoard = board.substring(0, 135) + "O" + board.substring(136, board.length() - 1);
                } else if (yCoordinate == 1) { //1,1
                    newBoard = board.substring(0, 143) + "O" + board.substring(144, board.length() - 1);
                } else if (yCoordinate == 2) { //1,2
                    newBoard = board.substring(0, 151) + "O" + board.substring(152, board.length() - 1);
                } else { //1,-1
                    System.out.println("that is not a valid move");
                    newBoard = board;

                }

            } else if (xCoordinate == 2) {
                if (yCoordinate == 0) { //2,0
                    newBoard = board.substring(0, 213) + "O" + board.substring(214, board.length() - 1);
                } else if (yCoordinate == 1) { //2,1
                    newBoard = board.substring(0, 221) + "O" + board.substring(222, board.length() - 1);
                } else if (yCoordinate == 2) { //2,2
                    newBoard = board.substring(0, 229) + "O" + board.substring(230, board.length() - 1);
                } else { //2,-1
                    System.out.println("that is not a valid move");
                    newBoard = board;

                }

            } else { //-1
                System.out.println("that is not a valid move");
                newBoard = board;
            }
        } else {
            newBoard = board;
        }
        

        System.out.println(newBoard);
    }

    //player 1 is X, player 2 is O
    public static void main(String[] args) {
        String board1 =
        "     a       b       c   \n         |       |       \n1        |       |       \n  _______|_______|_______\n         |       |       \n2        |       |       \n  _______|_______|_______\n         |       |       \n3        |       |       \n         |       |       ";
        System.out.println(board1);
                            // 0123456789012345678901234
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
                printNewBoard(parsePlayerInput(player1Move)[0], parsePlayerInput(player1Move)[1], 1, board1);
                
                currentPlayer = 2;
            } else { //currentPlayer = 2
                System.out.println("Player 2, please enter your move in the format shown above (a1, c2, etc)");
                String player2Move = s.nextLine();
                printNewBoard(parsePlayerInput(player2Move)[0], parsePlayerInput(player2Move)[1], 2, board1);
                
                currentPlayer = 1;
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