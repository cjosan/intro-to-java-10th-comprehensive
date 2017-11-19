package introjava_ii;

import java.util.Arrays;

/**
 *
 * @author Cornel Josan
 */
public class Exercise703 {
    public static void main(String[] args) {
        int[] integers = initIntegerArray();
        int [] distincts = getDistinctNumbers(integers);
        Arrays.sort(distincts);
        int[] occurences = countOccurences(integers, distincts);
        displayOccurences(distincts, occurences);
    }
    
    public static int[] initIntegerArray() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        int [] integers = new int[100];
        int count = 0;
        System.out.println("Enter integers between 1 and 100");
        
        for (int i = 0; i < 100; i++) {
            integers[i] = sc.nextInt();
            
            if (integers[i] == 0)
                break;
            
            count++;
        }
        int[] newIntegers = new int[count];
        System.arraycopy(integers, 0, newIntegers, 0, count);
        
        return newIntegers;
    }
    
    public static int[] getDistinctNumbers(int[] integers) {
        int[] n = new int[integers.length];
        System.arraycopy(integers, 0, n, 0, integers.length);
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] != 0) {   
                count++;
            
                for (int j = i + 1; j < n.length; j++) {
                    if (n[i] == n[j])
                        n[j] = 0;
                }
            }
        }

        int[] newDistincts = new int[count];
        for (int i = 0; i < newDistincts.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (n[j] != 0) {
                    newDistincts[i] = n[j];
                    n[j] = 0;
                    break;
                }
            }
        }
        return newDistincts;
    }
    
    public static int[] countOccurences(int[] integers, int[] distincts) {
        int[] occurences = new int[distincts.length];
        int count = 0;
        
        for (int i = 0; i < distincts.length; i++) {
            for (int j = 0; j < integers.length; j++) {
                if (distincts[i] == integers[j])
                    count++;
            }
            occurences[i] = count;
            count = 0;
        }
        return occurences;
    }
    
    public static void displayOccurences(int[] distincts, int[] occurences) {
        for (int i = 0; i < occurences.length; i++) {
                System.out.println(distincts[i] + " occurs " + occurences[i] + " " + spellCorrect(occurences[i]));
        }
    }
    
    public static String spellCorrect(int n) {
        if (n > 1 && n != 0)
            return "times";
        else
            return "time";
    }
}