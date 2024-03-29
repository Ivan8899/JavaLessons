package lesson3;

import java.util.Scanner;


public class Factorial2 {
    public static void main(String[] args) {

        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Факториал " + n + "!" + " с использованием рекурсии равен " + factorial(n));

    }

    public static int factorial(int n) {
        if (n <= 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}