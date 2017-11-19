package introjava_iii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise810 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        fillMatrix(matrix);
        
        int largestRow = getLargestRow(matrix);
        int largestColumn = getLargestColumn(matrix);
        
        displayMatrix(matrix);
        System.out.println("The largest row index: " + largestRow);
        System.out.println("The largest column index: " + largestColumn);
        
    }
    
    public static void fillMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int column = 0; column < row.length; column++) {
                row[column] = (int)(Math.random() * 2);
            }
        }
    }
    
    public static int getLargestRow(int[][] matrix) {
        int max = getRowSum(matrix[0]);
        int rowIndex = 0;
        
        for (int i = 1; i < matrix.length; i++) {
            int sum = getRowSum(matrix[i]);
            
            if (max < sum) {
                max = sum;
                rowIndex = i;
            }
        }
        return rowIndex;
    }
    
    public static int getRowSum(int[] row) {
        int sum = 0;
        for (int r : row) {
            sum += r;
        }
        return sum;
    }
    
    public static int getLargestColumn(int[][] matrix) {
        int max = getColumnSum(matrix, 0);
        int columnIndex = 0;
        
        for (int i = 1; i < matrix[0].length; i++) {
            int sum = getColumnSum(matrix, i);
            
            if (max < sum) {
                max = sum;
                columnIndex = i;
            }
        }
        return columnIndex;
    }
    
    public static int getColumnSum(int[][] matrix, int column) {
        int sum = 0;
        for (int[] row : matrix) {
            sum += row[column];
        }
        return sum;
    }
    
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int column = 0; column < row.length; column++) {
                System.out.print(row[column] + " ");
            }
            System.out.println();
        }
    }
}
