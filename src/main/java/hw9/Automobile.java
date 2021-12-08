package hw9;

public abstract class Automobile {

    protected double distance;
    protected String automobileName;

    public Automobile(double distance, String automobileName) {
        this.distance = distance;
        this.automobileName = automobileName;
    }

    public abstract void move();
}
