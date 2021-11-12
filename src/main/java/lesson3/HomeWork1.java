package lesson3;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        double a, b, c;


        System.out.println("Вычисление корней квадратного уравнения:");
        System.out.println("a * x ^ 2 + b * x + c = 0");
        System.out.println("Введите коэффициенты a, b и c:");

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первый коэффициент");
        a = in.nextDouble();
        System.out.println("Введите второй коэффициент");
        b = in.nextDouble();
        System.out.println("Введите третий коэффициент");
        c = in.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant == 0) {
            double ratio;
            ratio = (int) (-b / (2 * a));
            System.out.println("Уравнение имеет единственный корень: ratio = " + ratio);

        } else if (discriminant > 0) {
            double ratio1, ratio2;
            ratio1 = (float) (-b + Math.sqrt(discriminant)) / (2 * a);
            ratio2 = (float) (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Корень ratio1 = " + ratio1 + "," + " корень ratio2 равен " + ratio2);

        } else if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0");

        } else if (discriminant < 0) {
            System.out.println("Нет действительных решений уравнения");

        }


    }
}
