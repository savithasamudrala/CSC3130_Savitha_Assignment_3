public class DLNodeGeneric<T> {
    T data;
    DLNodeGeneric<T> prev;
    DLNodeGeneric<T> next;

    public DLNodeGeneric(T data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
