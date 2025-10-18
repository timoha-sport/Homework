package homework2;

import homework2.task1.Product;
import homework2.task2.Book;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> listProduct = new ArrayList<>();

        listProduct.add(new Product("Banana", 123));
        listProduct.add(new Product("Apple", 124));

        Product fruits = new Product("Banana", 123);
        System.out.println(listProduct.indexOf(fruits));


        List<Book> listBook = new ArrayList<>();

        listBook.add(new Book("tunTunSaur", "gpt"));
        listBook.add(new Book("maDinDinDon", "openAi"));

        Book bk = new Book("maDinDinDon", "openAi");
        System.out.println(listBook.lastIndexOf(bk));


        List<String> listPurchases = new ArrayList<>();
        listPurchases.add("Абрикос");
        boolean listFood = listPurchases.isEmpty();
        if (listFood) System.out.println("Список еды пуст");
        else System.out.println("Список еды не пуст");


        List<String> listTask = new ArrayList<>();
        listTask.add("Тренировка 18:00");
        listTask.clear();
        System.out.println(listTask);
    }
}
