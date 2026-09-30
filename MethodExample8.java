public class MethodExample8 {

    void display() {
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args) {
        MethodExample8 obj = new MethodExample8();
        obj.display();
    }
}
