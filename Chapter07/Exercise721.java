package introjava_ii;

/**
 *
 * @author Cornel Josan
 */

// Game: bean machine
public class Exercise721 {
    static int[] slots;
    
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter the number of balls");
        int balls = input.nextInt();
        
        System.out.println("Enter the number of slots");
        int slotsNumber = input.nextInt();
        
        slots = new int[slotsNumber];
        
        printPath(balls, slotsNumber);
        
        System.out.println();
        
        printHistogram(balls, slotsNumber);
        
    }
    
    public static void printPath(int balls, int slotsNumber) {
        String[] ballsPaths = new String[balls];
        for (int i = 0; i < balls; i++) {
            ballsPaths[i] = getPath(slotsNumber);
        }
        for (String e : ballsPaths)    
            System.out.println(e);
            
    }
    
    public static String getPath(int slotsNumber) {
        String path = "";
        int countR = 0;
        
            for (int j = 0; j < (slotsNumber - 1); j++) {
                int pile = (int)(Math.random() * 2);
                
                if (pile == 0) {
                    path += "R";
                    countR++;
                }
                else
                    path += "L";
            }
            slots[countR]++;
        return path;
    }
    
    public static void printHistogram(int balls, int slotsNumber) {
        for (int i = getMaxNumberOfBallsInSlots(); i > 0; i--) {
            for (int j = 0; j < slots.length; j++) {
                if (slots[j] == i) {
                    System.out.print("0");
                    slots[j]--;
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static int getMaxNumberOfBallsInSlots() {
        int max = slots[0];
        for (int i = 1; i < slots.length; i++) {
            if (max < slots[i])
                max = slots[i];
        }
        return max;
    }
}
