package lesson7.homeWork;

public class AnimalsRunner {

    public static void main(String[] args) {
        Cat murka = new Cat();
        murka.name = "Мурка";
        murka.running = 50;
        murka.swim = false;
        murka.voice = "Мяу-мяу!";

        Cat vasya = new Cat("Вася",60,true,"Мяу-мяу!");


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


        System.out.println("Умеет ли " + vasya.name + " плавать: " + vasya.swim);
        System.out.println(vasya.name + " пробежала " + vasya.running + " метров");
        System.out.println(vasya.name + " мяукает : " + vasya.voice);
        System.out.println(tuzic.name + " проплыл " + tuzic.swim + " метров");
        System.out.println(tuzic.name + " пробежал " + tuzic.running + " метров");
        System.out.println(tuzic.name + ", голос! : " + tuzic.voice);
        System.out.println(leon.name + " проплыл " + leon.swim + " метров");
        System.out.println(leon.name + " пробежал " + leon.running + " метров");
        System.out.println(leon.name + " рычит : " + leon.voice);


    }
}