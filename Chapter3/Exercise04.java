/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Exercise04 {
    public static void main(String[] args) {
        int monthNumber = 1 + (int)(Math.random() * 12);
        
        switch(monthNumber){
            case 1: System.out.println("The first month is January");
                    break;
            case 2: System.out.println("The second month is February");
                    break;
            case 3: System.out.println("The third month is March");
                    break;        
            case 4: System.out.println("The fourth month is April");
                    break;
            case 5: System.out.println("The fifth month is May");
                    break;
            case 6: System.out.println("The sixth month is June");
                    break;
            case 7: System.out.println("The seventh month is July");
                    break;
            case 8: System.out.println("The eighth month is August");
                    break;
            case 9: System.out.println("The ninth month is September");
                    break;
            case 10: System.out.println("The tenth month is October");
                    break;
            case 11: System.out.println("The eleventh month is November");
                    break;
            case 12: System.out.println("The twelfth month is December");
                    break;
        }
    }
}
