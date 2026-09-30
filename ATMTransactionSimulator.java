import java.util.ArrayList;
import java.util.Scanner;

public class ATMTransactionSimulator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPIN = 1234;
        double balance = 10000.00;

        ArrayList<String> transactions = new ArrayList<>();

        int attempts = 0;
        boolean loginSuccessful = false;

        System.out.println("=================================");
        System.out.println("       WELCOME TO ATM");
        System.out.println("=================================");

        // PIN Verification
        while (attempts < 3) {

            System.out.print("Enter your 4-digit PIN: ");
            int pin = sc.nextInt();

            if (pin == correctPIN) {
                loginSuccessful = true;
                System.out.println("PIN verified successfully!");
                break;
            } else {
                attempts++;
                System.out.println("Invalid PIN!");

                if (attempts < 3) {
                    System.out.println("Please try again.");
                }
            }
        }

        // If PIN is incorrect 3 times
        if (!loginSuccessful) {
            System.out.println("\nToo many incorrect attempts.");
            System.out.println("Your account has been temporarily blocked.");
            sc.close();
            return;
        }

        // ATM Menu
        while (true) {

            System.out.println("\n=================================");
            System.out.println("          ATM MENU");
            System.out.println("=================================");
            System.out.println("1. Balance Check");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Mini Statement");
            System.out.println("5. Exit");
            System.out.println("=================================");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Balance Check
                    System.out.println("\n----- BALANCE CHECK -----");
                    System.out.print("Current Balance: ₹" + balance);
                    break;

                case 2:
                    // Withdraw
                    System.out.print("\nEnter amount to withdraw: ₹");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Invalid amount.");
                    } 
                    else if (withdraw > balance) {
                        System.out.println("Insufficient balance.");
                    } 
                    else {
                        balance = balance - withdraw;

                        System.out.println("Withdrawal successful!");
                        System.out.println("Please collect your cash.");
                        System.out.println("Remaining Balance: ₹" + balance);

                        transactions.add("Withdraw: ₹" + withdraw);
                    }
                    break;

                case 3:
                    // Deposit
                    System.out.print("\nEnter amount to deposit: ₹");
                    double deposit = sc.nextDouble();

                    if (deposit <= 0) {
                        System.out.println("Invalid amount.");
                    } 
                    else {
                        balance = balance + deposit;

                        System.out.println("Deposit successful!");
                        System.out.println("Updated Balance: ₹" + balance);

                        transactions.add("Deposit: ₹" + deposit);
                    }
                    break;

                case 4:
                    // Mini Statement
                    System.out.println("\n===== MINI STATEMENT =====");

                    if (transactions.isEmpty()) {
                        System.out.println("No transactions available.");
                    } 
                    else {
                        for (String transaction : transactions) {
                            System.out.println(transaction);
                        }
                    }

                    System.out.println("--------------------------");
                    System.out.println("Current Balance: ₹" + balance);
                    System.out.println("==========================");
                    break;

                case 5:
                    // Exit
                    System.out.println("\nThank you for using our ATM.");
                    System.out.println("Please collect your card.");
                    System.out.println("Have a nice day!");

                    sc.close();
                    break;

                default:
                    System.out.println("Invalid choice!");
                    System.out.println("Please enter a number between 1 and 5.");
            }

            // Exit ATM
            if (choice == 5) {
                break;
            }
        }
    }
}