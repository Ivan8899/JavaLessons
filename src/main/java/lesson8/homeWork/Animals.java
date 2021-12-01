package lesson8.homeWork;

public class Animals {
    private String name;
    private int age;
    private String voice;

    public Animals(String name, int age, String voice) {
        this.name = name;
        this.age = age;
        this.voice = voice;
    }

    public void changeVoice(String newVoice) {
        this.voice = newVoice;
    }


    public void beOlder() {
        this.age++;
    }
    public void toVoice(String newVoice) {
        this.voice = voice;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", voice='" + voice + '\'' +
                '}';
    }
}
