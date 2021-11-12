package lesson3;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        double a, b, c;

        System.out.println("Вычисление корней квадратного уравнения:");
        System.out.println("a * x ^ 2 + b * x + c = 0");
        System.out.println("Введите коэффициенты a, b и c:");

        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        double discriminant = b * b - 4 * a * c;


        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0");

        } else if (discriminant < 0) {
            System.out.println("Нет действительных решений уравнения");

        } else if (discriminant > 0) {
            double ratio1, ratio2;
            ratio1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            ratio2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Корень ratio1 = " + ratio1 + "," + " корень ratio2 равен " + ratio2);

        }
        /*else if (discriminant >= 0) {
            double ratio;
            ratio = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: ratio = " + ratio);
        }*/


    }
}
