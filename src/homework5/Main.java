package homework5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : arr) {
            if (c != ' ' && !map.containsKey(c)) {
                map.put(c, 1);
            } else if (c != ' ') {
                Integer i = map.get(c) + 1;
                map.put(c, i);
            }
        }
        Set<Character> characters = map.keySet();
        for (Character character : characters) {
            System.out.println(character + " : " + map.get(character));
        }
    }
}
