/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Exercise24 {
    public static void main(String[] args) {
        int rank = 1 + (int)(Math.random() * 13);
        int suit = (int)(Math.random() * 4);
        
        pickTheCard(rank, suit);
    }
    
    public void pickTheCard(int rank, int suit){
        String rankName, suitName;
        
        switch(rank){
            case 1:
                rankName = "Ace";
                break;
            case 11:
                rankName = "Jack";
                break;
            case 12:
                rankName = "Queen";
                break;
            case 13:
                rankName = "King";
                break;
            default:
                rankName = String.valueOf(rank);        
        }
        
        switch(suit){
            case 0:
                suitName = "Clubs";
                break;
            case 1:
                suitName = "Diamonds";
                break;
            case 2:
                suitName = "Hearts";
                break;
            case 3:
                suitName = "Spades";
                break;
            default:
                suitName = "Invalid suit";
        }
        
        System.out.println("The card you picked is " + rankName + " of " + suitName);
    }
}
