public class Task2 {
    public static void main(String[] args) {
        int[] a = {12, 5, 28, 3, 19, 7, 15, 9};
        int max = 0, min = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[max]) {
                max = i;
            }
            if (a[i] < a[min]) {
                min = i;
            }
        }
        System.out.print("Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println("\n \nLargest: " + a[max] +
                " at index " + max + "\nSmallest: " + a[min] + " at index " + min);
    }
}