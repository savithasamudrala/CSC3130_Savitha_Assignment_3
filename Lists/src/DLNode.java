public class DLNode {
    Book book;
    DLNode prev;
    DLNode next;

    public DLNode(Book book) {
        this.book = book;
        this.prev = null;
        this.next = null;
    }
}
