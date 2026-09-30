public class Main2 {
    public static void main(String[] args ) {
        Circle c = new Circle();
        c.radius = 5.0;
        System.out.println(c.area());
    }
}
class Circle {
    double radius;
    double area()
    { return Math.PI*radius*radius;}
}