class Employee {
    String name;
    int id;

    Employee() {
        name = "Unknown";
        id = 0;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }

    public static void main(String[] args) {
        Employee e = new Employee();

        e.display();
    }
}