package lesson4;

import java.util.Scanner;

public class SwitchRunner {
    public static void main(String[] args) {
        System.out.println("Введите цвет светофора: ");
        String color;
        Scanner in = new Scanner(System.in);
        color = in.nextLine();
        System.out.println(getSolutionOfSphetaphore(color));

    }

    public static String getSolutionOfSphetaphore(String color) {
        switch (color) {
            case "красный": {
                return "Проход запрещен!";

            }
            case "жёлтый": {
                return "Внимание!";
            }
            case "зелёный": {
                return "Проход разрешен!";
            }
            default: {
                return "";
            }
        }
    }

}
