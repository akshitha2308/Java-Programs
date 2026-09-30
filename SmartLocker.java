public class SmartLocker {
    public static void main(String[] args) {

        int lockerNumber = 101;
        String studentId = "KLH123";
        String studentName = "Shree";
        int accessPin = 1234;
        String lockerStatus = "available";
        double storageCapacity = 50.0;
        boolean isLocked = false;

        System.out.println("Locker Number: " + lockerNumber);
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Access PIN: " + accessPin);
        System.out.println("Locker Status: " + lockerStatus);
        System.out.println("Storage Capacity: " + storageCapacity + " litres");
        System.out.println("Locked: " + isLocked);
    }
}