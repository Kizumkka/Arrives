public class Task1{
    public static void main(String[] args){
        int[] a = {5, -3, 0, 8, -1, 0, 12, -7, 4, 2};
        int posit = 0, negat = 0, zero = 0;

        for (int i = 0; i < a.length; i++){
            if (a[i] > 0) {
                posit++;
            }else if (a[i] < 0){
                negat++;
            }else{
                zero++;
            }
        }

        System.out.print("Array: ");
        for (int i = 0; i < a.length; i++){
            System.out.print(" " + a[i]);
        }
        System.out.println("\n \n Positive: " + posit +
                "\n Negative: " + negat + "\n Zero: " + zero);
    }
}