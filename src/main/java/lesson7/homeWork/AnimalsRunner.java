package lesson7.homeWork;

public class AnimalsRunner {

    public static void main(String[] args) {
        Cat murka = new Cat("Мурка", 200, false, "Мяу-Мяу!");

        Dog tuzic = new Dog();
        tuzic.name = "Тузик";
        tuzic.running = 700;
        tuzic.swim = 15;
        tuzic.voice = "Гав-Гав!";

        Tiger leon = new Tiger();
        leon.name = "Леон";
        leon.running = 1500;
        leon.swim = 20;
        leon.voice = "Р-р-р-р-р!";


        System.out.println("Умеет ли " + murka.name + " плавать: " + murka.swim);
        System.out.println(murka.name + " пробежала " + murka.running + " метров");
        System.out.println(murka.name + " мяукает : " + murka.voice);
        System.out.println(tuzic.name + " проплыл " + tuzic.swim + " метров");
        System.out.println(tuzic.name + " пробежал " + tuzic.running + " метров");
        System.out.println(tuzic.name + ", голос! : " + tuzic.voice);
        leon.swim();
        System.out.println(leon.name + " проплыл " + leon.swim + " метров");
        leon.run();
        System.out.println(leon.name + " пробежал " + leon.running + " метров");
        leon.voice();
        System.out.println(leon.name + " рычит : " + leon.voice);


    }
}