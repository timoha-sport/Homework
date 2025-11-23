package homework5;

import java.util.*;

class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String string : s) {
            Integer value = map.getOrDefault(string, 0) + 1;
            map.put(string, value);
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                list.add(entry.getKey());
            }
        }
        System.out.println(list.size());
        System.out.println(list);
        for (String string : list) {
            System.out.println(string + " " + map.get(string));
        }
    }
}
