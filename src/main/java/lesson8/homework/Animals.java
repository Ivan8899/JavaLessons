package lesson8.homework;

public abstract class Animals {
    protected final String name;

    public Animals(String name) {
        this.name = name;
    }


    public abstract void voice();

}
