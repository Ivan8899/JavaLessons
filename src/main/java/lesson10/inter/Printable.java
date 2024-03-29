package lesson10.inter;

import lesson10.enumrattion.Language;

public interface Printable {
    int INDEX = 1;


    void print();

    static void print(String str) {
        System.out.println(str);
    }

    default void print(int index) {
        print("");

    }

    default void printHelloWorld(Language language) {
        switch (language) {
            case RUSSIAN -> System.out.println("Привет, мир");
            case ENGLISH -> System.out.println("Hello world");
            case GERMAN -> System.out.println("Hello Well");
            case FRENCH -> System.out.println("Salut le monte");
        }
    }
}
