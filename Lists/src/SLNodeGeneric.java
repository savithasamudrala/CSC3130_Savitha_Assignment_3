public class SLNodeGeneric<T>{
    T data;
    SLNodeGeneric<T> next;

    public SLNodeGeneric(T data) {
        this.data = data;
        this.next = null;
    }
}
