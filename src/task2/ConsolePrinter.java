package task2;

public class ConsolePrinter<T> implements Printer{

    public void print(T value){
        System.out.println("Printing: " + value.toString());
    }
}
