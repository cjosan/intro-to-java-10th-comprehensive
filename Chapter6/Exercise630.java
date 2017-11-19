package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise630 {
    public static void main(String[] args) {
        int point, firstDice, secondDice;
        
        OUTER:
        while (true) {
            firstDice = rollDice();
            secondDice = rollDice();
            switch (isVictory(firstDice, secondDice)) {
                case -1:
                    System.out.println("You rolled " + firstDice + " + " + secondDice + " = " + (firstDice + secondDice) + "\nYou lose!");
                    break OUTER;
                case 0:
                    System.out.println("You rolled " + firstDice + " + " + secondDice + " = " + (firstDice + secondDice) + "\nYou win!");
                    break OUTER;
                default:
                    System.out.println("You rolled " + firstDice + " + " + secondDice + " = " + (firstDice + secondDice));
                    point = isVictory(firstDice, secondDice);
                    System.out.println("The point is: " + point);
                    isVictory(firstDice, secondDice, point);
                    break OUTER;
            }
        } 
    }
    
    public static int rollDice() {
        return ((int)(Math.random() * 6 + 1));
    }
    
    public static int isVictory(int firstDice, int secondDice) {
        int sum = firstDice + secondDice;
            
        switch (sum) {
            case 2:
            case 3:
            case 12:
                return -1;
            case 7:
            case 11:
                return 0;
            default:
                return sum;
        }
    }
    
    public static boolean isVictory(int firstDice, int secondDice, int point) {
        int sum;
        
        while (true) {
            firstDice = rollDice();
            secondDice = rollDice();
            sum = firstDice + secondDice;
            
            if (sum == point) {
                System.out.println("You rolled " + firstDice + " + " + secondDice + " = " + sum + "\nYou win!");
                return true;
            } else if (sum == 7) {
                System.out.println("You rolled " + firstDice + " + " + secondDice + " = " + sum + "\nYou lose!");
                return false;
            }
        }
    }
}
