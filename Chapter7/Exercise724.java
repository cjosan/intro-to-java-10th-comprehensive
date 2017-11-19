package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise724 {
    public static void main(String[] args) {
        String[] pickedCards = new String[4];
        int picks = getRandomCards(pickedCards);
        
        displayPickedCards(pickedCards);
        System.out.println("Number of picks: " + picks);
    }
    
    public static int getRandomCards(String[] pickedCards) {
        int[] pickedSuits = new int[4];
        int picks = 0;
        
        while (true) {
            int value = (int)(Math.random() * 13);
            int suit = (int)(Math.random() * 4);
            picks++;
            
            if (!isSuitPicked(pickedSuits, suit)) {
                pickedSuits[suit]++;
                addCard(value, suit, pickedCards);
            }
            
            int count = 0;
            for(int s : pickedSuits) {
                if (s == 0)
                    count++;
            }
            
            if (count == 0)
                break;
        }
        return picks;
    }
    
    public static boolean isSuitPicked(int[] pickedSuits, int suit) {
        return pickedSuits[suit] != 0;
    }
    
    public static void addCard(int value, int suit, String[] pickedCards) {
        for (int i = 0; i < pickedCards.length; i++) {
            if (pickedCards[i] == null) {
                pickedCards[i] = getCard(value) + " of " + getSuit(suit);
                break;
            }
        }
    }
    
    public static String getCard(int value) {
        if (value > 0 && value <= 9)
            return Integer.toString(value + 1);
        
        switch (value) {
            case 0:
                return "Ace";
            case 10:
                return "Jack";
            case 11:
                return "Queen";
            case 12:
                return "King";
            default:
                return "Wrong card";
        }
    }
    
    public static String getSuit(int suit) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        
        return suits[suit];
    }
    
    public static void displayPickedCards(String[] pickedCards) {
        for (String card : pickedCards) {
            System.out.println(card);
        }
    }
}
