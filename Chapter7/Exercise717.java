package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise717 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.println("Enter the number of students");
        int studentsNumber = Integer.parseInt(input.nextLine());
        
        String[] names = new String[studentsNumber];
        int[] scores = new int[studentsNumber];
        
        for (int i = 0; i < studentsNumber; i++) {
            System.out.println("Enter the name and score of " + (i + 1) + " student:");
            names[i] = input.nextLine();
            scores[i] = Integer.parseInt(input.nextLine()); 
        }
        
        selectionSort(scores,names);
        
        for (int i = 0; i < studentsNumber; i++) {
            System.out.println(scores[i] + " " + names[i]);
        }
    }
    
    public static void selectionSort(int[] scores, String[] names) {
	int temp;
        String tempName;
	for (int i = 0; i < scores.length; i++) {
            int max = scores[i];
            tempName = names[i];
            temp = i;
            
            for (int j = i + 1; j < scores.length; j++) {
		if (max < scores[j]) {
                    temp = j;
                    max = scores[j];
                    tempName = names[j];
		}
            }

            if (temp != i) {
		scores[temp] = scores[i];
                names[temp] = names[i];
		scores[i] = max;
                names[i] = tempName;
            }
	}
    }
}
