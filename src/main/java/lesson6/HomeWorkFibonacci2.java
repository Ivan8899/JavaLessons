package lesson6;

import java.util.Scanner;

public class HomeWorkFibonacci2 {
    public static void main(String[] args) {
        // Не уверен что правльно сделал задание
        // Мне кажется что это не правильное решение
        System.out.println("Вычисление значения последовательности Фибоначчи:");
        System.out.println("Введите число больше 0 и не более 20");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a < 0 || a > 20) {
            System.out.println("Введите число больше 0 и не более 20");
            in.nextInt();
        }
        System.out.println("Для числа = " + a + " число Фибоначчи = " + fibonacciTwo(a));
        System.out.println("Для числа = " + a + " число Фибоначчи = " + fibonacciArray(a));
    }

    public static int fibonacciTwo ( int a){
        if (a <= 1)
            return a;
        return fibonacciTwo(a - 1) + fibonacciTwo(a - 2);
    }

    public static int fibonacciArray ( int a){
        int[] array = new int[a + 1];

        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i <= a; i++)
            array[i] = array[i - 1] + array[i - 2];

        return array[a];
    }
}
