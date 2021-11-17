package lesson5;

import java.util.Scanner;

public class AdvancedScannerRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите пожалуйста число: ");
        while (!scanner.hasNextInt()) {
            String text = scanner.next();
            System.out.println("Ожидется целое число, а вы ввели неподхощее " + text);

        }
        int index = scanner.nextInt();
        System.out.println("Наконец-то введено целое значеие " + index);

    }
}
