package hw10;

import java.util.Scanner;

public class TemperatureConverter implements TemperatureConvertable {

    public static void main(String[] args) {
        System.out.println("Пожалуйста введите число для вычисления градусов по Фаренгейту и Цельсию");
        Scanner console = new Scanner(System.in);
        double gradus = console.nextDouble();


        TemperatureConverter temperatureConverter = new TemperatureConverter();
        temperatureConverter.scaleTemperature(Temperature.CELSIUS);
        System.out.println(gradus + " градусов по Цельсию равно " + TemperatureConvertable.fahrenheit(gradus) +
                " градусов по Фаренгейту");
        System.out.println("------------------------------------------------------------");
        temperatureConverter.scaleTemperature(Temperature.FAHRENHEIT);
        System.out.println(gradus + " градусов по Фаренгейту равно " + TemperatureConvertable.celsius(gradus) +
                " градусов по Цельсию");
    }
}
