package homework3;

public class MyArrayList<E> {

    private Object[] arr = new Object[10];
    private int size = 0;

    public int getSize() {
        return size;
    }

    public boolean add(E e) {
        if (size < arr.length) {
            arr[size++] = e;
            return true;
        }
        return false;
    }

    public void add(int index, E element) {
        Object temp = element;
        Object tempSwap = temp;
        size++;
        for (int i = index; i < size; i++) {
            temp = arr[i];
            arr[i] = tempSwap;
            tempSwap = temp;
        }
    }

    public Object get(int index) {
        return arr[index];
    }

    public void set(int index, E element) {
            arr[index] = element;
    }

}
