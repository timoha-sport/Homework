package homework3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//
//        list.add(1);
//        list.add(6);
//        System.out.println(list);
//        System.out.println(list.size());

        MyArrayList<Integer> myList = new MyArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        System.out.println(myList.getSize());
        myList.add(1, 5);
        for (int i = 0; i < myList.getSize(); i++) {
            Object o = myList.get(i);
            System.out.print(o + " ");
        }
    }
}
