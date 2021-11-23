package lesson6;


import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkArrayMaxMinAvg {
    public static void main(String[] args) {
        System.out.println("Ввведи длину массива : ");

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        double[] array = new double[a]; //создаем массив
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);

        double max = array[array.length - 1];
        System.out.println("Максимальное число в массиве : " + max);

        double min = array[0];
        System.out.println("Минимальное число в массиве : " + min);

        System.out.println("Среднее число в массиве : " + avgValue(array,a));





    }

    public static double avgValue(double[] array, int a) {
        double avg = 0;
        int number = 0;
        while (number < array.length) {
            avg += array[number];
            number++;
        }
        avg = avg / a;
        return avg;

    }

}
