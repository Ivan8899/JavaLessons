package hw10;

public enum Temperature {
    CELSIUS(" градусов Цельсия"), FAHRENHEIT(" градусов Фаренгейта");

    private String name;

    Temperature(String name) {
        this.name = name;
    }

    void printCelsius() {
        System.out.println(CELSIUS);
    }

    void printFahrenheit() {
        System.out.println(FAHRENHEIT);
    }
}
