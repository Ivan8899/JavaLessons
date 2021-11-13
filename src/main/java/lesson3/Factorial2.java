package lesson3;

import org.w3c.dom.ls.LSOutput;


public class Factorial2 {
    public static void main(String[] args) {

        System.out.println("Факториал 5! с использованием рекурсии равен " + factorial(5));

    }

    public static int factorial(int n) {
        if (n <= 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

}