package lesson10;

import lesson10.inter.PrintableAndCheckable;

public class Printer extends AbstractPrinter implements PrintableAndCheckable {

    @Override
    public boolean check() {
        return false;
    }

    public Printer() {
        super("консоль");
    }

    @Override
    public void print() {
        System.out.println("Печать из класса " + Printer.class.getName() + " в " + getSourse());
//        System.out.println("Печать из класса" + this.getClass().getName());
    }

    @Override
    public void print ( int index){
        PrintableAndCheckable.super.print(index);
    }

    @Override
    public void otherprint() {

    }
}
