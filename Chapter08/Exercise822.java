package introjava_iii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise822 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        generateMatrix(matrix);
        
        /*int[][] matrix = {{1, 0, 1, 0, 1, 1},
                {1, 1, 1, 1, 0, 0},
                {0, 1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {0, 1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 1}};*/
        
        displayMatrix(matrix);

        System.out.println(isEven(matrix));
    }
    
    public static void generateMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }
    }
    
    public static boolean isEven(int[][] matrix) {
        return (checkColumns(matrix) && checkRows(matrix));
    }
    
    public static boolean checkRows(int[][] matrix) {
        int count = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1)
                    count++;
            }
            
            if (count % 2 != 0)
                return false;
        
            count = 0;
        }
        return true;
    }
    
    public static boolean checkColumns(int[][] matrix) {
        int count = 0;
        
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println("\n" + i);
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1)
                    count++;
                System.out.print("*" + j);
            }
            
            if (count % 2 != 0)
                return false;
        }
        return true;
    }
    
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
