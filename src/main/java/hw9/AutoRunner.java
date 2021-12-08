package hw9;

public class AutoRunner {
    public static void main(String[] args) {
        Automobile uaz = new Car(500, "УАЗ");
        Automobile lada = new Car(500, "Лада");
        Automobile luaz = new Car(500, "Луаз");
        Automobile volga = new Car(500, "Волга");
        Automobile niva = new Car(500, "Нива");

        Automobile toyota = new Truck(1200, "Газель");
        Automobile hyundai = new Truck(1200, "Газ");
        Automobile generalMotors = new Truck(1200, "Краз");
        Automobile geely = new Truck(1200, "Урал");
        Automobile kamaz = new Truck(1200, "Камаз");


        Automobile[] vehicles = new Automobile[]{uaz, lada, luaz, volga, niva,
                toyota, hyundai, generalMotors, geely, kamaz};
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].move();
        }
    }
}
