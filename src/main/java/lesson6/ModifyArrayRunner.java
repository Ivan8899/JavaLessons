package lesson6;

import java.util.Arrays;

public class ModifyArrayRunner {
    public static void main(String[] args) {

        int[] digits = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] anotherDigit = new int[digits.length + 1];
        int[] anotherDigit = digits;
        for (int index = 0; index < anotherDigit.length; index++) {
            anotherDigit[index] += 10;
        }
        System.out.println(Arrays.toString(anotherDigit));
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println(Arrays.toString(digits));

    }


}
