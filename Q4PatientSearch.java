import java.util.Scanner;

public class Q4PatientSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tokens = {101, 105, 110, 115, 120, 125};

        System.out.print("Enter token to search: ");
        int key = sc.nextInt();

        int position = -1;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] == key) {
                position = i;
                break;
            }
        }

        if (position != -1)
            System.out.println("Token found at position " + (position + 1));
        else
            System.out.println("Token not found.");

        sc.close();
    }
}