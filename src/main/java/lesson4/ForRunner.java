package lesson4;

public class ForRunner {
    public static void main(String[] args) {

        int globalCounter;
        for (int counter = globalCounter = 1, value = 0; counter <= 100 && value <= 500; counter++, value += 5) {
            if (counter % 2 == 0) {
                System.out.println("Текущее значение счетчика counter: " + counter);
                System.out.println("Текущее значение счетчика value: " + value);
                if (counter > 50) {
                    break;
                }

            }
            System.out.println("-------------");
            for (; ; ) {
                System.out.println(globalCounter++);
                if (globalCounter > 50) {
                    break;
                }
            }
        }
    }
}