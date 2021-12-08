package lesson8.homework;

public class Cat extends Animals {

    private static final String CAT_CATEGORY = "Мурзик";



    public Cat() {
        super(CAT_CATEGORY);
    }

    @Override
    public void voice() {
        System.out.println(this.name + " любит пить молоко!");
    }

}
