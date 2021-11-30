package lesson6;

import java.util.Scanner;

public class HomeWorkFibonacci2 {
    public static void main(String[] args) {
        int arrayLength = 50;
        long[] fibonacciArray = new long[arrayLength];
        fibonacciArray[0] = 1;
        fibonacciArray[1] = 1;
        System.out.println("Приветсвтуем, уважаемый пользователь");
        int lastIndex = 2;
        while (true) {
            int index = getFibonacciIndex(arrayLength);
            long result;
            if (fibonacciArray[index] == 0) {
                fillFibonacciArray(fibonacciArray, lastIndex, index);
            }
            result = fibonacciArray[index];
            System.out.printf("Число стоящее на %d индексе имеет значение %d\n", index, result);
        }
    }

    private static void fillFibonacciArray(long[] fibonacciArray, int lastIndex, int index) {
        System.out.printf("Значение с индексом %d было расчитано и размещено в кэшэ\n", index);
        for (int i = lastIndex; i <= index; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }
    }

    private static int getFibonacciIndex(int maxIndex) {
        System.out.println("Введите позицию в ряде Фибоначчи как целое число:");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            String command = scanner.next();
            if ("exit".equalsIgnoreCase(command)) {
                System.out.println("Спасибо за участие в программе!");
                System.exit(0);
            }
            System.out.println("Простите, но ввод значения подразумевает целое число");
            scanner.next();
        }
        int length = scanner.nextInt();
        if (length < 0) {
            System.out.printf("Вы указали отрицательное значение: %d, что не допустимо\n", length);
            return getFibonacciIndex(maxIndex);
        } else if (length >= 50) {
            System.out.printf("Вы указали значение большее, чем %d, что не допустимо\n", maxIndex);
            return getFibonacciIndex(maxIndex);
        }
        return length;
    }
}
