class Customer {
    String name;
    int age;

    Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Customer Name:" + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Customer c = new Customer("Anita", 22);

        c.display();
    }
}