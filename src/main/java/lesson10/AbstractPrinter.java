package lesson10;

public abstract class AbstractPrinter {

    private String sourse;

    public AbstractPrinter(String intro) {
        this.sourse = intro;
    }

    public String getSourse() {
        return sourse;
    }
}
