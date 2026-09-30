public class Main1 {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.name = "Ravi";
        S1.display();
        Student S2 = new Student();
        S2.name = "Krishna";
        S2.display();
    }
}
class Student {
    String name;
    void
    display() {System.out.println("Name:" + name);}
}