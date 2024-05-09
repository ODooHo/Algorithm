package code.면접;

import java.util.*;

public class 스트림_중복 {
    public static void main(String[] args) {

        /**
         * 한 문자열에서 중복 요소, stream X
         */
        String a = "Hello my name is ODooHo Hello";
        char[] temp = a.toCharArray();
        Set<Character> result = new HashSet<>();
        Set<Character> set = new HashSet<>();

        for (char c : temp) {
            boolean check = set.add(c);
            if (!check) {
                result.add(c);
            }
        }

        for (Character c : result) {
            System.out.print(c + " ");
        }
        System.out.println();

        /**
         * 문자열이 있는 List에서 중복 요소 찾는 방법
         */

        List<String> second = new ArrayList<>(
                Arrays.asList("A", "B", "C", "D", "D", "E", "E", "A")
        );

        List<String> dist = second.stream().distinct().toList();

        for (String s : dist) {
            second.remove(s);
        }

        System.out.println(second);

    }
}
