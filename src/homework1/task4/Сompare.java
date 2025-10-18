package homework1.task4;

public class Сompare {
    public static <T extends Comparable<T>> T minValue(T a, T b){
        return a.compareTo(b) > 0 ? b : a;
    }
}
