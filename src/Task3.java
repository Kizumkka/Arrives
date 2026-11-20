public class Task3 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60};
        int s = 0;

        for (int i = 0; i < a.length; i++) {
            s += a[i];
        }
        double average = (double)s/a.length;

        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > average) {
                c++;
            }
        }

        System.out.print("Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println("\n \nAverage: " + average + "\nNumbers above average: " + c);
    }
}