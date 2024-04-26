package code.면접;

import java.util.*;

public class 가장_긴_문자열 {
    public static void main(String[] args) {
        List<String> temp = new ArrayList<>(
                Arrays.asList("ASFAS", "asfqwtdg", "ewidjjdbiusdjbius", "aujfwruas")
        );


        int max = 0;
        String result = "";
        for (String s : temp) {
            int current = s.length();
            if (max < current) {
                max = current;
                result = s;
            }

        }

        String result2 = temp.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse(null);

        System.out.println(result);
        System.out.println(result2);
    }
}
