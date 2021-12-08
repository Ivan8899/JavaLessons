package hw9;

public final class Truck extends Automobile {
    private static final int MAX_CAR_DISTANCE = 1200;

    public Truck(double distance, String automobileName) {
        super(distance, automobileName);

    }

    public void truckDistance() {
        super.distance = Math.round(Math.random() * 1500);
    }

    public void move() {
        truckDistance();
        if (distance <= MAX_CAR_DISTANCE)
            System.out.println("Грузовой автомобиль " + automobileName + " проехал " + distance + " км.");
        else {
            System.out.println("Грузовой автомобиль " + automobileName
                    + " проехал " + MAX_CAR_DISTANCE + " км и у него закончился бензин.");
        }
    }
}
