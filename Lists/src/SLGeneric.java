public class SLGeneric<T> {
    SLNodeGeneric<T> head;

    public SLGeneric() {
        this.head = null;
    }

    public void listAdd(T p) {
        SLNodeGeneric<T> newNode = new SLNodeGeneric<>(p);
        if (head == null) {
            head = newNode;
        } else {
            SLNodeGeneric<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void listRemove(int pos) {
        if (head == null) {
            return;
        }
        if (pos == 0) {
            head = head.next;
            return;
        }
        SLNodeGeneric<T> current = head;
        for (int i = 0; current != null && i < pos - 1; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            return;
        }
        current.next = current.next.next;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        SLNodeGeneric<T> current = head;
        while (current != null) {
            sb.append(current.data.toString()).append("\n");
            current = current.next;
        }
        return sb.toString();
    }
}
