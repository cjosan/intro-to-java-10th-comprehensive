package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise705 {
    public static void main(String[] args) {
        int[] integers = initIntegerArray();
        int distinct[] = getDistinctNumbers(integers);
        int count = countDistinctNumbers(distinct);
        printDistinctNumbers(distinct, count);
       
    }
    
    public static int[] initIntegerArray() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        int [] integers = new int[10];

        System.out.println("Enter ten integers");
        
        for (int i = 0; i < 10; i++) {
            integers[i] = sc.nextInt();
        }
        
        return integers;
    }
    
    public static int[] getDistinctNumbers(int[] integers) {
        int[] distincts = new int[integers.length];
        int count = 0;
        for (int i = 0; i < distincts.length; i++) { 
            
            for (int j = 0; j < distincts.length; j++) {
                if (integers[i] == integers[j]) {
                    count++;
                }
            }
            
            if (count == 1)
                distincts[i] = integers[i];
            
            count = 0;
        }
        
        return distincts;
    }
    
    public static int countDistinctNumbers(int[] array) {
        int count = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0)
                count++;
        }
        
        return count;
    }
    
    public static void printDistinctNumbers(int[] array, int count) {
        System.out.println("The number of distinct numbers is " + count);
        if (count > 0) {
            System.out.print("The distinct numbers are: ");
            for (int e:array) {
                if (e != 0)
                    System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
