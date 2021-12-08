package lesson8.homework;

public class Parrot extends Animals {

    private static final String PARROT_CATEGORY = "Попугай Кеша";


    public Parrot() {
        super(PARROT_CATEGORY);
    }

    @Override
    public void voice() {
        System.out.println(this.name + " любит чирикать!");
    }
}
