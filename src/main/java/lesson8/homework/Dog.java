package lesson8.homework;

public class Dog extends Animals {

    private static final String DOG_CATEGORY = "Бобик";

    public Dog() {
        super(DOG_CATEGORY);
    }

    @Override
    public void voice() {
        System.out.println(this.name + " любит грызть косточки!");
    }
}
