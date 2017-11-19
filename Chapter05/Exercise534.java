package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise534 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte userGuess, computerGuess;
        byte computerCount = 0;
        byte playerCount = 0;
        
        do {
            computerGuess = (byte)(Math.random() * 3);
            System.out.println(computerGuess);
            System.out.println("scissor(0), rock(1), paper(2):");
            userGuess = sc.nextByte();
            

            if(userGuess == computerGuess){
                System.out.println("The computer is " + getForm(computerGuess) + "." + " You are " + getForm(userGuess) + "." + " It is a draw!");
            }
            else if(userGuess == 0 && computerGuess == 1){
                System.out.println("The computer is " + getForm(computerGuess) + "." + " You are " + getForm(userGuess) + "." + " Computer wins!");
                computerCount++;
            }
            else if(userGuess == 0 && computerGuess == 2){
                System.out.println("The computer is " + getForm(computerGuess) + "." + " You are " + getForm(userGuess) + "." + " You win!");
                playerCount++;
            }
            else if(userGuess == 1 && computerGuess == 0){
                System.out.println("The computer is " + getForm(computerGuess) + "." + " You are " + getForm(userGuess) + "." + " You win!");
                playerCount++;
            }
            else if(userGuess == 1 && computerGuess == 2){
                System.out.println("The computer is " + getForm(computerGuess) + "." + " You are " + getForm(userGuess) + "." + " Computer wins!");
                computerCount++;
            }
            else if(userGuess == 2 && computerGuess == 0){
                System.out.println("The computer is " + getForm(computerGuess) + "." + " You are " + getForm(userGuess) + "." + " Computer wins!");
                computerCount++;
            }
            else if(userGuess == 2 && computerGuess == 1){
                System.out.println("The computer is " + getForm(computerGuess) + "." + " You are " + getForm(userGuess) + "." + " You win!");
                playerCount++;
            }
        } while (playerCount - computerCount < 2 && computerCount - playerCount < 2);
        
        if (playerCount > computerCount)
            System.out.println("The score is: " + playerCount + " : " + computerCount + "\nYou win the game!");
        else
            System.out.println("The score is: " + playerCount + " : " + computerCount + "\nComputer wins the game!");
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
