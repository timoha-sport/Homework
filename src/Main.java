import task1.Container;
import task2.ConsolePrinter;
import task2.Printer;
import task3.Pair;
import task4.Сompare;
import task5.ArrayValues;

class Main{
    public static void main(String[] args) {
        Container<String> con = new Container<>("Hello");
        System.out.println(con.getItem().length());

        Container<Double> cen = new Container<>(3.14);
        System.out.println(cen.getItem() * 2);

        ConsolePrinter<Integer> cp = new ConsolePrinter<>();
        cp.print(123);
        ConsolePrinter<String> cpStr = new ConsolePrinter<>();
        cpStr.print("gdbgnjkbgetkj");

        Pair<String, Integer> pr = new Pair<>("Java", 8);
        System.out.println("Язык "+ pr.getFirst() + " существует " + pr.getSecond() + " лет.");


        System.out.println(Сompare.minValue(12, 34));
        System.out.println(Сompare.minValue("jhgfjkrhgk", "jdkfshjf"));

        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};
        String[] arrStr = new String[]{"egreg", "rggrg" ,"fgdfgbfbgdbgbg"};
        System.out.println(ArrayValues.countGreaterThan(arr, 4));
        System.out.println(ArrayValues.countGreaterThan(arrStr, "ghtghbg"));

    }
}