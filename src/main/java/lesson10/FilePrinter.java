package lesson10;

import lesson10.inter.Printable;

public class FilePrinter extends AbstractPrinter implements Printable {

    public FilePrinter() {
        super("файл");
    }

    @Override
    public void print() {
        //TODO: размещения текста в файле

    }
}
