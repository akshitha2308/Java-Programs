import java.util.Scanner;

public class ParkingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         System.out.println("Enter Parking Duration:" );
         int parkingDuration = sc.nextInt();

        if ( parkingDuration > 8) {
            System.out.println("Extended Parking");
        } else {
          System.out.println("Regular Parking");
        }
    }
}
