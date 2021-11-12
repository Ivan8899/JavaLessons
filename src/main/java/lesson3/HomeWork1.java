package lesson3;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        double a, b, c;
        double discriminant;


        System.out.println("Вычисление корней квадратного уравнения:");
        System.out.println("a * x ^ 2 + b * x + c = 0");
        System.out.println("Введите коэффициенты a, b и c:");

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первый коэффициент a");
        a = in.nextDouble();
        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0");
            System.out.println("Введите первый коэффициент a");
            a = in.nextDouble();
        }
        System.out.println("Введите второй коэффициент b");
        b = in.nextDouble();
        System.out.println("Введите третий коэффициент c");
        c = in.nextDouble();
        discriminant = ((Math.pow(b, 2)) - (4 * a * c));

        if (discriminant < 0) {
            System.out.println("Нет действительных решений уравнения");
        } else if (discriminant == 0) {
            double ratio = (-b / (2 * a));
            System.out.println("Уравнение имеет единственный корень: ratio = " + ratio);

        } else {
            double rat1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double rat2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Первый корень равен " + rat1 + "," + " второй корень равен " + rat2);

        }

    }
}
