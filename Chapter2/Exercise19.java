/*
    (Geometry: area of a triangle) Write a program that prompts the user to enter
    three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
 */

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        double firstCornerX, secondCornerX, thirdCornerX, firstCornerY, secondCornerY, thirdCornerY, side1, side2, side3, area, perimeter;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Enter the coordonates of the first corner:");
            firstCornerX = sc.nextDouble();
            firstCornerY = sc.nextDouble();
            System.out.println("Enter the coordonates of the second corner:");
            secondCornerX = sc.nextDouble();
            secondCornerY = sc.nextDouble();
            System.out.println("Enter the coordonates of the third corner:");
            thirdCornerX = sc.nextDouble();
            thirdCornerY = sc.nextDouble();

            side1 = determineDistance(firstCornerX, firstCornerY, secondCornerX, secondCornerY);
            side2 = determineDistance(firstCornerX, firstCornerY, thirdCornerX, thirdCornerY);
            side3 = determineDistance(secondCornerX, secondCornerY, thirdCornerX, thirdCornerY);
            
            if(!isTriangle(side1, side2, side3))
                System.out.println("Can't form a triangle! Please try with other values!");
        } while(!isTriangle(side1, side2, side3));
        
        perimeter = (side1 + side2 + side3) / 2;
        area = Math.sqrt((perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3)));
        
        System.out.println("The area of the rectangle is: " + area);
    }
    
    private double determineDistance(double x1, double y1, double x2, double y2){
        return(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
    }
    
    private boolean isTriangle(double s1, double s2, double s3){
        return (s1 + s2 > s3 || s1 + s3 > s2 || s2 + s3 > s1);
    }
}
