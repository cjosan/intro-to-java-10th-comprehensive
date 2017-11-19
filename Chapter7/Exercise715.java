package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise715 {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2};
        int[] distincts = eliminateDuplicates(x);
        
        for(int e:distincts)
            System.out.println(e);
    }
    
    
    public static int[] eliminateDuplicates(int[] list) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] < 0)
                continue;
            count++;
            
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    list[j] = -1;
                }
            }
        }
        
        int[] distincts = new int[count];
        
        for (int i = 0; i < count; i++) {
            for (int j = i; j < list.length; j++) {
                if (list[j] > 0) {
                    distincts[i] = list[j];
                    list[j] = -1;
                    break;
                }
            }
        }
        
        return distincts;
    }
}
