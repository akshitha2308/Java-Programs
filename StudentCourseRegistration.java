import java.util.Scanner;

class Student {
    private String studentName;
    private int rollNumber;
    private int marks;
    private String courseName;
    private int courseCredits;

    // Parameterized constructor
    public Student(String studentName, int rollNumber, int marks, String courseName, int courseCredits) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    // Calculate course fee (Rs. 1500 per credit)
    public double calculateFee() {
        return courseCredits * 1500;
    }

    // Check eligibility (marks >= 50)
    public boolean checkEligibility() {
        return marks >= 50;
    }

    // Calculate scholarship percentage
    public double calculateScholarship() {
        if (marks >= 85) {
            return 0.20; // 20%
        } else if (marks >= 70) {
            return 0.10; // 10%
        } else {
            return 0.0;  // No scholarship
        }
    }

    // Calculate final fee after scholarship
    public double calculateFinalFee() {
        double totalFee = calculateFee();
        double scholarshipAmount = totalFee * calculateScholarship();
        return totalFee - scholarshipAmount;
    }

    // Display all details
    public void displayDetails() {
        double totalFee = calculateFee();
        double scholarshipPercent = calculateScholarship() * 100;
        double scholarshipAmount = totalFee * calculateScholarship();
        double finalFee = calculateFinalFee();

        System.out.println("\n--- Student Course Registration Details ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Credits: " + courseCredits);
        System.out.println("Eligibility: " + (checkEligibility() ? "Eligible" : "Not Eligible"));
        System.out.println("Total Fee: Rs. " + totalFee);
        System.out.println("Scholarship: " + scholarshipPercent + "% (Rs. " + scholarshipAmount + ")");
        System.out.println("Final Fee after Scholarship: Rs. " + finalFee);
    }
}

public class StudentCourseRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read student and course details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();

        System.out.print("Enter Course Credits: ");
        int credits = sc.nextInt();

        // Create Student object
        Student student = new Student(name, roll, marks, course, credits);

        // Check eligibility
        if (student.checkEligibility()) {
            student.displayDetails();
        } else {
            System.out.println("\nStudent is not eligible for registration (marks below 50).");
        }

        sc.close();
    }
}
