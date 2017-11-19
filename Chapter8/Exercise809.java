package introjava_iii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise809 {
    public static void main(String[] args) {
        char[][] board = new char[3][3]; // Initialize the board
        startGame(board);
    }
    
    /** Method for starting game
     * @param board */
    public static void startGame(char[][] board) {
        displayBoard(board);
        while (true) {
            enterToken(board, 'X');
            displayBoard(board);
            
            // Check if therea are three consecutive X
            if (checkBoard(board, 'X') == 'X') {
                System.out.println("X player won!");
                break;
            }
            
            enterToken(board, 'O');
            displayBoard(board);
            
            // Check if there are 3 consecutive O
            if (checkBoard(board, 'O') == 'O') {
                System.out.println("O player won!");
                break;
            }
        }
    }
    
    /** Display board
     * @param board */
    public static void displayBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print("| " + board[i][j] + " ");
            }
            System.out.println("|\n-------------");
        }
    }
    
    /** Ask the player to enter a valid position for token
     * @param board
     * @param token */
    public static void enterToken(char[][] board, char token) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter a row (0, 1, or 2) for player " + token + ": ");
            int row = input.nextInt();
            System.out.print("\nEnter a column (0, 1, or 2) for player " + token + ": ");
            int column = input.nextInt();
            
            /** Check if the entered position is valid */
            try {
                if (board[row][column] != 'X' && board[row][column] != 'Y') {
                    placeToken(board, row, column, token);
                    break;
                }
                else
                    System.out.println("\nInvalid position! Try again.");
            } catch (Exception ex) {
                System.out.println("\nYou entered a wrong position. Try again.");
            }
        }  
    }
    
    /** Place the token on board
     * @param board
     * @param row
     * @param column
     * @param token */
    public static void placeToken(char[][] board, int row, int column, char token) {
        board[row][column] = token;
    }
    
    /** Search if there are 3 same consecutive tokens on board
     * @param board
     * @param token
     * @return  */
    public static char checkBoard(char[][] board, char token) {
        if (checkRows(board, token) || checkColumns(board, token) || checkDiagonals(board, token))
            return token;
        
        return 0;
    }
    
    /** Search if there are 3 same consecutive tokens on same row
     * @param board
     * @param token
     * @return  */
    public static boolean checkRows(char[][] board, char token) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == token)
                    count++;
            }
            if (count == 3)
                return true;
            
            count = 0;
        }
        return false;
    }
    
    /** Search if there are 3 same consecutive tokens on same column
     * @param board
     * @param token
     * @return  */
    public static boolean checkColumns(char[][] board, char token) {
        int count = 0;
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] == token)
                    count++;
            }
            if (count == 3)
                return true;
            
            count = 0;
        }
        return false;
    }
    
    /** Search if there are 3 same consecutive tokens on diagonals
     * @param board
     * @param token
     * @return  */
    public static boolean checkDiagonals(char[][] board, char token) {
        int firstCount = 0;
        int secondCount = 0;
        int n = board.length - 1;
        
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == token)
                firstCount++;
            
            if (board[i][i + n] == token)
                secondCount++;
            
            n -= 2;
        }
        
        return firstCount == 3 || secondCount == 3;
    }
}