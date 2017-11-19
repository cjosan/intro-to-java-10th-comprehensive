package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise625 {
    public static void main(String[] args) {
        System.out.println(convertMillis(100000));
    }
    
     public static String convertMillis(long millis) {
        long hours = millis / 3600000;
        long minutes = (millis % 3600000) / 60000;
        long seconds = ((millis % 3600000) % 60000) / 1000;
        
        return (hours + ":" + minutes + ":" + seconds);
    }
}
