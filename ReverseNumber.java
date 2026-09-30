import java.util.Scanner;

public class ReverseNumber {

    static int reverse(int n, int rev) {
        if (n == 0) {
        return rev;
        }
         rev = rev * 10 + n % 10;

        return reverse(n / 10, rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Reverse = " + reverse(n, 0));
    }
}