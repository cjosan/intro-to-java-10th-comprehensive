package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public static void main(String[] args) {
    public void go() {
        System.out.println("Kilograms\tPounds\t|  Pounds\tKilograms");
        for(int i = 1, j = 20; i < 100; i++, j += 5) {
            System.out.printf("%d\t\t%.1f\t|  %d\t\t%.2f\n", i, (i * 2.2), j, (j / 2.2));
        }
    }
}
