package code.면접;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class 두번째_높은_원소 {
    public static void main(String[] args) {

        Integer[] array = {5,3,2,7,8,4};

        Arrays.sort(array,Collections.reverseOrder());

        System.out.println(array[1]);
    }
}
