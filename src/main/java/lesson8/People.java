package lesson8;

public class People {

    public static void main(String[] args) {

        Human me = new Male("Иванов Виталий Андреевич", 33, "руссский");
        Human nataliyaIvanovna = new Female("Петрова Наталья Ивановна", 25, "русская");

        me.beOlder();
        nataliyaIvanovna.changeNationality("немка");
        me.changeName("Иванов Виталий");
        nataliyaIvanovna.changeName("Ангела Меркель");
        nataliyaIvanovna.setAge(67);
        System.out.println(me);
        System.out.println(nataliyaIvanovna);
        Human[] people = new Human[]{me, nataliyaIvanovna};
        for (Human human : people) {
            human.setAge(40);
        }
        System.out.println("--------------------------------------");
        System.out.println(me);
        System.out.println(nataliyaIvanovna);

        ((Male) me).drive();
        ((Female) nataliyaIvanovna).cook();


        System.out.println("--------------------------------------");
        Female ninaPetrovna = new Female("Сидорова Нина Петровна", 25, "русская");
        ((Female) nataliyaIvanovna).changeName(ninaPetrovna);
        System.out.println(ninaPetrovna);

    }
}
