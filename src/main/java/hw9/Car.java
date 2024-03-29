package hw9;

public final class Car extends Automobile {
    private static final int MAX_CAR_DISTANCE = 500;

    public Car(double distance, String automobileName) {
        super(distance, automobileName);
    }

    public void carDistance() {
        super.distance = Math.round(Math.random() * 1000);
    }


    public void move() {
        carDistance();
        if (distance <= MAX_CAR_DISTANCE)
            System.out.println("Легковой втомобиль " + automobileName + " проехал " + distance + " км.");
        else {
            System.out.println("Легковой втомобиль " + automobileName
                    + " проехал " + MAX_CAR_DISTANCE + " км и у него закончился бензин.");
        }
    }
}
