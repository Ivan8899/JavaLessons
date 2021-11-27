package lesson7;

public class Human {
    String name; // null
    String surname; // null
    int age; // 0
    double weight; // 0
    double height; // 0
    Boolean hasQrCode; //null
    boolean male;

    public Human() {
    }

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human(String name, String surname, int age, double weight,
                 double height, Boolean hasQrCode) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.hasQrCode = hasQrCode;
    }

    public void beOlder() {
        this.age++;
    }

    public void beOlder(int age) {
        this.age += age;
    }

    public void vaccinated() {
        this.hasQrCode = true;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public Boolean getHasQrCode() {
        return hasQrCode;
    }

    public boolean isMale() {
        return male;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setHasQrCode(Boolean hasQrCode) {
        this.hasQrCode = hasQrCode;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}
