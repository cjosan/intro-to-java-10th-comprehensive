/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int numbers[] = new int[3];
        int temp;
        boolean swapped = false;
        
        System.out.println("Enter three integers:");
        for(int i =0; i < 3; i++){
            numbers[i] = sc.nextInt();
        }
        
        do{
            for(int i = 0; i < 2; i++){
                swapped = false;
                if (numbers[i] > numbers[i + 1]){
                temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
                swapped = true;
                }
            }
            
            if (swapped == false)
                break;
            
        }while(swapped == true);
        
        for(int element:numbers){
            System.out.println(element);
        }
    }            
}
