package homework3;
import java.util.Collection;

public class MyArrayList<E> {

    private Object[] arr = new Object[10];
    private int size = 0;

    public boolean add(E e) {
        if (size < arr.length) {
            arr[size++] = e;
            return true;
        }
        return false;
    }

    public void add(int index, E element) {
        arr[index++] = element;
        size = index;
    }
}
