package lesson6;

import java.util.Scanner;

public class HomeWorkFibonacci2 {
    public static void main(String[] args) {

        System.out.println("Вычисление значения последовательности Фибоначчи: ");
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 0) {
            System.out.println("Введите число больше 0 :");
            System.out.println("Введите число: ");
            in.nextInt();
        }


        if (a > 2 && a <= 11) {
            System.out.println("Для числа = " + a + " число Фибоначчи = " + fibonacciArray(a - 1));
        } else {
            System.out.println("Для числа = " + a + " число Фибоначчи = " + fibonacciTwo(a));
        }
    }


    public static int fibonacciTwo(int a) {
        int b = 0;
        if (a == 1) {
            return b;
        }
        if (a == 2) {
            b = 1;
        }
        return fibonacciTwo(a - 1) + fibonacciTwo(a - 2);
    }


    public static int fibonacciArray(int a) {

        int[] array = new int[11];

        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i <= a; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[a];
    }
}




