package lesson7;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayRunner {

    public static void main(String[] args) {

        Integer[] numbers = {78, 65, 125, 11};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers, Comparator.reverseOrder());
        System.out.println(Arrays.toString(numbers));
    }
}
