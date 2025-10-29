package homework3;

import java.util.Arrays;
import java.util.Objects;


public class MyArrayList<E> {

    private Object[] arr = new Object[10];
    private int size = 0;
    private int code;

    public int size() {
        return size;
    }

    public boolean add(E e) {
        ensureCapacity(size + 1);
        arr[size++] = e;
        return true;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > arr.length) {
            arr = new Object[arr.length * 2];
            int newCapacity = arr.length * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            arr = Arrays.copyOf(arr, newCapacity);
        }
    }

    public void add(int index, E element) {
        checkIndex(index);
        ensureCapacity(size + 1);
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = element;
        size++;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона");
        }
    }


    public Object get(int index) {
        checkIndex(index);
        return arr[index];
    }

    public void set(int index, E element) {
        checkIndex(index);
        arr[index] = element;
    }

    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    public boolean remove(Object o) {
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(o)) {
                flag = true;
            }
            if (flag) {
                arr[i] = arr[i + 1];
            }
        }
        if (flag) size--;
        return flag;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            arr[i] = null;
        }
    }

    public boolean contains(Object o) {
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(o)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty(){
        return size != 0;
    }

    public Object[] toArray() {
        Object[] arrObj = new Object[size];
        for (int i = 0; i < size; i++) {
            arrObj[i] = arr[i];
        }
        return arrObj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyArrayList myList = (MyArrayList) o;
        return code == myList.code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

}
