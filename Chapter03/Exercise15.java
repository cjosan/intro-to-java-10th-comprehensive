/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int generatedNumber[] = new int[3];
        int userGuess[] = new int[3];
        
        for(int i = 0; i < 3; i++){
            generatedNumber[i] = (int)(Math.random() * 10);
        }
        String generatedDigits = Arrays.toString(generatedNumber);
        
        System.out.println("Enter 3 digits:");
        
        for(int i = 0; i < 3; i++){
            userGuess[i] = sc.nextInt();
        }
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(userGuess[i] == generatedNumber[j]){
                    count++;
                    generatedNumber[j] = -1;
                    break;
                }    
            }
        }
        
        if(Arrays.equals(userGuess, generatedNumber)){
            System.out.println("The number is " + generatedDigits + " Congratulations you won $10.000!");
        }
        else if(!Arrays.equals(userGuess, generatedNumber) && count == 3){
            System.out.println("The number is " + generatedDigits + " Congratulations you won $3000!");
        }
        else if(!Arrays.equals(userGuess, generatedNumber) && (count == 1 || count == 2)){
            System.out.println("The number is " + generatedDigits + " Congratulations you won $1000!");
        }
        else{
            System.out.println("The number is " + generatedDigits + " Sorry! Your guess was wrong!");
        }
    }
}
