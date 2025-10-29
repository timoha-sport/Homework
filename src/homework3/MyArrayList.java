package homework3;

import java.util.Objects;

public class MyArrayList<E> {

    private Object[] arr = new Object[10];
    private int size = 0;
    private int code;

    public int Size() {
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
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона");
        }
        if (size == arr.length) {
            increaseCapacity();
        }
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = element;
        size++;
    }

    private void increaseCapacity() {
    }


    public Object get(int index) {
        return arr[index];
    }

    public void set(int index, E element) {
        arr[index] = element;
    }

    public void remove(int index) {
        for (int i = index; i < size; i++) {
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
        arr = new MyArrayList[10];
        size = 0;
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
        for (int i = 0; i < size; i++) {
            if (arr[i] != null) {
                return false;
            }
        }
        return true;
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
