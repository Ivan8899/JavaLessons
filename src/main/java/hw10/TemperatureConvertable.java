package hw10;

public interface TemperatureConvertable {

    static double fahrenheit(double fahrenheit) {
        return ((9 / 5.0) * fahrenheit) + 32;
    }

    static double celsius(double celsius) {
        return (celsius - 32) * 5 / 9;
    }

    default void scaleTemperature(Temperature temperature) {
        switch (temperature) {
            case CELSIUS -> {
                System.out.println("Перевод из Цельсия в Фаренгейт:");
            }
            case FAHRENHEIT -> {
                System.out.println("Перевод из Фаренгейта в Цельсий");
            }
        }
    }
}
