package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise612 {
    public static void main(String[] args) {
        printChars('1', 'Z', 10);
    }
    
    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int count = 0;

        for (char i = ch1; i <= ch2; i++) {
            if (count != numberPerLine) {
                System.out.print(i);
                count++;
            } else {
                System.out.println(i);
                count = 0;
            }
        }
    }
}
