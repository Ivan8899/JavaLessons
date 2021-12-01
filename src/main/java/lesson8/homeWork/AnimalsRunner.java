package lesson8.homeWork;

public class AnimalsRunner {

    public static void main(String[] args) {

        Cat murzik = new Cat("Мурзик",2,"Мяу-мяу!");
        Dog bobik = new Dog("Бобик", 5, "Гав-гав!");
        Parrot kesha = new Parrot("Кеша", 2, "Попка дурак!");

        System.out.println(murzik);
        System.out.println(bobik);
        System.out.println(kesha);
        System.out.println("----------------------------------");

        murzik.beOlder();
        murzik.changeVoice("Ррррррррр!");
        kesha.changeVoice("Свистать всех наверх!");


        System.out.println(murzik);
        System.out.println(bobik);
        System.out.println(kesha);
        System.out.println("-------------------");

        murzik.eat();
        bobik.eat();
        kesha.eat();
    }

}
