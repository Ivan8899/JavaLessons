package lesson2;

public class Lesson2 {

    public static void main(String[] args) {
        System.out.println("Привет мир123!");

        int fistSumma = calculate(20, -40);
        System.out.println(fistSumma);
        int otherSumma = calculate(5, 8);
        System.out.println(otherSumma);

        int secondSumma = summa(5, 8, 6);
        System.out.println(secondSumma);

        int thirdSumma = multiplyAndSumma(5);
        System.out.println(thirdSumma);

        int volume = roomVolume(5, 4, 3);
        System.out.println(volume);

    }

    public static int summa(int arg1, int arg2, int arg3) {
        return (arg1 - arg2) * arg3;
    }

    /**
     * Метод будет складывать два числа и возвращать результат
     * @param arg1  первый аргумент
     * @param arg2  второй аргумент
     * @return  результат чисел
     */
    public static int calculate(int arg1, int arg2) {
        return arg1 + arg2;

    }

    public static int multiplyAndSumma(int arg1) {
        int result = 44 * arg1 + 28;
        result = result -150;
        return result;
    }
    public static int roomVolume(int length, int width, int height) {
        return length * width * height;
    }
}
