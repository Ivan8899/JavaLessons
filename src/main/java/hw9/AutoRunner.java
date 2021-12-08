package hw9;

public class AutoRunner {
    public static void main(String[] args) {
        Automobile uaz = new Car(500, "УАЗ");
        Automobile lada = new Car(500, "Лада");
        Automobile luaz = new Car(500, "Луаз");
        Automobile volga = new Car(500, "Волга");
        Automobile niva = new Car(500, "Нива");

        Automobile gazel = new Truck(1200, "Газель");
        Automobile gaz = new Truck(1200, "Газ");
        Automobile kraz = new Truck(1200, "Краз");
        Automobile ural = new Truck(1200, "Урал");
        Automobile kamaz = new Truck(1200, "Камаз");


        Automobile[] vehicles = new Automobile[]{uaz, lada, luaz, volga, niva,
                gazel, gaz, kraz, ural, kamaz};
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].move();
        }
    }
}
