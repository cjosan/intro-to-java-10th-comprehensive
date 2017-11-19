/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1, number2, difference, userGuess;
        
        number1 = (int)(Math.random() * 100);
        number2 = (int)(Math.random() * 100);
        
        if(number1 >= number2){
            System.out.println("What is the difference between: " + number1 + " and " + number2 + ':');
            userGuess = sc.nextInt();
            difference = number1 - number2;
        }
        else{
            System.out.println("What is the difference between: " + number2 + " and " + number1 + ':');
            userGuess = sc.nextInt();
            difference = number2 - number1;
        }
        
        if(userGuess == difference){
            System.out.println("You're right! The difference is " + difference);
        }
        else{
            System.out.println("You're Wrong! The right answer is " + difference);
        }
    }    
}
