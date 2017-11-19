package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise608 {
    public static void main(String[] args) {
        System.out.println("Celsius\t\tFahrenheit\t|\tFahrenheit\tCelsius");
        
        for (int i = 40, j = 120; i >= 31; i--, j -= 10) {
            System.out.printf("%d\t\t%.2f\t\t|\t%d\t\t%.2f\n", i, celsiusToFahrenheit(i), j, fahrenheitToCelsius(j));
        }
    }
    
    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
