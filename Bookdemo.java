public class Bookdemo {
    public static void main(String[] a) {
        Book2 b = new Book2("Java", 349.0);
        System.out.println(b.title);
    }
}
class Book2 {
    String title; double price;
    Book2(String t, double p) {
        title = t; price = p;
    }
}