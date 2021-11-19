package lesson4;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        System.out.println("Вычисление квадратного корня");
        System.out.println("Введите число для вычисления корня: ");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        System.out.println("Корень квадратный числа " + a + " равен = " + sqrt(a));
    }

    public static double sqrt(double a) {
        double leftPoint = 0;
        double rightPoint = a;
        double middlePoint;
        double secondaryPoint = a;
        for (; ; ) {
            middlePoint = (leftPoint + rightPoint) / 2;
            if (middlePoint == secondaryPoint || middlePoint * middlePoint == a)
                break;
            if (middlePoint * middlePoint < a) {
                leftPoint = middlePoint;
            } else {
                rightPoint = middlePoint;
            }
            secondaryPoint = middlePoint;
        }
        return middlePoint;
    }
}
