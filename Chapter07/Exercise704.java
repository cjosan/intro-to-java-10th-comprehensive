package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise704 {
    public static void main(String[] args) {
        int[] scores = initArray();
        int[] counters = new int[3];
        compareToAvg(scores, counters);
        
        System.out.println("above: " + counters[2] + "\nequal: " + counters[1] + "\nunder: " + counters[0]);

    }
    
    public int[] initArray() {
        java.util.Scanner input = new java.util.Scanner(System.in);

        int[] array = new int[100];
        
        System.out.println("Enter scores");
        
        for (int i = 0; i < array.length; i++) {
            int element = input.nextInt();
            
            if (element >= 0)
                array[i] = element;
            else
                break;
        }
        
        return array;
    }
    
    public static int getAverage(int[] array) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
                count++;
            }    
        }
        
        return (sum / count);
    }
    
    public static void compareToAvg(int[] array, int[] counters) {
        int average = getAverage(array);
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                if (array[i] < average)
                    counters[0]++;
                else if (array[i] > average)
                    counters[2]++;
                else
                    counters[1]++;
            }
        }
    }
}
