package introjava_iii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise835 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of grid: ");
        int size = input.nextInt();
        int[][] grid = new int[size][size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = input.nextInt();
            }
        }
        
        int[] largestBlock = findLargestBlock(grid);
        
        System.out.println("The maximum square submatrix is at (" + largestBlock[0] + ", " + largestBlock[1] + ") with size " + largestBlock[2]);
    }
    
    public static int[] findLargestBlock(int[][] m) {
        int size = m.length;
        
        while (size >= 2) {
            if (findBlock(m, size) != null)
                return findBlock(m, size);
            
            size--;
        }
        return null;
    }
    
    public static int[] findBlock(int[][] m, int size) {
        int startPosition = 0;
        int[] blockPosition = new int[3];
        blockPosition[2] = size;
        
        if (size == m.length && checkGrid(m, 0, 0, size)) {
            blockPosition[0] = 0;
            blockPosition[1] = 0;
            
            return blockPosition;
        }
        
        for (int i = 0; i <= (m.length - size); i++) {
            blockPosition[0] = i;
            while (startPosition < (m.length - size)) {
                for (int j = startPosition; j < (startPosition + size); j++) {
                    blockPosition[1] = j;
                    if (checkGrid(m, i, j, size)) {
                        return blockPosition;
                    }
                }
                startPosition += size;
            }
            startPosition = 0;
        }
        return null;
    }
    
    public static boolean checkGrid(int[][] m, int row, int column, int size) {
        for (int i = row; i < (row + size); i++) {
            for (int j = column; j < (column + size); j++) {
                if (m[i][j] != 1)
                    return false;
            }
        }
        return true;
    }
}
