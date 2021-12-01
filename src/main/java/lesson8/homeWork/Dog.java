package lesson8.homeWork;

public class Dog extends Animals {


    public Dog(String name, int age, String voice) {
        super(name, age, voice);
    }

    public void eat() {
        System.out.println("Любит грызть косточки");
    }
}
