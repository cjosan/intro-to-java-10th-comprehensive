package introjava_iii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise818 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        shuffle(matrix);
        
        for (int[] m : matrix) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void shuffle(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int index = (int)(Math.random() * m.length);
            int[] temp;
            temp = m[i];
            m[i] = m[index];
            m[index] = temp;
        }
    }
}
