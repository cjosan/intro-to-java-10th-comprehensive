package introjava_iii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise803 {
    public static void main(String[] args) {
        // Students' answers to the questions
        char[][] answers = {
        {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
        {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
        {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
        {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        
        int[][] scores = new int[answers.length][2];
        
        // Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        // Grade all answers
        for (int i = 0; i < answers.length; i++) {
            // Grade one student
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                correctCount++;
            }
            scores[i][0] = i;
            scores[i][1] = correctCount;
        }
        
        sort(scores);
        
        for (int[] score : scores) {
            System.out.println("Student " + score[0] + "'s correct count is " + score[1]);
        }
    }
    
    public static void sort(int[][] array) {
        int index;
        for (int i = 0; i < array.length - 1; i++) {
            int[] max = array[i];
            index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (max[1] < array[j][1]) {
                    max = array[j];
                    index = j;
                }
            }
            
            if (index != i) {
                array[index] = array[i];
                array[i] = max;
            }
        }
    }
}