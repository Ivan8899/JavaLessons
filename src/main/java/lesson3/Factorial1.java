package lesson3;

import java.util.Scanner;

public class Factorial1 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println("Факториал числа " + n + " равен " + result);
    }


}








