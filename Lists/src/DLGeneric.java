public class DLGeneric<T> {
    DLNodeGeneric<T> head;
    public DLGeneric() {
        this.head = null;
    }

    public void listAdd(T p) {
        DLNodeGeneric<T> newNode = new DLNodeGeneric<>(p);
        if (head == null) {
            head = newNode;
        } else {
            DLNodeGeneric<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void listRemove(int pos) {
        if (head == null) {
            return;
        }
        if (pos == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }
        DLNodeGeneric<T> current = head;
        for (int i = 0; current != null && i < pos - 1; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            return;
        }
        DLNodeGeneric<T> toRemove = current.next;
        current.next = toRemove.next;
        if (current.next != null) {
            current.next.prev = current;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        DLNodeGeneric<T> current = head;
        while (current != null) {
            sb.append(current.data.toString()).append("\n");
            current = current.next;
        }
        return sb.toString();
    }
}
