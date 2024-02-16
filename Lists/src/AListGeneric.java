public class AListGeneric<T> {
    private T[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public AListGeneric() {
        this.array = (T[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void listAdd(T p) {
        if (size < array.length) {
            array[size] = p;
            size++;
        } else {
            int newMax = array.length * 2;
            T[] newArray = (T[]) new Object[newMax];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
            array[size] = p;
            size++;
        }
    }

    public void listRemove(int pos) {
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position");
        }
        array[pos] = null;
        for (int i = pos; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(array[i]).append("\n");
        }
        return sb.toString();
    }
}
