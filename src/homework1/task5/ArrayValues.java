package homework1.task5;

public class ArrayValues {
    public static <T extends Comparable<T>> int countGreaterThan(T[] arr, T elem){
        int count = 0;
        for (T i : arr) {
            if (i.compareTo(elem) > 0) {
                count++;
            }
        }
        return count;
    }

}
