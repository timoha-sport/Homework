package homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//
//        list.add(1);
//        list.add(6);
//        System.out.println(list);
//        System.out.println(list.size());


        MyArrayList<String> myList = new MyArrayList<>();
        myList.add("A");
        myList.add("B");
        myList.add("B");
        myList.add("D");
        System.out.println(myList.Size());
        myList.add(1, "W");
        myList.remove(2);
        System.out.println(myList.remove("W"));
        myList.clear();
        System.out.println(myList.contains("W"));
        System.out.println(myList.indexOf("B"));
        System.out.println(myList.lastIndexOf("B"));
        System.out.println(myList.isEmpty());
        System.out.println(Arrays.toString(myList.toArray()));
        for (int i = 0; i < myList.Size(); i++) {
            Object o = myList.get(i);
            System.out.print(o + " ");
        }
    }
}
