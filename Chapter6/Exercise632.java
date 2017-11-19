package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise632 {
    public static void main(String[] args) {
        int point, firstDice, secondDice;
        int winCount = 0;
        int loseCount = 0;
        
        for (int i = 0; i < 10000; i++) {
            OUTER:
            while (true) {
                firstDice = rollDice();
                secondDice = rollDice();
                switch (isVictory(firstDice, secondDice)) {
                    case -1:
                        loseCount++;
                        break OUTER;
                    case 0:
                        winCount++;
                        break OUTER;
                    default:
                        point = isVictory(firstDice, secondDice);
                        if (isVictory(firstDice, secondDice, point))
                            winCount++;
                        else
                            loseCount++;
                        break OUTER;
                }
            }
        }
        System.out.println("Games won: " + winCount);
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
                return true;
            } else if (sum == 7) {
                return false;
            }
        }
    }
}
