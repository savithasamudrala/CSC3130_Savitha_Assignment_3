public class DLList {
    DLNode head;

    public DLList() {
        this.head = null;
    }

    public void listAdd(Book p) {
        DLNode newNode = new DLNode(p);
        if (head == null) {
            head = newNode;
        } else {
            DLNode current = head;
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
        DLNode current = head;
        for (int i = 0; current != null && i < pos - 1; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            return;
        }
        DLNode toRemove = current.next;
        current.next = toRemove.next;
        if (current.next != null) {
            current.next.prev = current;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        DLNode current = head;
        while (current != null) {
            sb.append(current.book.toString()).append("\n");
            current = current.next;
        }
        return sb.toString();
    }
}