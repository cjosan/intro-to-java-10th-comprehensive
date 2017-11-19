package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise729 {
    public static void main(String[] args) {
        int[] cards = new int[4];
        int sum = 0;
        int picks = 0;
        
        while (true) {
            for (int i = 0; i < cards.length; i++) {
                cards[i] = (int)(1 + Math.random() * 13);
                picks++;
            }
            
            sum = getSum(cards);
            
            if (sum == 24) {
                System.out.println("You picked:");

                for (int card : cards)
                    System.out.println(getCardName(card));

                System.out.println("The number of picks to yield 24 is: " + picks);
                break;
            }
        }
    }
    
    public static String getCardName(int card) {
        if (card > 1 && card <= 10)
            return Integer.toString(card);
        
        switch (card) {
            case 1:
                return "Ace";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                return "Invalid card";
        }
    }
    
    public static int getSum(int[] list) {
        int sum = 0;
        
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum;
    }
}
