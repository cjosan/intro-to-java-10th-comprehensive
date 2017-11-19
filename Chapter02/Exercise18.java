/*
	(Print a table) Write a program that displays the following table. Cast floatingpoint
	numbers into integers.
	a b pow(a, b)
	1 2 1
	2 3 8
	3 4 81
	4 5 1024
	5 6 15625
 */

public class Exercise18 {
    public static void main(String[] args) {
        System.out.println("a" + "\t" + "b" + "\t" + "pow(a, b)");
        int b = 2;
        for(int a = 1; a <= 5; a++){
                System.out.println(a + "\t" + b + "\t" + (int)Math.pow(a, b));
                b += 1;
        }
    }
}
