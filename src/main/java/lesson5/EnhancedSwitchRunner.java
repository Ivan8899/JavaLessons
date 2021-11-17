package lesson5;

public class EnhancedSwitchRunner {
    public static void main(String[] args) {
        String color = "green";
        int index = switch (color) {
            case "red" -> 1;
            case "green" -> 2;
            case "yellow" -> 3;
            default -> -1;
        };
        System.out.println(index);

    }
}
