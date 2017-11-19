/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte userGuess;
        byte coin = (byte)(Math.random() * 2);
        
        do{  
            System.out.println("Head or tails (0/1)?");
            userGuess = sc.nextByte();
        }while(userGuess != 0 && userGuess != 1);
        
        if(coin == userGuess){
            System.out.println("You are right! It's " + headOrTail(coin));
        }
        else{
            System.out.println("You are wrong! It's " + headOrTail(coin));
        } 
    }
    
    private String headOrTail(byte side){
        if(side == 0)
            return "head";
        else
            return "tail";
    }
}
