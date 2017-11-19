/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte userGuess, computerGuess;
        System.out.println("scissor(0), rock(1), paper(2):");
        userGuess = sc.nextByte();
        computerGuess = (byte)(Math.random() * 3);
        
        if(userGuess == computerGuess){
            System.out.println("The computer is " + getForm(computerGuess) + "." + " You are " + getForm(userGuess) + "." + " It is a draw!");
        }
        else if(userGuess == 0 && computerGuess == 1){
            System.out.println("The computer is " + getForm(computerGuess) + "." + " You are " + getForm(userGuess) + "." + " Computer wins!");
        }
        else if(userGuess == 0 && computerGuess == 2){
            System.out.println("The computer is " + getForm(computerGuess) + "." + " You are " + getForm(userGuess) + "." + " You win!");
        }
        else if(userGuess == 1 && computerGuess == 0){
            System.out.println("The computer is " + getForm(computerGuess) + "." + " You are " + getForm(userGuess) + "." + " You win!");
        }
        else if(userGuess == 1 && computerGuess == 2){
            System.out.println("The computer is " + getForm(computerGuess) + "." + " You are " + getForm(userGuess) + "." + " Computer wins!");
        }
        else if(userGuess == 2 && computerGuess == 0){
            System.out.println("The computer is " + getForm(computerGuess) + "." + " You are " + getForm(userGuess) + "." + " Computer wins!");
        }
        else if(userGuess == 2 && computerGuess == 1){
            System.out.println("The computer is " + getForm(computerGuess) + "." + " You are " + getForm(userGuess) + "." + " You win!");
        }
    }    
    
    public String getForm(byte shape){
        switch(shape){
            case 0:
                return "scissor";
            case 1:
                return "rock";
            case 2:
                return "paper";
        }
        return "You entered a wrong number";
    }
}
