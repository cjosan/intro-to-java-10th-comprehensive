package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise702 {
    public static void main(String[] args) {
        int[] integers = initIntegers();
        displayReverse(integers);
    }
    
    public static int[] initIntegers() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.println("Enter ten integers");
        int[] integers = new int[10];
        
        for (int i = 0; i < 10; i++) {
            integers[i] = sc.nextInt();
        }
        return integers;
    }
    
    public static void displayReverse(int[] integers) {
        for (int i = (integers.length - 1); i >= 0; i--) {
            System.out.print(integers[i] + " ");
        }
    }
}
