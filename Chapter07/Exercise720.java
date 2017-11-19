package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise720 {
    public static void main(String[] args) {
        int[] numbers = {1, 3 ,5, 2, 9, 1, 8};
        selectionSort(numbers);
        
        for (int n : numbers) {
            System.out.println(n);
        }
    }
    
    // decreasing order
    public static void selectionSort(int[] list) {
	int temp;
	for (int i = 0; i < list.length; i++) {
            int max = list[i];
            temp = i;
            for (int j = i + 1; j < list.length; j++) {
		if (max < list[j]) {
                    temp = j;
                    max = list[j];
		}
            }

            if (temp != i) {
		list[temp] = list[i];
		list[i] = max;
            }
	}
    }
}
