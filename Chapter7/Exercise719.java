package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise719 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.println("Enter list:");
        int size = input.nextInt();
        
        int[] list = new int[size];
        
        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }
        
        if (isSorted(list))
            System.out.println("The list is already sorted!");
        else
            System.out.println("The list is not sorted!");
    }
    
    public static boolean isSorted(int[] list) {
        for (int i = 0; i < (list.length - 1); i++) {
            if (list[i] > list[i + 1])
                return false;
        }
        return true;
    }
}
