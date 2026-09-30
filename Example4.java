import java.util.Scanner;

public class Example4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int[] employeeId = {101, 102, 103, 104, 105};

        System.out.print("Enter array index (0 to 4): ");
        int index = sc.nextInt();

        if (index >= 0 && index < employeeId.length) {
            System.out.println("EmployeeId: " + employeeId[index]);
        } else {
            System.out.println("Invalid array index.");
        }
        sc.close();
    }
}