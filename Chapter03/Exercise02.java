/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1, number2, number3, sum, userGuess;
        
        number1 = (int)(Math.random() * 10);
        number2 = (int)(Math.random() * 10);
        number3 = (int)(Math.random() * 10);
        sum = number1 + number2 + number3;
        
        System.out.println("What is the sum of " + number1 + ' ' + number2 + ' ' + number3 + ':');
        userGuess = sc.nextInt();
        
        if(userGuess == sum){
            System.out.println("You're right! The sum is " + sum);
        }
        else{
            System.out.println("You're Wrong! The right answer is " + sum);
        }
    }
}
