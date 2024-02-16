public class Book {
    String t;
    String a;
    double p;
    public Book next;
    public Book prev;

    public Book(String title, String author, double price){
        t = title;
        a = author;
        p = price;
        this.next = null;
        this.prev = null;
    }
    public String toString() {
        return "[title: " + t + ", a: " + a + ", price: " + p + "]";
    }

}
