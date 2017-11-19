package introjava_iii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise824 {
    public static void main(String[] args) {
        // Read a Sudoku solution
        int[][] grid = readASolution();

        System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");
    }
    
    /** Read a Sudoku solution from the console */
    public static int[][] readASolution() {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Sudoku puzzle solution:");
        int[][] grid = new int[9][9];
        for (int i = 0; i < 9; i++)
        for (int j = 0; j < 9; j++)
        grid[i][j] = input.nextInt();

        return grid;
    }
    
    public static boolean isValid(int[][] grid) {
        int[] solution = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        for (int i = 0; i < grid.length; i++) {
            if (i % 3 == 0) {
                if (!(checkRow(grid, solution, i) && checkColumn(grid, solution, i) && checkGrid(grid, solution, i))) {
                    return false;
                }
            }
            else {
                if (!(checkRow(grid, solution, i) && checkColumn(grid, solution, i))) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean checkRow(int[][]grid, int[] solution, int row) {
        boolean checkSolution[] = new boolean[solution.length];
        
        for (int i = 0; i < grid[row].length; i++) {
            if (search(solution, grid[row][i])) {
                checkSolution[grid[row][i] - 1] = !checkSolution[grid[row][i] - 1];
            }
            else
                return false;
        }
        return checkSolution(checkSolution);
    }
    
    public static boolean checkColumn(int[][]grid, int[] solution, int column) {
        boolean checkSolution[] = new boolean[solution.length];
        
        for (int i = 0; i < grid.length; i++) {
            if (search(solution, grid[i][column])) {
                checkSolution[grid[i][column] - 1] = !checkSolution[grid[i][column] - 1];
            }
            else
                return false;
        }
        return checkSolution(checkSolution);
    }
    
    public static boolean checkGrid(int[][] grid, int[] solution, int g) {
        boolean checkSolution[] = new boolean[solution.length];
        
        for (int i = g; i < g + 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (search(solution, grid[i][j]))
                    checkSolution[grid[i][j] - 1] = !checkSolution[grid[i][j] - 1];
            }
        }
        
        if (checkSolution(checkSolution) == false)
            return false;
        
        for (int i = 0; i < solution.length; i++) {
            checkSolution[i] = false;
        }
        
        for (int i = g; i < g + 3; i++) {
            for (int j = 3; j < 6; j++) {
                if (search(solution, grid[i][j]))
                    checkSolution[grid[i][j] - 1] = !checkSolution[grid[i][j] - 1];
            }
        }
        
        if (checkSolution(checkSolution) == false)
            return false;
        
        for (int i = 0; i < solution.length; i++) {
            checkSolution[i] = false;
        }
        
        for (int i = g; i < g + 3; i++) {
            for (int j = 6; j < 9; j++) {
                if (search(solution, grid[i][j]))
                    checkSolution[grid[i][j] - 1] = !checkSolution[grid[i][j] - 1];
            }
        }
        
        if (checkSolution(checkSolution) == false)
            return false;
        
        return true;
    }
    
    public static boolean search(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (n == array[i])
                return true;
        }
        return false;
    }
    
    public static boolean checkSolution(boolean[] solution) {
        for (int i = 0; i < solution.length; i++) {
            if (solution[i] == false)
                return false;
        }
        return true;
    }
    
}
