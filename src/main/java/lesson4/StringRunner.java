package lesson4;

public class StringRunner {
    public static void main(String[] args) {

        String text = "Война и мир. Начало и конец \\";
        text += ". Новая строка"; //text = text + ". Новая строка";
        System.out.println(text);
        short value = 120;
        value += 545656;
        System.out.println("Значение переменной value = " + value);
    }

}
