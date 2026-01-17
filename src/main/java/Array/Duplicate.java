package Array;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
         int[] arr = { 1, 2, 1, 3, 4, 56 };

        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                System.out.println(num);

            }

        }
        System.out.println(set);
       
}


    7}
