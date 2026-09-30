public class ArrayRow {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }

        // Print as a row
        for(int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}