class Student {

    static String college = "KLH University";  // shared by all
    String name;                       // unique for each student

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }
}

public class Main25 {

    public static void main(String[] args) {

        Student s1 = new Student("Ravi");
        Student s2 = new Student("Priya");

        s1.display();
        s2.display();
    }
}
