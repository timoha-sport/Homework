package homework1.task2;

public class ConsolePrinter<T> implements Printer<T> {

    public void print(T value){
        System.out.println("Printing: " + value.toString());
    }
}
