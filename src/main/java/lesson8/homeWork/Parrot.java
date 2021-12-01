package lesson8.homeWork;

public class Parrot extends Animals {


    public Parrot(String name, int age, String voice) {
        super(name, age, voice);
    }

    public void eat() {
        System.out.println("Кушает только фрукты");
    }

    public void changeVoice(String newVoice) {
        super.changeVoice(newVoice);
        System.out.println("Кеша закричал!");
    }

}
