package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise701 {
    public static void main(String[] args) {
        int[] studentsScores = initStudentsScores();
        int best = findBestScore(studentsScores);
        printStudentsGrades(studentsScores, best);
    }
    
    public static int[] initStudentsScores() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.println("Enter the number of students ");
        int n = sc.nextInt();
        int[] studentsScores = new int[n];
        
        
        System.out.println("Enter " + n + " scores");
        
        for (int i = 0; i < n; i++) {
            studentsScores[i] = sc.nextInt();
        }
        return studentsScores;
    }
    
    public static int findBestScore(int[] scores) {
        int best = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (best < scores[i])
                best = scores[i];
        }
        return best;
    }
    
    public static void printStudentsGrades(int[] scores, int best) {
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + getGrade(scores[i], best));
        }
    }
    
    public static String getGrade(int n, int max) {
        if (n <= max && n >= max - 10)
            return "A";
        else if (n < max - 10 && n >= max - 20)
            return "B";
        else if (n < max - 20 && n >= max - 30)
            return "C";
        else if (n < max - 30 && max >= max - 40)
            return "D";
        else return "F";
    } 
}
