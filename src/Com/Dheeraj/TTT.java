// Only for Fun __code and play 

package Com.Dheeraj;
import java.util.Scanner;

public class TTT{
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
        char player = 'x';
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);
        while (!gameOver()) {
            printBoard(board);
            System.out.print("player " + player + "enter: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            System.out.println();

            if (board[row][col] == ' ') {
                board[row][col] = player;
                gameOver = haveWon(board, player);
                if (gameOver) {
                    System.out.println("Player " + player + " has won:");
                } else {
                    player = (player == 'x') ? '0' : 'x';
                }
            } else {
                System.out.println("Invalid move . Try again!");
            }
        }
        printBoard(board);
    }

    private static boolean gameOver() {
        return false;
    }


    public static boolean haveWon(char[][] board, char player){
        for(int row = 0; row < board.length; row++){
            if(board[row][0]==player && board[row][1]==player && board[row][2]==player){
                return true;
            }
        }
        for (int col = 0; col < board[0].length; col++) {
            if(board[col][0]==player && board[col][1]==player && board[col][2]==player){
                return true;
            }
        }
        //diagonal
        if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
            return true;
        }
        return false;
    }

    public static void printBoard(char[][] board) {
        for (int row = 0; row < board.length ; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();

        }

    }
}


