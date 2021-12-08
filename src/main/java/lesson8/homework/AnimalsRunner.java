package lesson8.homework;

public class AnimalsRunner {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();
        Parrot parrot = new Parrot();

        Animals[] animals = new Animals[]{cat, dog, parrot};
        for (Animals animal : animals) {
            animal.voice();
        }
    }

}
