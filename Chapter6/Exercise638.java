package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise638 {
    public static void main(String[] args) {
        final int CHARACTERS_PER_LINE = 10;
        int count = 0;
        
        for (int i = 0; i < 200; i++) {
            if (i <= 100) {
                count++;
                if (count % CHARACTERS_PER_LINE == 0) {
                    System.out.println(getRandomUppercaseLetter());
                } else {
                    System.out.print(getRandomUppercaseLetter());
                }
            } else {
                count++;
                if (count % CHARACTERS_PER_LINE == 0) {
                    System.out.println(getRandomDigit());
                } else {
                    System.out.print(getRandomDigit());
                }
            }
        }
    }
    
    public char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 - 1));
    }
    
    public char getRandomUppercaseLetter() {
        return getRandomCharacter('A', 'Z');
    }
    
    public char getRandomDigit() {
        return getRandomCharacter('1', '9');
    }
}
