package lesson2;

public class Lesson2 {

    public static void main(String[] args) {
        System.out.println("Привет мир123!");

        int fistSumma = calculate(20, -40);
        System.out.println("Сумма чисел 20 и -40 равна " + fistSumma);

        int otherSumma = calculate(5, 8);
        System.out.println("Сумма чисел 5 и 8 равна " + otherSumma);

        int secondSumma = summa(5, 8, 6);
        System.out.println("Сумма выражения (5 - 8) * 6 равна " + secondSumma);

        int thirdSumma = multiplyAndSumma(5);
        System.out.println("Сумма метода multiplyAndSumma равна " + thirdSumma);

        int volume = roomVolume(5, 4, 3);
        System.out.println("Объем квартиры в метрах кубических равен " + volume);

        double div = division(35, 3);
        System.out.println("Сумма деления 35 на 3 равна " + div);

        int operand = 42;
        double div1 = division1(operand, 4);
        System.out.println("Сумма деления " + operand + " на 4 равна " + div1);

        int result = pow(3, 5);
        System.out.println("Возведение в степень чилса 3 в степень 5 = " + result);

        int powrun = mod(21,5);
        System.out.println("Остаток на деления числа 21 на 5 равен " + powrun);
    }

    public static int summa(int arg1, int arg2, int arg3) {
        return (arg1 - arg2) * arg3;
    }

    /**
     * Метод будет складывать два числа и возвращать результат
     *
     * @param arg1 первый аргумент
     * @param arg2 второй аргумент
     * @return результат чисел
     */
    public static int calculate(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public static int multiplyAndSumma(int arg1) {
        int result = 44 * arg1 + 28;
        result = result - 150;
        return result;
    }

    public static int roomVolume(int length, int width, int height) {
        return length * width * height;
    }

    public static double division(int a, int b) {
        return (double) a / b;
    }

    public static double division1(double a, double b) {
        return a / b;
    }

    public static int mod(int i, int i1) {
        return i % i1;
    }

    public static int pow(int i, int i1) {
        return (int) Math.pow(i, i1);
    }

}
