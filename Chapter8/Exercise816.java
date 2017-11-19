package introjava_iii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise816 {
    public static void main(String[] args) {
        int[][] array = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};
        sort(array);
        
        for (int[] row : array) {
                System.out.println(row[0] + " " + row[1]);
            }
    }
    
    public static void sort(int[][] array) {
        int index;
        for (int i = 0; i < array.length - 1; i++) {
            int[] min = array[i];
            index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (min[0] > array[j][0]) {
                    min = array[j];
                    index = j;
                }
            }
            
            if (index != i) {
                array[index] = array[i];
                array[i] = min;
            }
        }
        
        for (int i = 0; i < array.length - 1; i++) {
            int[] min = array[i];
            index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i][0] == array[j][0]) {
                    if (min[1] > array[j][1]) {
                        min = array[j];
                        index = j;
                    }
                } 
            }
            
            if (index != i) {
                array[index] = array[i];
                array[i] = min;
            }
        }
    }
}
