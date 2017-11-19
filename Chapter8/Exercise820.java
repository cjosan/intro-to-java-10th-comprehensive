package introjava_iii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise820 {
    public static void main(String[] args) {
        char[][] grid = new char[6][7];
        startGame(grid);
        
    }
    
    public static void startGame(char[][] grid) {
        int[] gridContents = new int[grid[0].length];
        displayGrid(grid);
            
        while (true) {
            enterPosition(grid, gridContents,'R');
            displayGrid(grid);
            if (checkResult(grid, 'R') == 'R') {
                System.out.println("The red player won!");
                break;
            }

            enterPosition(grid, gridContents, 'Y');
            displayGrid(grid);
            
            if (checkResult(grid, 'Y') == 'Y') {
                System.out.println("The yellow player won!");
                break;
            }
        }
    }
    
    public static void displayGrid(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print("| " + grid[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-----------------------------");
    }
    
    public static void enterPosition(char[][] grid, int[] gridContents, char disk) {
        Scanner input = new Scanner(System.in);
        int column;
        
        while (true) {
            System.out.print("Enter a " + disk + " at column (0 - 6): ");
            column = input.nextInt();
            
            try {
                if (gridContents[column] < 6) {
                    placeDisk(grid, gridContents, column, disk);
                    break;
                }
                else
                    System.out.println("The column is full!");
            } catch (Exception ex) {
                System.out.println("You entered a wrong position!");
            }
        }   
    }
    
    public static void placeDisk(char[][] grid, int[] gridContents, int column, char disk) {
        grid[grid.length - 1 - gridContents[column]][column] = disk;
        gridContents[column]++;
    }
    
    public static char checkResult(char[][] grid, char disk) {
        if (checkRows(grid, disk) || checkColumns(grid, disk) || checkDiagonals(grid, disk))
            return disk;
        return 0;
    }
    
    public static boolean checkRows(char[][] grid, char disk) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length - 3; j++) {
                if (grid[i][j] == disk && grid[i][j + 1] == disk && grid[i][j + 2] == disk && grid[i][j + 3] == disk)
                    return true;
            }
        }
        return false;
    }
    
    public static boolean checkColumns(char[][] grid, char disk) {
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length - 3; j++) {
                if (grid[j][i] == disk && grid[j + 1][i] == disk && grid[j + 2][i] == disk && grid[j + 3][i] == disk)
                    return true;
            }
        }
        return false;
    }
    
    public static boolean checkDiagonals(char[][] grid, char disk) {
        for (int i = 0; i < grid.length - 3; i++) {
            for (int j = 0; j < grid[i].length - 3; j++) {
                if (grid[i][j] == disk && grid[i + 1][j + 1] == disk && grid[i + 2][j + 2] == disk && grid[i + 3][j + 3] == disk)
                    return true;
                
                if (grid[i][j + 1] == disk && grid[i + 1][j + 2] == disk && grid[i + 2][j + 3] == disk && grid[i + 3][j + 4] == disk)
                    return true;
            }
        }
        
        for (int i = 0; i < grid.length - 3; i++) {
            for (int j = grid[i].length - 1; j > 3; j--) {
                if (grid[i][j] == disk && grid[i + 1][j - 1] == disk && grid[i + 2][j - 2] == disk && grid[i + 3][j - 3] == disk)
                    return true;
                
                if (grid[i][j - 1] == disk && grid[i + 1][j - 2] == disk && grid[i + 2][j - 3] == disk && grid[i + 3][j - 4] == disk)
                    return true;
            }
        }
        return false;
    }
}