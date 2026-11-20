import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] sc = new int[5];

        for (int i = 0; i < sc.length; i++) {
            int v;
            while (true) {
                System.out.print(" Enter sc:" + (i + 1) + " (0-100): ");
                if (!s.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a whole number.");
                    s.next();
                    continue;
                }
                v = s.nextInt();
                if (v >= 0 && v <= 100) {
                    break;
                }
                System.out.println("Score must be between 0-100. Try again.");
            }
            sc[i] = v;
        }
        int pass = 0, fail = 0, sum = 0;
        for (int i = 0; i < sc.length; i++) {
            if (sc[i] >= 60) {
                pass++;
            }else{
                fail++;
            }
            sum += sc[i];
        }
        double av = (double) sum/sc.length;

        System.out.print("Scores: ");
        for (int i = 0; i < sc.length; i++) {
            System.out.print(" " + sc[i]);
        }
        System.out.println("\n\nPassed: " + pass + "\nFailed: " + fail + "\nAverage: " + av);

        s.close();
    }
}
