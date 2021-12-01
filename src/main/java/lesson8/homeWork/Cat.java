package lesson8.homeWork;

public class Cat extends Animals {


    public Cat(String name, int age, String voice) {
        super(name, age, voice);
    }

    public void changeVoice(String newVoice) {
        super.changeVoice(newVoice);
        System.out.println("Мурзик стал рычать");
    }

    public void eat() {
        System.out.println("Любит пить молоко");
    }


}
