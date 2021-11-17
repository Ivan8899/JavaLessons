package lesson5;

import java.util.Scanner;

public class HomeWorkFibonacci {

    public static void main(String[] args) {


        System.out.println("Вычисление значения последовательности Фибоначчи:");
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(fibonacci(a));
        System.out.println("Сумма чисел Фибоначчи с использованием рекурсии: " + fibonacci(a));
        System.out.println("Выведем по порядку значение последовательности Фибоначчи числа 11 :");
        System.out.println(fib(11));
    }

    public static int fibonacci(int a) {
        if (a == 0) {
            return 0;
        } else if (a == 1) {
            return 1;
        } else {
            return fibonacci(a - 1) + fibonacci(a - 2);   //f(n) = f(n-1) + f(n-2)  f>=0
        }

    }

    public static int fib(int arg) {
        int f1 = 0;
        int f2 = 1;
        int f3;
        System.out.print(f1 + " " + f2 + " ");
        for (int i = 0; i <= arg; i++) {
            f3 = f1 + f2;
            System.out.print(f3 + " ");
            f1 = f2;
            f2 = f3;
        }

        return f1;
    }

}
