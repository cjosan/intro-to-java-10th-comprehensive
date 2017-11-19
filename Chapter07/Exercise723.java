package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise723 {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];
        
        for (int i = 1; i <= lockers.length; i++) {
            changeLockers(lockers, i);
        }
        
        displayOpenLockers(lockers);
    }
    
    public void changeLockers(boolean[] lockers, int student) {
        for (int i = student - 1; i < lockers.length; i += student) {
           // if (i % student == 0)
                lockers[i] = !lockers[i];
        }
    }
    
    public void displayOpenLockers(boolean[] lockers) {
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i])
                System.out.println((i + 1) + " ");
        }
    }
}
