package homework6;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : arr) {
            if (c != ' ') {
                Integer i = map.getOrDefault(c, 0) + 1;
                map.put(c, i);
            }
        }
        Set<Character> characters = map.keySet();
        for (Character character : characters) {
            System.out.println(character + " : " + map.get(character));
        }
    }
}