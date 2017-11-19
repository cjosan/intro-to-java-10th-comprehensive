package introjava_ii;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise735 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] words = {"program", "apple", "android", "java", "spring", "programmer"};
        
        while (true) {
            startGame(words);
            
            System.out.print("\nDo you want to guess another word? Enter y or n > ");
            String choice = input.nextLine();
            
            // ask the player to continue
            if (Character.toLowerCase(choice.charAt(0)) == 'n')
                break;
        }
    }
    
    // game implementation
    public static int startGame(String[] words) {
        Scanner input = new Scanner(System.in);
        int miss = 0; // number of misses
        char letter;  // letter entered by user
        String guess; // user input
        char[] word = generateWord(words);
        char[] userGuess = new char[word.length];
        char[] guessedLetters = new char[0];
        
        // fill the word with stars
        for (int i = 0; i < userGuess.length; i++) {
            userGuess[i] = '*';
        }

        System.out.println("If you want to enter the whole word insert the space character\n");
        
        while (!Arrays.equals(word, userGuess)) {
            System.out.print("(Guess) enter a letter in word ");
            display(userGuess);
            System.out.print(" > ");
            
            guess = input.nextLine();
            letter = Character.toLowerCase(guess.charAt(0));
            
            // possibility to enter the whole word if space is pressed
            if (letter == ' ') {
                System.out.println("Enter the word > ");
                String tryWord = input.nextLine();
                
                if (Arrays.equals(toArray(tryWord), word)) {
                    System.out.print("The word is ");
                    display(word);
                    System.out.println(". You missed " + miss + " times");
                    return 0;
                } else {
                    System.out.print("The word was ");
                    display(word);
                    return -1;
                }
            }
            
            // verify if the letter is not already in the word
            if (contains(guessedLetters, letter)) {
                System.out.println("\t" + letter + " is already in the word");
                continue;
            }
            
            if (contains(word, letter)) {
                updateWord(word, userGuess, letter);
                guessedLetters = add(guessedLetters, letter);
            }
            else {
                miss++;
                System.out.println("\t" + letter + " is not in the word");
            }
        }
        
        System.out.print("The word is ");
        display(word);
        System.out.println(". You missed " + miss + " times");
        
        return 0;
    }
    
    // generate a random word from array
    public static char[] generateWord(String[] words) {
        int index = (int)(Math.random() * words.length);
        String word = words[index];
        
        return toArray(word);
    }
    
    // convert string to array
    public static char[] toArray(String s) {
        char [] array = new char[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            array[i] = s.charAt(i);
        }
        return array;
    }
    
    // display an array
    public static void display(char[] array) {
        for (char element : array) {
            System.out.print(element);
        }
    }
    
    // return true if the letter is in the array, and false if not
    public static boolean contains(char[] word, char letter) {
        for (int i = 0; i < word.length; i++) {
            if (letter == word[i])
                return true;
        }
        return false;
    }
    
    // change * to letter
    public static void updateWord(char[] word, char[] guess, char letter) {
        for (int i = 0; i < word.length; i++) {
            if (letter == word[i])
                guess[i] = letter;
        }
    }
    
    // add a new element to the array
    public static char[] add(char[] list, char letter) {
        char[] newList = new char[list.length + 1];
        System.arraycopy(list, 0, newList, 0, list.length);
        newList[list.length] = letter;
        list = newList;
        
        return list;
    }
}
