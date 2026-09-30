public class Book {
    public static void main(String[] a) {
        Book1 b = new Book1();
        System.out.println(b.title);
    }
}
class Book1 {
    String title;
    Book1() { title = "Untitled"; }
}