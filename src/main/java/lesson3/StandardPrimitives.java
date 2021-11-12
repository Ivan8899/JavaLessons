package lesson3;

import com.sun.jdi.LongValue;

import java.util.logging.Logger;

public class StandardPrimitives {

    public static void main(String[] args) {
        byte argument1 = 127; //  -128....0....127,  256, -2 ^ 7 ... 2 ^ 7 - 1
        short argument2 = 28185; //  -2 ^ 15..0...2 ^ 15 - 1
        int argument3 = 371818181; // -2 ^ 31...0...2 ^ 31 - 1
        int arg = Integer.MAX_VALUE;
        System.out.println(arg);
        long argument4 = 4262626262L; // -2 ^ 63...0...2 ^ 63 - 1

        char symbol = 'Я'; // 16 бит, 0... 2 ^ 16 - 1
        System.out.println(symbol + 1);
        System.out.println((char) 1071);
        System.out.println((char) 320);
        System.out.println((char) 450);
        System.out.println((char) 999);
        char symbol1 = '\'';
        System.out.println(symbol1);

        float floatVolue = 45.28779F;
        double digitWhithPoint = 545455.6;

        boolean flag = true; // истина
        boolean lie = false; // ложь
        boolean valueFalse = 100 == 1_000_000;
        boolean value = 100 != 1_000_000;
        boolean notValue = !value;

        boolean complexAnd = (100 == 100) & (125 == 125); // true = true & true // and
        boolean complexOr = (100 == 100) | (125 == 125); // true = true & true // or

        if (value) {
            System.out.println("Переменная value истина");
        } else {
            System.out.println("Переменная value ложна");
        }

        double floatingPointValue = 1.5;
        if (2.5 == floatingPointValue) {
            System.out.println("2.5 равно " + floatingPointValue);
        } else if (1 == 1) {
            System.out.println("2.5 не равно " + floatingPointValue + " но 1 == 1");
        } else {
            System.out.println("2.5 не равно " + floatingPointValue);
        }

        boolean bool1 = floatingPointValue != 0 && (100 / floatingPointValue == 10);
    }
}
