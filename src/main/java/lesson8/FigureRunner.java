package lesson8;

public class FigureRunner {


    public static void main(String[] args) {
        Figure figure = new Figure(); // null
        Figure figure2 = new Figure(); // null
        figure2.name = "квадрат";


        System.out.println(figure.equals(figure2));


        if (figure == null) {
            boolean equals = figure.equals(null); // false
        }
    }

}
