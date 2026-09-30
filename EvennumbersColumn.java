public class EvennumbersColumn {
    public static void main(String[] args) {
        int[] arr = new int[5];

         int index = 0;  
         for(int i = 2; i % 2 == 0; i += 2) {
            arr[index] = i;
            System.out.println(arr[index]);
            index++;
         }
    }
}