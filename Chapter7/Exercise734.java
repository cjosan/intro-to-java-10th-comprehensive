package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise734 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string");
        String str = input.nextLine();
        
        System.out.println("The sorted string is " + sort(str));
    }
    
    public static String sort(String s) {
        int temp;
        char[] array = toArray(s);
        
        for (int i = 0; i < s.length(); i++) {
            char min = array[i];
            temp = i;
            
            for (int j = i; j < s.length(); j++) {
                if (min > array[j]) {
                    temp = j;
                    min = array[j];
                }
            }
            
            if (temp != i) {
                array[temp] = array[i];
                array[i] = min;
            }
        }
        s = toString(array);
        
        return s;
    }
    
    public static char[] toArray(String s) {
        char [] array = new char[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            array[i] = s.charAt(i);
        }
        return array;
    }
    
    public static String toString(char[] array) {
        String str = "";
        
        for (int i = 0; i < array.length; i++) {
            str += array[i];
        }
        return str;
    }
}
