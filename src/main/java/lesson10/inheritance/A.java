package lesson10.inheritance;

public class A {

    private String str = "";

    private static String GLOBAL_STR = "Пример";

//    {
//        str = "Test";
//    }

    static {
        GLOBAL_STR = "";
    }

    public A() {
//        this.str = "Constructor";
        System.out.println("Вызван конструктор класса А");
    }

    protected void print1() {

    }
}
